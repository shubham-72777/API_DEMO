package org.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {
    public static void main(String[] args) {
//        HTTP Get Request by rest assured

//        Step 1 specify base URI in rest assured
        RestAssured.baseURI = "http://localhost:3000/employees";

//        Step 2 get reuestSpecification object so we ca select HTTP Get request
        RequestSpecification httpRequest = RestAssured.given();

//        Step 3 Select HTTP Get request by using Request specification object
        Response resp = httpRequest.get();

//        Step 4 Capture Status Code by using response object
        int a = resp.getStatusCode();
        System.out.println(a);

//        Step 5 capture the ststus line by using response object
        String b = resp.getStatusLine();
        System.out.println(b);

//        Step 6 capture response time by using response object
        long c = resp.getTime();
        System.out.println(c);

//        Step 7 Capture Response body by using response object
        String d = resp.getBody().asString();
        System.out.println(d);

    }}
