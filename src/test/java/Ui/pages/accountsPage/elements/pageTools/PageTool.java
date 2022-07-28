package Ui.pages.accountsPage.elements.pageTools;

import Ui.wrapers.Button;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

/**
 * действия с инструментами правого меню
 */
@Log4j2
@Getter
public class PageTool {
    private final SelenideElement link;
    private final String text;

    public PageTool(SelenideElement ele) {
        link = ele.$(By.xpath("a/parent::*"));
        text = ele.$(By.xpath("a/div")).getText();
    }

    public void click() {
        link.shouldNotBe(Condition.hidden).shouldBe(Condition.visible).click();
    }

    public String getText() {
        return text;
    }
}
