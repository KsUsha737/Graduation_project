package Ui.steps;

import Ui.pages.LoginPage;
import Ui.pages.base.BasePage;
import io.qameta.allure.Step;

public class LoginSteps {
    private BasePage basePage;

        @Step("login")
        public LoginSteps login(){;
            new LoginPage().login();
            return this;
        }

    }

