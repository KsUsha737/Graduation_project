package tests;

import Ui.pages.AppNavBar;
import Ui.pages.LoginPage;
import Ui.pages.base.BasePage;
import Ui.pages.newAccountPage.NewAccount;
import Ui.pages.newAccountPage.wrapers.Wrapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 extends BaseTest {
    @Test
    public void tst(){
        new LoginPage().
                login()
                .goToSalesPage()
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage();
        Wrapper.builder()
                .rating("")
                .accountName("")
                .build();

        System.out.println("");
    }
    @Test
    public void t(){
        new LoginPage().login().goToSalesPage().goToAccountsPage();
//        Assert.assertEquals(a);
    }

    @Test
    public void tgson() throws FileNotFoundException {
//        new LoginPage().login().goToSalesPage().goToAccountsPage();
        Gson gson=new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        NewAccount newAccount;
        newAccount=gson.fromJson(new FileReader("src/test/resources/expectedList.json"),NewAccount.class);
        System.out.println("");
    }

}