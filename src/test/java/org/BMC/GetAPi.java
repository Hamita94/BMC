package org.BMC;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPi {
	
	@Test
	public void get() {
	
	RestAssured.baseURI = "https://restful-booker.herokuapp.com/apidoc/index.html";
    
	 RequestSpecification httpRequest= RestAssured.given();
	 

	 	Response response = httpRequest.request(Method.GET);
	 	
	 	int statuscode = response.getStatusCode();
	 	System.out.println("Status Code: " + statuscode);
        //System.out.println("Response Body: " + responseBody);


	}
}
