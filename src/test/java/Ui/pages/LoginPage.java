package Ui.pages;

import Ui.pages.base.BasePage;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import org.openqa.selenium.By;
import utils.PropertiesKeys;
import utils.PropertyReader;

public class LoginPage {
    Input usernameField = new Input(By.xpath("//input[@id='username']"));
    Input passwordField = new Input(By.id("password"));
    Button loginButton = new Button(By.id("Login"));

    public BasePage login() {
        usernameField.fill(PropertyReader.getProperty(PropertiesKeys.LOGIN));
        passwordField.fill(PropertyReader.getProperty(PropertiesKeys.PASSWORD));
        loginButton.Click();
        return new BasePage();
    }

    public BasePage login(String username, String password) {
        usernameField.fill(username);
        passwordField.fill(password);
        loginButton.Click();
        return new BasePage();
    }

}



