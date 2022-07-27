package Ui.pages.newLeadPage;

import Ui.pages.newAccountPage.NewAccount;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class NewLeadJsonReader {
    public NewLead read(String fileName) throws FileNotFoundException {
        Gson gson=new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        return gson.fromJson(new FileReader(String.format("src/test/resources/jsonTestData/leads/%s",fileName)),NewLead.class);
    }
}
