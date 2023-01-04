package CRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProject 
  {
	@Test
	public void createAllProject() 
	{   //Created Json Body using Json Simple
		JSONObject jObject= new JSONObject();
		jObject.put("createdBy", "Akash");
		jObject.put("projectName", "HRM");
		jObject.put("status", "Created");
		jObject.put("teamSize", 10);
		
		//Request for The script
		Response resp = RestAssured.get("http://localhost:8084/projects");
		  
		  String  completeBody = resp.prettyPrint();
		  System.out.println(completeBody);
		  
		  int actSC = resp.getStatusCode();
		  System.out.println(actSC);
		  
		  String actCT = resp.getContentType();
		  System.out.println(actCT);
	}

  }
