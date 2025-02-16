package ru.skillfactory.qajava;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {

    @DataProvider(name = "teenagerData")
    public Object[][] teenagerData() {
        return new Object[][]{
                {13, true},  // ✔ Должен вернуть true
                {15, true},  // ✔ Должен вернуть true
                {19, true},  // ❌ Ошибка в коде (метод вернет false)
                {12, false}, // ❌ Ошибка в коде (метод вернет true)
                {20, false}, // ✔ Должен вернуть false
                {5, false},  // ✔ Должен вернуть false
                {17, true}   // ✔ Должен вернуть true
        };
    }

    @Test(dataProvider = "teenagerData")
    public void testIsTeenager(int age, boolean expected) {
        boolean result = Person.isTeenager(age);
        Assert.assertEquals(result, expected, "Ошибка для возраста: " + age);
    }
}
