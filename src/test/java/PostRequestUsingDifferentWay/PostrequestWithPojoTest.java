package PostRequestUsingDifferentWay;

import org.testng.annotations.Test;

import AddProjectPojoClass.AddProjectPOJOTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostrequestWithPojoTest 
{
		@Test
		public void createProjectTest() 
		{
			AddProjectPOJOTest pj= new AddProjectPOJOTest("Akash", "HRM", "Created", 100);
			given()
			.contentType(ContentType.JSON)
			.body(pj)
			.when()
			.post("http://localhost:8084/addProject")
			.then()
			.assertThat().contentType(ContentType.JSON)
			.and()
			.assertThat().statusCode(409)
			.log().all();
		}
	}
	


