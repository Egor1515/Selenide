import com.beust.ah.A;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.time.Duration;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {
    DataGenerator gen = new DataGenerator();

    @Test
    public void shouldSendForm1() {
        String planningDate = gen.generateDate(4);

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $("[data-test-id='city'] input").val("Санкт-Петербург");
        $("[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME),Keys.BACK_SPACE);
        $("[data-test-id='date'] input").setValue(planningDate);
        $("[data-test-id='name'] input").val("Петр Петров-Константинов");
        $("[data-test-id='phone'] input").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));
        $(".notification__content").shouldHave(Condition.text("Встреча успешно забронирована на " + planningDate), Duration.ofSeconds(15));


    }
}
