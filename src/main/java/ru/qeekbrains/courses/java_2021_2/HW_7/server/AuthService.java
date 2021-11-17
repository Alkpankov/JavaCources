package ru.qeekbrains.courses.java_2021_2.HW_7.server;

/**
 * сервис аутеннтификации
 */

public interface AuthService {

    /**
     * Запустить серис
     */

    void start();

    /**
     * Отключить сервис
     */

    void stop();

    /**
     * Получить никнейм
     * @param login
     * @param pass
     * @return никнейм если найден или null, если такого нет
     */

    String getNickByLoginAndPass(String login, String pass);
}
