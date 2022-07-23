package Ui.pages.newAccountPage;

import Ui.conctants.enums.NewAccountsPage.NewAccountPageEnumDropDownLocators;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDown {
    private SelenideElement dropDown;

    public DropDown(NewAccountPageEnumDropDownLocators newAccountPageEnumDropDownLocator) {
        dropDown = $(newAccountPageEnumDropDownLocator.getLocator());
    }

    public void select(String option){

        SelenideElement ef = $(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox/div//button",option)));

    }
}
