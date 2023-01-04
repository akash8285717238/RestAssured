package Authinetication;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Auth2 
{
	@Test
	public void authentication()
	{
		Response res = given().
				formParam("client_id","edtech")
				.formParam("client_secret","a1c511c3faa712cd65d99d5ba0ea0a55")
				.formParam("grant_type","client_credentials")
				.formParam("redirect_uri", "https://www.HRMedtech.com")
				.formParam("code","authorization_code")
				
				.when().post("http://coop.apps.symfonycasts.com/token");
		
		System.out.println(res);
		
		String token= res.jsonPath().getString("access_token");
		
		System.out.println(token);
		given().auth().oauth2(token)
		.pathParam("UserId", 4173)
		
		.when().post("http://coop.apps.symfonycasts.com/api/{UserId}/chickens-feed")
		.then().log().all();
		
		
	
		
		
		
		
				
				
				
				
				
	}
	

}
