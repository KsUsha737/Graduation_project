package Ui.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class NavItem {

    private SelenideElement link;
    private String text;

    public NavItem(SelenideElement el) {
        link = el.$(By.xpath("a/parent::*"));
        text = el.$(By.xpath("a/span")).getText();
    }

    public void click() {
        link.click();
    }

    public String getText() {
        return text;
    }
}