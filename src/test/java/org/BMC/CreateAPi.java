package org.BMC;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.mapper.factory.JsonbObjectMapperFactory;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAPi {
	@Test
	public void Post() {
	
	RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
    
	 RequestSpecification httpRequest= RestAssured.given();
	 
	 JSONObject requestparameter= new JSONObject();
	 requestparameter.put("bookingid", "12604");
	 
	 Response response = httpRequest.request(Method.PUT);
	 int statuscode = response.getStatusCode();
	 	System.out.println("Status Code: " + statuscode);
	}

}
