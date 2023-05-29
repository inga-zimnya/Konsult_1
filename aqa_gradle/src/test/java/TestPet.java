import io.qameta.allure.Description;
import org.example.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TestPet {
    Pet pet = new Pet();
    @Test
    @DisplayName("Тест имени")
    @Description("Тестирование имени")
    public void testName(){
        Assertions.assertEquals("Тузик", pet.getName(), "Имя не совпало, получили " + pet.getName());
    }

    @Test
    @DisplayName("Тест открытия страницы")
    @Description("Тестирование страницы")
    public void testOpenPage(){
        open("https://google.com");
        TestSteps.something();
        TestSteps.notSomething();

    }
}
