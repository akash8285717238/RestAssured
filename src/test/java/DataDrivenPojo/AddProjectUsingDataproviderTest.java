package DataDrivenPojo;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AddProjectPojoClass.AddProjectPOJOTest;
import io.restassured.http.ContentType;

public class AddProjectUsingDataproviderTest 
{
	@Test(dataProvider ="TestBody")
	 public void addProjectTest(String createdBy,String projectName, String status ,int teamSize) {
		AddProjectPOJOTest dp = new AddProjectPOJOTest(createdBy,projectName,status, teamSize);
		
	 given()
	 .contentType(ContentType.JSON)
	 .body(dp)
	 
	 .when().post("http://localhost:8084/addProject")
	 .then().assertThat().contentType(ContentType.JSON).and()
	 .log().all();
		
	}
	
	@DataProvider
	public Object[][] TestBody() 
	{
		Object[][] obj = new Object[2][4]; 
		obj[0][0] = "Akash";
		obj[0][1] = "HRM-42";
		obj[0][2] = "Created";
		obj[0][3] = "100";
		
		obj[1][0] = "Akash";
		obj[1][1] = "HRM-43";
		obj[1][2] = "created2";
		obj[1][3] = "101";
		
		return obj;
		
		
	}
	
	

}
