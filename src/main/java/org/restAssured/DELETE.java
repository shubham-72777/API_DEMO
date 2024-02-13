package org.restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETE {
    public static void main(String[] args) {

//        Delete
//        Step 1 specify base URI in rest assured
        RestAssured.baseURI = "http://localhost:3000/employees/2";
        //
        // Step 2 get requestSpecification object so we can select HTTP Delete request
        RequestSpecification htttpRequest = RestAssured.given();
        //        Step 3 Select HTTP Delete request by using Request Specification object
        Response resp = htttpRequest.delete();

        //        Step 4 Capture the Status code by using response object
        int a = resp.getStatusCode();
        System.out.println(a);
        //        Step 5 capture the status line by using response object
        String b = resp.getStatusLine();
        System.out.println(b);
        //        Step 6 Capture response time by using response object
        long c = resp.getTime();
        System.out.println(c);


    }
}