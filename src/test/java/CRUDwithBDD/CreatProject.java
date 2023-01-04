package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.testng.Assert;


import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatProject 
{
	@Test
	public void createProject() {
		JSONObject jObject= new JSONObject();
		jObject.put("createdBy", "Akash");
		jObject.put("projectName", "HRM");
		jObject.put("status", "Pass");
		jObject.put("teamSize", 100);
		
		given()
		
		   .contentType(ContentType.JSON)
		   .body(jObject)
		   
		.when()
		   .post("http://localhost:8084/addProject/TY_PROJ_803")
		   
		.then()
		   .log().all()
		   .assertThat().statusCode(201)
		   .assertThat().contentType(ContentType.JSON);
 
	}

}


