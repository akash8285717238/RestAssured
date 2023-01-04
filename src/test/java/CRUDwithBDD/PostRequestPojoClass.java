package CRUDwithBDD;

import CRUDwithoutBDD.AddProjectTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

public class PostRequestPojoClass 
{
   public void creatPojoClass()
   {
	  JSONObject JPojo = new JSONObject();
		AddProjectTest pj= new AddProjectTest();
		given()
		.contentType(ContentType.JSON)
		.body(JPojo)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.and()
		.assertThat().statusCode(201)
		.log().all();
	
	
   }
}
