package regress;

import monitoring.MyTelegramBot;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class RegressMain {
    public static void main(String[] args) {

        Result result1 = JUnitCore.runClasses(Authorization.class);
        Result result2 = JUnitCore.runClasses(Messenger.class);
        Result result3 = JUnitCore.runClasses(CreateStory.class);

        if (result1.wasSuccessful() && result2.wasSuccessful()) {
            System.out.println("\n Все тесты пройдены успешно");
        } else {
            for (Failure failure : result1.getFailures()) {
                System.err.println("Ошибка в тесте (Authorization):\n" + failure.toString());


                // Запуск MyTelrgramBot
                MyTelegramBot teleg = new MyTelegramBot();
                String chatId = "877288317";
                teleg.sendErrorMessageToUser(chatId);

            }
            for (Failure failure : result2.getFailures()) {
                System.err.println("Ошибка в тесте (Messenger):\n" + failure.toString());
            }
            for (Failure failure : result3.getFailures()) {
                System.err.println("Ошибка в тесте (CreateStory):\n" + failure.toString());
            }

        }

    }
}
