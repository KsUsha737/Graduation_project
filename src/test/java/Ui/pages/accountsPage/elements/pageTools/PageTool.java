package Ui.pages.accountsPage.elements.pageTools;

import Ui.wrapers.Button;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class PageTool{
    private final SelenideElement link;
    private final String text;

    public PageTool(SelenideElement ele){
        link= ele.$(By.xpath("a/parent::*"));
        text=ele.$(By.xpath("a/div")).getText();
    }

    public void click(){
        link.click();
    }

    public String getText(){
        return text;
    }
}
