package tests.API;

import API.apiClient.LeadClientApi;
import API.dto.Lead;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected LeadClientApi leadClientApi;
    protected Lead validLead;

    @BeforeAll
    public void createLead(){
        leadClientApi = new LeadClientApi();
        validLead = Lead.builder()
                .lastName("Sergey")
                .company("Home")
                .title("LeadTitle")
                .build();
    }

    @AfterAll
    public static void afterAll() {
        LeadClientApi leadClientApi = new LeadClientApi();
        leadClientApi.deleteAllLeads();
    }
}
