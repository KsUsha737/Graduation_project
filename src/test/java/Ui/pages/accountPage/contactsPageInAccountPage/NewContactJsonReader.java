package Ui.pages.accountPage.contactsPageInAccountPage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class NewContactJsonReader {

    public NewContact read(String fileName) throws FileNotFoundException{
        Gson gson=new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        NewContact newContact = gson.fromJson(new FileReader(String.format("src/test/resources/jsonTestData/contacts/%s", fileName)), NewContact.class);
        newContact.setFullName(newContact.getFirstName()+" "+newContact.getLastName());
        return newContact;
    }
}
