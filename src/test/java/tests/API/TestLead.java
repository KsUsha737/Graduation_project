package tests.API;

import API.apiClient.LeadClientApi;
import API.base.TokenGetter;
import API.dto.Lead;
import API.dto.LeadResponse;
import API.dto.TokenInfo;
import org.junit.jupiter.api.AfterAll;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestLead {
    @Test(description = "Test create valid Lead", priority = 0)
    public void testCreatingValidLead() {
        LeadClientApi leadClientApi = new LeadClientApi();
        Lead lead = Lead.builder()
                .lastName("Sergey")
                .company("Home")
                .title("LeadTitle")
                .build();
        String leadId = leadClientApi
                .createLead(lead);
        LeadResponse createdLead = leadClientApi.getById(leadId);
        Assert.assertEquals(createdLead.getLastName(), lead.getLastName());
    }

    @Test(description = "Test delete valid Lead", priority = 1)
    public void testDeleteValidLead() {
        LeadClientApi leadClientApi = new LeadClientApi();
        String leadId = leadClientApi
                .createLead(
                        Lead.builder()
                                .lastName("Sergey")
                                .company("Home")
                                .title("LeadTitle")
                                .build()
                );
        leadClientApi.deleteLead(leadId);
    }

    @Test(description = "Test create Lead and edit field {LastName}", priority = 2)
    public void testEditLead() {
        String newLeadLastName = "Max";
        Lead lead = Lead.builder()
                .lastName("Sergey")
                .company("Home")
                .title("LeadTitle")
                .build();

        LeadClientApi leadClientApi = new LeadClientApi();
        String leadId = leadClientApi.createLead(lead);
        leadClientApi.updateLeadById(
                Lead.builder()
                        .lastName(newLeadLastName)
                        .build(), leadId
        );
        LeadResponse updatedLead = leadClientApi.getById(leadId);
        Assert.assertEquals(updatedLead.getLastName(), newLeadLastName);
        leadClientApi.deleteLead(leadId);
    }

    @AfterAll
    public static void afterAll() {
        LeadClientApi leadClientApi = new LeadClientApi();
        leadClientApi.deleteAllLeads();
    }

}
