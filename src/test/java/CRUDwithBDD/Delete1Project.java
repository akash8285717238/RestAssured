package CRUDwithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*; 
public class Delete1Project 

{
	@Test
  public void deleteProject()
   {
	  when()
	  .delete("http://localhost:8084/projects/TY_PROJ_803")
	  		 
	  .then()
	  .log().all()
	  .assertThat().statusCode(204);
	  	
	}

 }

