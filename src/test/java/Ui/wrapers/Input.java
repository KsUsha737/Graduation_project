package Ui.wrapers;

import Ui.pages.LoginPage;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Input {
    @Getter
    String text;

    private SelenideElement input;

    public Input(By locator) {
        input = $(locator);
        text = input.getAttribute("value");
    }

    public void fill(String text) {
        input.clear();
        input.scrollIntoView(true).sendKeys(text);
    }

}
