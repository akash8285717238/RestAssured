package genericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class BaseClassWithSpecBuilder 
{
    public JavaLibrary jlib = new JavaLibrary();
    public RestAssuredLibrary rlib = new RestAssuredLibrary();
    public DatabaseLibrary dlib = new DatabaseLibrary();
    public ResponseSpecification responseSpec;
    public RequestSpecification requestSpec;
    
    /**
     * RequestSpection Builder and ResponseSpecBuilder are Classes in restAssured Library
     * with the help of which we can store some common Actions in Both Request and Response
     * @author Akash
     * @param requestSpec 
     * @throws Throwable
     */
    @BeforeSuite
    public void bsConfig() throws Throwable
    {
    	dlib.connectToDB();
    	RequestSpecBuilder builder = new RequestSpecBuilder();
    
    	builder.setBaseUri("http://localhost");
    	builder.setPort(8084);
    	builder.setContentType(ContentType.JSON);
    	requestSpec =builder.build();
    }
    
    @AfterSuite
    public void asConfig() throws Throwable
    {
    	dlib.closeDB();
    	ResponseSpecBuilder builder = new ResponseSpecBuilder();
    	responseSpec = builder.expectContentType(ContentType.JSON).build();
    	
    	
    	
    }

}
