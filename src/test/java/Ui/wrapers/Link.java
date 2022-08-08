package Ui.wrapers;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Link {
    private SelenideElement link;
    @Getter
    private String title;

    public Link (By locator){
        link=$(locator);
    }

    public Link (By locator, SelenideElement element){
        link=element.$(locator);
        title=link.getText();
    }

    public void click(){
        link.click();
    }
}
