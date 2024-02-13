package org.DemoPractice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

    public static void main(String[] args) {

        // Specify the Base URI in rest assured.
        RestAssured.baseURI = "http://localhost:3000/employees/1";

        // get the RequestSpecification object so we can select HTTP GET Request.
        RequestSpecification httprequest = RestAssured.given();

        // select HTTP GET Request from RequestSpecification object
        Response response = httprequest.get();

        // capture status code by using response object name
        System.out.println(response.getStatusCode());

        // capture status line by using response object name
        System.out.println(response.getStatusLine());

        // capture Response time by using response object name
        System.out.println(response.getTime());

        // capture the response body by using Response object name
        String respbody = response.getBody().asString();

        //parse JSON response body into the JsonPath so we can capture the values from JSON structure.
        //create object of JsonPath class by passing response body String variable name.

        JsonPath json = new JsonPath(respbody);

        //capture the firstName value from JSON Structure by using JsonPath Object name

        String a = json.getString("firstName");
        System.out.println(a);

        //capture the Salary value from JSON Structure by using JsonPath Object name

        double b = json.getDouble("salary");
        System.out.println(b);

        //capture the id value from JSON Structure by using JsonPath Object name

        int c = json.getInt("id");
        System.out.println(c);

    }
    }