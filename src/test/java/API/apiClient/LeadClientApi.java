package API.apiClient;

import API.base.BaseApi;
import API.dto.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import utils.PropertiesKeys;
import utils.PropertyReader;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LeadClientApi extends BaseApi {
    public String createLead(Lead lead){
        Response response = post(gson.toJson(lead), PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD),201);
        System.out.println(response.body().asString());
        return gson.fromJson(response.body().asString(), CreatedLeadResponse.class).getId();
    }
    public LeadResponse getById(String id){
        Response response = get(PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD)+id,200);
        return gson.fromJson(response.body().asString(),LeadResponse.class);
    }
    public int deleteLead(String id){

        return delete(PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD)+id,204).getStatusCode();
    }
    public int updateLeadById(Lead fieldsToUpdate,String leadId){
        return path(gson.toJson(fieldsToUpdate),PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD)+leadId,204).getStatusCode();
    }

    public LeadsList getAllLeads(){
        Response response = get(PropertyReader.getProperty(PropertiesKeys.API_SOBJ_URL_LEAD), 200);
        return gson.fromJson(response.body().asString(), LeadsList.class);
    }

    public void deleteAllLeads(){
        for(LeadInfo leadInfo:getAllLeads().getLeadInfoList()){
            deleteLead(leadInfo.getId());
        }

    }

}
