import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
@Test
void getweatherDetails() {
	
	//specify base URI
	RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	
	// Create Request object
	RequestSpecification httpRequest=RestAssured.given();
	
	//Create Response object
	Response res=httpRequest.request(Method.GET,"/Hyderabad");
	
	//print response in console window
	String responseBody=res.getBody().asString();
	System.out.println("Response body is : "+responseBody);
	
}
}
