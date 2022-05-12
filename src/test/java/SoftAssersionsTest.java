import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssersionsTest {

    @Test
        void  jUnit5ExampleShouldBySoftAssertions()   {
        Configuration.browserSize="1920x1080";
        // open repository page
    open("https://github.com/selenide/selenide");
    //go to wiki page
        $("#wiki-tab").click();
        //find page
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        //check JUnit 5 code
        $(".markdown-body").shouldBe(text("JUnit5 extension"), text("Using JUnit5 extend test class"));
    }
}
