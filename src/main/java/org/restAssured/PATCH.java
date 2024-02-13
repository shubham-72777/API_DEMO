package org.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class PATCH {
    public static void main(String[] args) {

//
//        Step 1 specify base URI in rest assured
//        RestAssured.baseURI = "http://localhost:3000/employees/2";

    //        Step 2 get requestSpecification object so we can add requestHeasder requestBody we can select HTTP Patch request
    RequestSpecification httpRequest = RestAssured.given();

//        Step 3 add request Content - Type header from RequestSpecification object
        httpRequest.header("Content-Type", "application/json");

    //        Step 4 create Request body in json Format by using JSON simple library
    JSONObject json = new JSONObject();
        json.put("firstName", "Nikhil");
        json.put("lastName", "Patil");


    //        Step 5 convert JSONObject into string by using toString method
    String abc = json.toString();

//        Step 6 attach Converted JSON string into HTTP patch request
        httpRequest.body(abc);

    //        Step 7 Select HTTP patch Request from RequestSpecification object
    Response response = httpRequest.patch();

    //        Step 8 Capture Status code using Response object
    int a = response.getStatusCode();
        System.out.println(a);

    //        Step 9 Capture Status Line by using ResponseObject
    String b = response.getStatusLine();
        System.out.println(b);

    //        Step10 capture response time by using Response object
    long c = response.getTime();
        System.out.println(c);

    //        Step 11 Capture Response Body using Response Object
    String d = response.getBody().asString();
        System.out.println(d);



}
}
