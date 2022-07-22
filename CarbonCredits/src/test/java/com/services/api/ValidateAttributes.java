package com.services.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class ValidateAttributes extends RetriveDataFromXL {

	/*
	 * If you want to change query param or other values , open RetriveDataFromCSV java file and add new file name.
	 *  
	 */
	
	// Base URL
	String baseURL="https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json";
	
	
	/*
	 * Verify response contains "Name" element with with Carbon credits
	 * 
	 */
	
	@Test(priority = 1)
	public void verifyNameElement() {

		// Append query param values to baseURL -> catalogue=false
		given().queryParam(readDataFromXL(1, 0), readDataFromXL(1, 1))
		//Load base URL
		.when().get(baseURL)
		//Check response status 200		
		.then().statusCode(200).
		
		//Parse "Name" element and  "Carbon credits" as value
		body(readDataFromXL(2, 0), equalTo(readDataFromXL(2, 1)));

	}
	
	
	/*
	 * Verify response contains "CanRelist " element  with with true(boolean value)
	 * 
	 */
	@Test(priority=2)
	public void verifyCanRelistElement() {
		
		// Append query param values to baseURL -> catalogue=false
		given().queryParam(readDataFromXL(1,0), readDataFromXL(1,1))
		
		//Load base URL
		.when().get(baseURL)
		
		//Check response status 200		
		.then().statusCode(200).
		//Parse "CanRelist" element and  "true" as value
		body(readDataFromXL(3,0), equalTo(true));
	}

	/*
	 * Verify response contains "Promotions " element  with Name = "Gallery" has a Description that contains the text "Good position in category"
	 * 
	 */
	@Test(priority=3)
	public void verifyPromotionsElement() {
		
		// Append query param values to baseURL -> catalogue=false
		given().queryParam(readDataFromXL(1,0), readDataFromXL(1,1))
		//Load base URL
		.when().get(baseURL)
		//Check response status 200		
		.then().statusCode(200)
		//Parse Json path to find Name "Gallery" and Description "Good position in category"
		.body("Promotions[1].Description", equalTo(readDataFromXL(4, 1)));
	}
}

