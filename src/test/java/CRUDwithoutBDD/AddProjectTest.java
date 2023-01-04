package CRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.junit.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class AddProjectTest 

{
   @Test
	public void createProject() 
   {    //Created Json Body using Json Simple
		JSONObject jObj= new JSONObject();
		jObj.put("createdBy", "Akash");
		jObj.put("projectName", "HRM");
		jObj.put("status", "Created");
		jObj.put("teamSize", 10);
		
		//Request For The Script
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObj);
		//Action //Response used to Receive the response of The Request
		Response resp = req.post("http://localhost:8084/addProject");
         //Validation
		System.out.println(resp.getContentType());
		resp.then().log().all();
		resp.then().assertThat().contentType(ContentType.JSON);
		
		
		  /*String  completeBody = resp.prettyPrint();
		  System.out.println(completeBody);
		  
		  int actSC = resp.getStatusCode();
		  Assert.assertEquals(201, actSC);
		  
		  String actCT = resp.getContentType();
		  Assert.assertEquals("application/json", actCT);*/
		  
	}
}
