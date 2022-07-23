package tests;

import Ui.pages.newAccountPage.NewAccount;
import com.codeborne.selenide.SelenideElement;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestMainClass {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson=new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        NewAccount newAccount;
        newAccount=gson.fromJson(new FileReader("src/test/resources/expectedList.json"),NewAccount.class);
        System.out.println("");


    }


}
