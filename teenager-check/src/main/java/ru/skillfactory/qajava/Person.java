package ru.skillfactory.qajava;

public class Person {public static boolean isTeenager(int age) {
    boolean result;
    if (age < 19) {  // ❌ Ошибочное условие!
        result = true;
    } else {
        result = false;
    }
    return result;
}
}
