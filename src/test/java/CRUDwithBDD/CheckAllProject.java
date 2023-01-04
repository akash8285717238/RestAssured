package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.openqa.selenium.json.Json;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CheckAllProject 
{
	@Test
	
  public void getCheckAllProject() 
  {
	when()
	.get("http://localhost:8084/projects")
	
	
	.then()
	.assertThat().statusCode(200)
	
	.and()
	.assertThat().contentType(ContentType.JSON)  
	.log().all();
  
  }
}
