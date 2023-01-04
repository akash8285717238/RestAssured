package PostRequestUsingDifferentWay;

import java.util.HashMap;

import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestUsingJHashMap 
{
  @Test
  public void createProject()
  {         
	
	  HashMap hp = new HashMap();
		hp.put("createdBy", "Akash");
		hp.put("projectName", "Dream1");
		hp.put("status", "Createdsd");
		hp.put("teamSize", 100);
		
		given()
		.body(hp)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		
		.post("/addProject")
		.then()
		.assertThat()
		.contentType(ContentType.JSON)
		.statusCode(201)
		.log().all();
		
		
		}


  }
  

