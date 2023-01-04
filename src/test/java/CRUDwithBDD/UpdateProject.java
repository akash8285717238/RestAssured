package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject 
{
  @Test
   public void updatProject()
   {
	  JSONObject upDate = new JSONObject();
	  upDate.put("createdBy", "AkashUp");
	  upDate.put("projectName", "HRMUp");
	  upDate.put("status", "Passup");
	  upDate.put("teamSize", 101);
	  
	  given()
	  .contentType(ContentType.JSON)
	  .body(upDate)
	  
	  .when()
	  .put("http://localhost:8084/projects/"+"TY_PROJ_204")
	  
	  .then()
	  .log().all()
	  .assertThat().statusCode(200)
	  .assertThat().contentType(ContentType.JSON);
	  
	}
}
