package Ui.wrapers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Link {
    private SelenideElement link;
    public Link (By locator){
        link=$(locator);
    }

    public void Click (){
        link.click();
    }
}
