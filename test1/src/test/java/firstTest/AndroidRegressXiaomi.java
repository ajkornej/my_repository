package firstTest;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AndroidRegressXiaomi {

    private AndroidDriver driver;
    private Object addAction;


    @Before
    public void beforeMethod() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("a010c185")
                //.setPlatformVersion("13 TKQ1.220829.002")
                .setAppPackage("com.looky.app")
                .setAppActivity("com.looky.app.MainActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723/"), options.setAppPackage("com.looky.app"));

    }

    @After
    public void afterMethod() {

        driver.quit();
    }

    @Test
    public void Autorisation() throws InterruptedException, MalformedURLException {


        driver.closeApp();
        driver.launchApp();

        System.out.print("Done");

        // Переход по ссылке "Have a questions or need help?"



        // Переход по ссылке "Terms&Conditions"



        // Авторизация через Google
    }


    @Test
    void Feed() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();

        // Окно с подсказкой

    }

    @Test
    void Messenger() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();

        // Переход в мессенджер

        // Создание чата (в мессенджере нет чатов)

        // Создание чата (в мессенджере уже есть ранее созданные чаты)

        // Отправка сообщения

        // Удаление чата

        // Смена профиля в мессенджере

        // Каунтер непрочитанности чатов

        // Каунтер мессенджера на страницах FEED и MyProfile

        // Сообщение со ссылкой


    }

    @Test
    void StoryFeed() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();


        // Просмотр историй

        // Переход в профиль пользователя по клику на аватарку или никнейм из истории

        // Кнопка выхода из просмотра истории - "Х"

        // Переход на страницу просмотра истории с ленты постов

        // Переход на страницу просмотра истории с профиля пользователя

        // Переход на страницу просмотра истории с мессенджера

    }


        @Test
    void Discovery() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();


        // Окно с подсказкой

        // Поиск пользователя

        // Поиск по хештегам

        // Проверка на удалённый аккаунт

        // Создание чата с профилем из поиска

        // Выбор рекомендованного поста

        // Long-tap на иконку медиа


    }

    @Test
    void CAMERA() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();

        //Создание поста с использованием основной камеры

        // Создание поста с использованием фронтальный камеры

        // Создание истории с использованием основной камеры

        // Создание истории с использованием фронтальной камеры

        // Создание поста с использованием фронтальной камеры с редактированием в imgly

        // Создание поста с основной камеры с длительным видео (более 30-45 секунд) с редактированием в imgly

        // Создание истории с основной камеры с длительным видео (более 30-45 секунд) с редактированием

        // Создание поста с фронтальной камеры с длительным видео (более 30-45 секунд) с редактированием

        // Создание истории с фронтальной камеры с длительным видео (более 30-45 секунд) с редактированием

        // Создание поста с основной камеры с длительным видео (более 30-45 секунд) без редактирования в imgly

        // Создание истории с основной камеры с длительным видео (более 30-45 секунд) без редактирования

        // Создание поста с фронтальной камеры с длительным видео (более 30-45 секунд) без редактирования


    }

    @Test
    void CreatePost() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();

        // Создание поста с 1 фото без редактирования в img.ly и добавления текста/ссылки/отметки людей/места/хештэга/категории

        // Создание поста с 1 фото с редактированием в img.ly и с добавлением текста/ссылки/отметки людей/места/хештэга/категории

        // Создание поста с несколькими ассетами с редактированием в img.ly и с добавлением текста/ссылки/отметки людей/места/хештэга

        // Создание поста с длительным и тяжелым видео без редактирования

    }

    @Test
    void CreateStory() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();


        // Создание истории с 1 фото без редактирования

        // Создание истории с несколькими фото без редактирования

        // Создание истории с 1 видео без редактирования

        // Создание истории с 1 фото с редактированием и добавлением стикера текст/локация/отметка

        // Создание истории с 1 видео с редактированием и добавлением стикера текст/локация/отметка

        // Создание истории с несколькими фото с редактированием и добавлением стикера текст/локация/отметка


    }

    @Test
    void PostFeed() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();


        // Geo-Feed

        // просмотр списка лайкнувших пост

        // Переход в профиль пользователя по клику на аватарку или никнейм

        // Возвращение к началу ленты нажатием на иконку фида (домик) в тапбаре

        // External Link

        // Переход к комментариям

        // Burger menu

        // Переход на профиль по нажатию на кнопку папки (категории)

        // Расшариить пост в свою историю

        // Расшар поста в мессенджер

    }

    @Test
    void Comments() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();

    }

    @Test
    void Heshtag() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();

    }

    @Test
    void OtherUserProfile() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();



    }

    @Test
    void OtherUserProfileMenu() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();



    }

    @Test
    void MyProfile() throws InterruptedException, MalformedURLException {

        driver.closeApp();
        driver.launchApp();



    }

}
