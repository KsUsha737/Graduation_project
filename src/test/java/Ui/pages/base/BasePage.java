package Ui.pages.base;

import Ui.conctants.enums.AppsEnum;
import Ui.pages.AppNavBar;
import Ui.pages.SalesPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage extends AppNavBar {

    public BasePage() {
        super();
    }

    private void goToApp(AppsEnum app) {
        $(By.xpath("//span[text()='App Launcher']//ancestor::button")).click();
        $(By.xpath("//one-app-launcher-menu/div/lightning-button/button")).click();
        $(By.xpath(String.format("//p[text()='%s']", app.getTitle()))).click();
    }

    public SalesPage goToSalesPage() {
        goToApp(AppsEnum.SALES);
        return new SalesPage();
    }

    //Здесь можно добавлять методы для перехода к другим приложениям*

}
