package CRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostProject 
{
	@Test
	public void createProject() {
		JSONObject jObject= new JSONObject();
		jObject.put("createdBy", "Akash");
		jObject.put("projectName", "HRM");
		jObject.put("status", "Create");
		jObject.put("teamSize", 200);
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObject);
		Response resp = req.post("http://localhost:8084/addProject");

		  String  completeBody = resp.prettyPrint();
		  System.out.println(completeBody);
		  
		  int actSC = resp.getStatusCode();
		  Assert.assertEquals(201, actSC);
		  
		  String actCT = resp.getContentType();
		  Assert.assertEquals("application/json", actCT);
		  
	}
}
