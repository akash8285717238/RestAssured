package PostRequestUsingDifferentWay;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class PostRequestUsingJSONfile 
{
	public class PostRequestUsingJsonFileTest 
	{
		@Test
		public void  createPostTest() {
			File file= new File("./src/main/resources/File2.json");
			given()
		      .body(file)
			.contentType(ContentType.JSON)
			  .when()
			  .post("http://localhost:8084/addProject")
			  .then()
			  .assertThat()
			  .contentType(ContentType.JSON)
			  .and()
			  .log().all();
			
		}

	}
}
