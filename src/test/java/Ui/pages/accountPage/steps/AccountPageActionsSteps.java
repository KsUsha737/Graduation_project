package Ui.pages.accountPage.steps;

import Ui.pages.accountPage.AccountPageActions;
import Ui.pages.accountPage.DetailsFormPage;
import io.qameta.allure.Step;

import java.io.FileNotFoundException;

public class AccountPageActionsSteps {

    private AccountPageActions accountPageActions;
    private DetailsFormPage detailsFormPage;

    @Step("go To Details Form Page in Account Page")
    public AccountPageActionsSteps goToDetailsFormPage() throws FileNotFoundException {
       detailsFormPage= accountPageActions.goToDetailsFormPage();
        return this;
    }

    @Step("")
    public AccountPageActionsSteps goToNewsFormPage() throws FileNotFoundException {
    accountPageActions.goNewsForm();
    return this;
    }

}
