package Ui.wrapers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button {
    private SelenideElement button;
    public Button (By locator){
        button=$(locator);
    }

    public void Click (){
        button.click();
    }
}
