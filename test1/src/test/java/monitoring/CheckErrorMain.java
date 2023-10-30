package monitoring;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CheckErrorMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            // Запускаем ваш набор тестов
            runTests();

            // Ждем 1 час перед следующим запуском тестов
            Thread.sleep(3600000); // 1 час = 3600 000 миллисекунд
        }
    }

    public static void runTests() {
        // Здесь запускайте ваш набор тестов, например, с использованием JUnit

        Result result1 = JUnitCore.runClasses(CheckErrorFeed.class);
        Result result2 = JUnitCore.runClasses(CheckErrorDiscovery.class);

        if (result1.wasSuccessful() && result1.wasSuccessful()) {
            System.out.println("\n Тесты пройдены успешно");
        } else {

            for (Failure failure : result1.getFailures()) {
                System.err.println("Ошибка в фиде \n" + failure.toString());


                // Запуск MyTelrgramBot
                MyTelegramBot teleg = new MyTelegramBot();
                String chatId = "877288317";
                teleg.sendErrorMessageToUser(chatId);


            }
            for (Failure failure : result2.getFailures()) {
                System.err.println("Ошибка в Дискавери \n" + failure.toString());
            }
        }
    }
}


