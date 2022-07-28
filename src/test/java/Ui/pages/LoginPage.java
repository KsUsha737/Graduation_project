package Ui.pages;

import Ui.pages.base.BasePage;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import utils.PropertiesKeys;
import utils.PropertyReader;
@Log4j2
public class LoginPage {
    Input usernameField = new Input(By.xpath("//input[@id='username']"));
    Input passwordField = new Input(By.id("password"));
    Button loginButton = new Button(By.id("Login"));

    @Step("Login with standard user")
    public BasePage login() {
        log.info("Login with standard user");
        usernameField.fill(PropertyReader.getProperty(PropertiesKeys.LOGIN));
        passwordField.fill(PropertyReader.getProperty(PropertiesKeys.PASSWORD));
        loginButton.click();
        return new BasePage();
    }

    @Step("Login with username and password")
    public BasePage login(String username, String password) {
        log.info("login with given parameters");
        usernameField.fill(username);
        passwordField.fill(password);
        loginButton.click();
        return new BasePage();
    }

}
