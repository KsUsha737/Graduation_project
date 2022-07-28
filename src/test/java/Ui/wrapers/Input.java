package Ui.wrapers;

import Ui.pages.LoginPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Input {
    String text;

    private SelenideElement input;

    public Input(By locator) {
        input = $(locator);
    }

    public LoginPage fill(String text) {
        input.scrollIntoView(true).sendKeys(text);
        return new LoginPage();
    }

    public void write(String text) {

    }

}
