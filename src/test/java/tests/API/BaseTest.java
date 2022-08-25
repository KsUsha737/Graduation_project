package tests.API;

import API.apiClient.LeadClientApi;
import API.dto.Lead;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static LeadClientApi leadClientApi;
    protected static Lead validLead;

    @BeforeClass
    static void beforeAll(){
        leadClientApi = new LeadClientApi();
        validLead = Lead.builder()
                .lastName("Sergey")
                .company("Home")
                .title("LeadTitle")
                .build();
    }

    @AfterClass
    public static void afterAll() {
        LeadClientApi leadClientApi = new LeadClientApi();
        leadClientApi.deleteAllLeads();
    }
}
