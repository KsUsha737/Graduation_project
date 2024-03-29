package API.base;

import API.dto.TokenInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class BaseApi {
    protected Gson gson;
    protected TokenInfo tokenInfo;
    private RequestSpecification requestSpecification;
    private final String baseUrl;

    protected BaseApi() {
        gson = new GsonBuilder().create();
        tokenInfo = TokenGetter.get();
        requestSpecification = given().
                header("Content-Type", "application/json").
                header("Authorization", tokenInfo.getTokenType()+" "+ tokenInfo.getAccessToken()).
                log().all();
        baseUrl=tokenInfo.getInstanceUrl().concat("/services/data/v55.0/sobjects/");
    }

    protected Response get(String url, int expectedStatusCode) {
        return requestSpecification
                .when()
                .get(baseUrl.concat(url))
                .then()
                .statusCode(expectedStatusCode)
                .log()
                .all()
                .extract().response();
    }

    protected Response post(String body, String url, int expectedStatusCode) {
        return requestSpecification
                .body(body)
                .log()
                .all()
                .when()
                .post(baseUrl.concat(url))
                .then()
                .statusCode(expectedStatusCode)
                .extract()
                .response();
    }

    protected Response path(String body, String url, int expectedStatusCode) {
        return requestSpecification
                .body(body)
                .log()
                .all()
                .when()
                .patch(baseUrl.concat(url))
                .then()
                .statusCode(expectedStatusCode)
                .extract()
                .response();
    }

    protected Response delete(String url, int expectedStatusCode) {
        return requestSpecification
                .delete(baseUrl.concat(url))
                .then()
                .statusCode(expectedStatusCode)
                .extract().response();
    }
}
