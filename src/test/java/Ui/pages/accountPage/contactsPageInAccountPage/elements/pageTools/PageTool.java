package Ui.pages.accountPage.contactsPageInAccountPage.elements.pageTools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
/**
 * actions with right menu tools
 */
@Log4j2
@Getter
public class PageTool {

    private final SelenideElement link;
    private final String text;

    public PageTool(SelenideElement el) {
        link = el.$(By.xpath("a/parent::*"));
        text = el.$(By.xpath("a/div")).getText();
    }

    public void click() {
        link.shouldNotBe(Condition.hidden).shouldBe(Condition.visible).click();
    }

    public String getText() {
        return text;
    }
}


