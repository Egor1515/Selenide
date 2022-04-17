import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {

    @Test
    public void shouldSendForm1() {

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x900";
        open("http://localhost:7777/");
        $x("//input[@placeholder = 'Город']").val("Санкт-Петербург");
        $(".icon-button__content").click();
        $x("//div[@data-step ='1']").click();
        $x("//td[@data-day='1651327200000']").click();
        $x("//input[@name= 'name']").val("Петр Петров-Константинов");
        $x("//input[@name= 'phone']").val("+79148141312");
        $(".checkbox__box").click();
        $(withText("Забронировать")).click();
        $(".notification__title").should(Condition.visible, Duration.ofSeconds(15));

    }
}
