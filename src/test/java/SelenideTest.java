import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {
    private WebDriver driver;


    @Test
    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {

        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void shouldSendForm1() {

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Владивосток");
        $(".icon-button__content").click();
        $x("//div[@data-step ='1']").click();
        $x("//td[@data-day='1651327200000']").click();
        $x("//input[@name= 'name']").val("Петр Петров");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm2() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Санкт-Петербург");
        $(".icon-button__content").click();
        $x("//div[@data-step ='12']").click();
        $x("//td[@data-day='1681048800000']").click();
        $x("//input[@name= 'name']").val("Константин Иванов");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm3() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Йошкар-Ола");
        $(".icon-button__content").click();
        $x("//div[@data-step ='12']").click();
        $x("//div[@data-step ='1']").click();
        $x("//td[@data-day='1683295200000']").click();
        $x("//input[@name= 'name']").val("Петров Петр");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm4() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Горно-Алтайск");
        $(".icon-button__content").click();
        $x("//div[@data-step ='12']").click();
        $x("//div[@data-step ='-1']").click();
        $x("//div[@data-step ='-1']").click();
        $x("//td[@data-day='1675260000000']").click();
        $x("//input[@name= 'name']").val("Петров Петр");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm5() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Сыктывкар");
        $(".icon-button__content").click();
        $x("//div[@data-step ='12']").click();
        $x("//div[@data-step ='1']").click();
        $x("//div[@data-step ='-12']").click();
        $x("//td[@data-day='1651759200000']").click();
        $x("//input[@name= 'name']").val("Петров Петр");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm6() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Салехард");
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").val("11.12.2023");
        $x("//input[@name= 'name']").val("Петров Петр");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm7() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Москва");
        $x("//input[@placeholder ='Дата встречи']").doubleClick();
        $x("//input[@placeholder ='Дата встречи']").sendKeys(Keys.BACK_SPACE);
        $x("//input[@placeholder ='Дата встречи']").val("11.12.2023");
        $x("//input[@name= 'name']").val("Петров Константин");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm8() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Владивосток");
        $(".icon-button__content").click();
        $x("//div[@data-step ='1']").click();
        $x("//td[@data-day='1651327200000']").click();
        $x("//input[@name= 'name']").val("Андрей Ю");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm9() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Владивосток");
        $(".icon-button__content").click();
        $x("//div[@data-step ='1']").click();
        $x("//td[@data-day='1651327200000']").click();
        $x("//input[@name= 'name']").val("Петров Петр");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

    @Test

    public void shouldSendForm10() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Горно-Алтайск");
        $(".icon-button__content").click();
        $x("//div[@data-step ='12']").click();
        $x("//div[@data-step ='-1']").doubleClick();
        $x("//td[@data-day='1675260000000']").click();
        $x("//input[@name= 'name']").val("Петров Петр");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }

}