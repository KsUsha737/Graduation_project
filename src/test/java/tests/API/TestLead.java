package tests.API;

import API.dto.Lead;
import API.dto.LeadResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLead extends BaseTest{

    @Test(description = "Test create valid Lead", priority = 0)
    public void testCreatingValidLead() {
        String leadId = leadClientApi
                .createLead(validLead);
        LeadResponse createdLead = leadClientApi.getById(leadId);
        Assert.assertEquals(createdLead.getLastName(), validLead.getLastName());
    }

    @Test(description = "Test delete valid Lead", priority = 1)
    public void testDeleteValidLead() {
        String leadId = leadClientApi
                .createLead(validLead);
        leadClientApi.deleteLead(leadId);
    }

    @Test(description = "Test create Lead and edit field {LastName}", priority = 2)
    public void testEditLead() {
        String newLeadLastName = "Max";
        String leadId = leadClientApi.createLead(validLead);
        leadClientApi.updateLeadById(
                Lead.builder()
                        .lastName(newLeadLastName)
                        .build(), leadId
        );
        LeadResponse updatedLead = leadClientApi.getById(leadId);
        Assert.assertEquals(updatedLead.getLastName(), newLeadLastName);
        leadClientApi.deleteLead(leadId);
    }
}
