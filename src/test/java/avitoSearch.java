import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.TypeOptions.text;

public class avitoSearch {

    @Test

    void avitoSearch() {

        Configuration.pageLoadStrategy = "eager"; //добавить перед всеми автотестами в селенид

        open("https://www.google.com");

    Selenide.sleep(1500);
    $x("//*[@class='gLFyf']").setValue("Avito").pressEnter();
    Selenide.sleep(1500);
    $("[id=search]").shouldHave(Condition.text("www.avito.ru")); //проверяем присутствие текста
    $x("//*[@href='https://www.avito.ru/']").click();
    Selenide.sleep(1500);
    $x("//*[@data-marker='header/login-button']").click();
    Selenide.sleep(1500);
    $x("//*[@data-marker='registration-link']").click();
    Selenide.sleep(1500);
    $x("//*[@name='username']").setValue("9220376889");
    Selenide.sleep(1500);
    $x("//*[@class='css-19geruh']").click();
    Selenide.sleep(1500);
    $x("//*[@data-marker='auth-app-root']").shouldHave(Condition.text("Запомнить пароль"));
    //проверяем присутсвие текста
    Selenide.sleep(1500);
    $x("//*[@data-marker='auth-app/close']").click();
    Selenide.sleep(1500);
    $x("//*[@class='main-textWrapper-svdf1']").click();
    Selenide.sleep(1500);
    $x("//*[@data-marker='popup-location/region/clearButton']").click();
    Selenide.sleep(1500);
    $x("//*[@data-marker='popup-location/region/search-input']").setValue("Москва");
    Selenide.sleep(1500);
    Selenide.actions().sendKeys(Keys.ESCAPE).perform(); //esaspe нажатие
    Selenide.sleep(1500);
    $x("//*[@data-marker='search-form/suggest']").setValue("Автомобили").pressEnter();
    Selenide.sleep(1500);
    $x("//*[@data-marker='top-rubricator/all-categories']").click();
    Selenide.sleep(1500);




    }
}
