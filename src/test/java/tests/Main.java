package tests;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import com.google.gson.Gson;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Main {
//    public static void main(String[] args) {
////        String body="{\r\n"+
////                "\t\"username\""+":"+"\"okleb76589@dev.com\""+",\r\n"+
////                "\t\"password\""+":"+"\"qwerty123N5yHpVNSW4MD5iBctXaHGEewv\""+",\r\n"+
////                "\t\"grant_type\""+":"+"\"password\""+",\r\n"+
////                "\t\"client_id\""+":"+"\"3MVG9tSqyyAXNH5IycMWS_SH9Heh0YzXpuM7eZrtxkyDDvN4Obay03jRUNVQahXJio5dzGhLW.qBLyfGMrxRe\""+",\r\n"+
////                "\t\"client_secret\""+":"+"\"A7E8BEFB3CF6150A000611C9812E531949C6B73DCA0FF8E4A4C451466EC9DAEC\""+"\r\n"+
////                "}";
////        System.out.println(body);
////
////        RequestSpecification req = given();
////        req.header("Content-Type", "application/json");
//////        req.body(body);
////        Map<String,String> params = new HashMap<>();
////        params.put("username","okleb76589@dev.com");
////        params.put("password","qwerty123N5yHpVNSW4MD5iBctXaHGEewv");
////        params.put("grant_type","password");
////        params.put("client_id","3MVG9tSqyyAXNH5IycMWS_SH9Heh0YzXpuM7eZrtxkyDDvN4Obay03jRUNVQahXJio5dzGhLW.qBLyfGMrxRe");
////        params.put("client_secret","A7E8BEFB3CF6150A000611C9812E531949C6B73DCA0FF8E4A4C451466EC9DAEC");
////
////        Response post = req.formParams(params)
////                .post("https://login.salesforce.com/services/oauth2/token");
////        post.print();
//
//
//        Response post = given()
//                .contentType("multipart/form-data")
//                .contentType("multipart/form-data")
//                .multiPart("username", "okleb76589@dev.com")
//                .multiPart("password", "qwerty123N5yHpVNSW4MD5iBctXaHGEewv")
//                .multiPart("grant_type", "password")
//                .multiPart("client_id", "3MVG9tSqyyAXNH5IycMWS_SH9Heh0YzXpuM7eZrtxkyDDvN4Obay03jRUNVQahXJio5dzGhLW.qBLyfGMrxRe")
//                .multiPart("client_secret", "A7E8BEFB3CF6150A000611C9812E531949C6B73DCA0FF8E4A4C451466EC9DAEC")
//                .post("https://login.salesforce.com/services/oauth2/token");
//
//        System.out.println("print");
//    }


}
