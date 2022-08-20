package API.base;

import API.dto.TokenInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.Builder;
import lombok.Data;
import utils.PropertiesKeys;
import utils.PropertyReader;

import static io.restassured.RestAssured.given;
import static utils.PropertyReader.*;

@Data
@Builder
public class TokenGetter {
    @Step("Get access token")
    public static TokenInfo get(){
        Gson gson = new GsonBuilder().create();
        given()
                ;
        Response response =
                given()
                        .contentType("multipart/form-data")
                        .multiPart("username", PropertyReader.getProperty(PropertiesKeys.API_USERNAME))
                        .multiPart("password", PropertyReader.getProperty(PropertiesKeys.API_PASSWORD))
                        .multiPart("grant_type", "password")
                        .multiPart("client_id", PropertyReader.getProperty(PropertiesKeys.API_CLIENT_ID))
                        .multiPart("client_secret", PropertyReader.getProperty(PropertiesKeys.API_CLIENT_SECRET)).
                        log().all().
                        post(PropertyReader.getProperty(PropertiesKeys.API_TOKEN_URL)).
                        then()
                        .statusCode(200).
                        extract().response();
        TokenInfo tokenInfo = gson.fromJson(response.asString(), TokenInfo.class);
        return tokenInfo;
    }
}
