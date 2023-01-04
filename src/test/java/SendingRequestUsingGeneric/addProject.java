package SendingRequestUsingGeneric;

import org.testng.annotations.Test;

import AddProjectPojoClass.AddProjectPOJOTest;
import genericUtility.BaseClassWithSpecBuilder;
import genericUtility.EndPointsLibrary;

import static io.restassured.RestAssured.*;

public class addProject extends BaseClassWithSpecBuilder
{ 
	@Test
	
   public void createProject()
	{
       AddProjectPOJOTest adpojo = new AddProjectPOJOTest("Akash", "HRM", "Pass", 100);
       given()
       .spec(requestSpec)
       .body(adpojo)
       
       .when()
       .post(EndPointsLibrary.createProject)
       .then()
       .assertThat()
       .statusCode(201)
       .log().all();
	}
	 
 
  }
 
 
 
 
 
 
 
 

