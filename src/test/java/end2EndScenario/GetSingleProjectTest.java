package end2EndScenario;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClassWithSpecBuilder;
import genericUtility.EndPointsLibrary;
import genericUtility.Excel_Utilities;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class GetSingleProjectTest extends BaseClassWithSpecBuilder
{
	

@Test
public void getSingleProjectTest() throws Throwable, Throwable 
{
	

                Excel_Utilities elib = new Excel_Utilities();
               String proId = elib.testDataFromExcel("Sheet1", 1, 1);
               
               given().pathParam("id", proId);
               
               when()
               .get(EndPointsLibrary.getStringleProject+"{id}")
               .then()
               .assertThat()
               .contentType(ContentType.JSON)
               .statusCode(200)
               .log().all();
   }



}
