import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
        void  dragAndDropTest()   {
        Configuration.browserSize="1920x1080";
        // open page
    open("https://the-internet.herokuapp.com/drag_and_drop");
        //change elements
        $("#column-a").dragAndDropTo($("#column-b"));
        //check change elements
        $("#column-a").shouldBe(text("B"));
        $("#column-b").shouldBe(text("A"));
    }

    @Test
    void actionsTest(){
        Configuration.browserSize="1920x1080";
        // open page
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //change elements
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release();
        //check change elements
        $("#column-a").shouldBe(text("B"));
        $("#column-b").shouldBe(text("A"));
    }
}
