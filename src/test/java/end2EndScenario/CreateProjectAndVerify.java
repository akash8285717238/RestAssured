package end2EndScenario;

import genericUtility.BaseClassWithSpecBuilder;
import genericUtility.EndPointsLibrary;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import AddProjectPojoClass.AddProjectPOJOTest;

public class CreateProjectAndVerify extends BaseClassWithSpecBuilder
{
	@Test
 
	public void createAndVerify() throws Throwable 
	{
		//Step :1 Create project Using Post() //Note:Extend PojoClass
		 AddProjectPOJOTest pdPojo = new AddProjectPOJOTest("Akash", "HRM", "Pass", 100);
		
		Response response = given()
				.spec(requestSpec)
				.body(pdPojo)
				
			.when()
			.post(EndPointsLibrary.createProject);
			
			// Step2 : Capture The Response and retrieve projectID
			String expdata = rlib.getJsonData(response, "projectId");
			System.out.println(expdata);
			
			//Step3 : Connect to Database and verify the project
			
			String query ="select* from project;";
			String actdata = dlib.executeQueryAndGetData(query, 1, expdata);
			System.out.println(actdata);
			
			
			//Step 4: Validate
			
			Assert.assertEquals(expdata, actdata);
			
			
				
		
	}
}
