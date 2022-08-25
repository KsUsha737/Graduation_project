package API.apiClient;

import API.base.BaseApi;
import API.dto.*;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import utils.PropertiesKeys;
import utils.PropertyReader;
@Log4j2
public class LeadClientApi extends BaseApi {
    @Step("create Lead")
    public String createLead(Lead lead) {
        Response response = post(gson.toJson(lead), PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD), 201);
        System.out.println(response.body().asString());
        return gson.fromJson(response.body().asString(), CreatedLeadResponse.class).getId();
    }

    @Step("get Lead by id")
    public LeadResponse getById(String id) {
        Response response = get(PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD) + id, 200);
        return gson.fromJson(response.body().asString(), LeadResponse.class);
    }

    @Step("delete Lead by id")
    public int deleteLead(String id) {
        return delete(PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD) + id, 204).getStatusCode();
    }

    @Step("update Lead")
    public int updateLeadById(Lead fieldsToUpdate, String leadId) {
        return path(gson.toJson(fieldsToUpdate), PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD) + leadId, 204).getStatusCode();
    }

    @Step("get all Leads")
    public LeadsList getAllLeads() {
        Response response = get(PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD), 200);
        return gson.fromJson(response.body().asString(), LeadsList.class);
    }

    @Step("delete all Leads")
    public void deleteAllLeads() {
        for (LeadInfo leadInfo : getAllLeads().getLeadInfoList()) {
            deleteLead(leadInfo.getId());
        }
    }
}
