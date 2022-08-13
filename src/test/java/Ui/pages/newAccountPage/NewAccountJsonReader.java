package Ui.pages.newAccountPage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class NewAccountJsonReader {

    private static int counter=0;

    public NewAccount read(String fileName) throws FileNotFoundException {
        Gson gson=new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        NewAccount newAccount = gson.fromJson(new FileReader(String.format("src/test/resources/jsonTestData/accounts/%s", fileName)), NewAccount.class);
        newAccount.setAccountSite(counter+newAccount.getAccountSite());
        newAccount.setAccountName(counter+newAccount.getAccountName());
        counter++;
        return gson.fromJson(new FileReader(String.format("src/test/resources/jsonTestData/accounts/%s",fileName)),NewAccount.class);
    }
}
