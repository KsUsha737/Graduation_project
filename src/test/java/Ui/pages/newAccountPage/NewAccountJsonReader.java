package Ui.pages.newAccountPage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class NewAccountJsonReader {

    public NewAccount read(String fileName) throws FileNotFoundException {
        Gson gson=new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        return gson.fromJson(new FileReader(String.format("src/test/resources/jsonTestData/accounts/%s",fileName)),NewAccount.class);
    }
}
