package InterviewQuestion;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WriteResponseInTextFile
{
	@Test
	public static void main (String[] args) throws IOException 
	{

		// There is no need to add escape character manually. Just paste string within
		// double
		// quotes. It will automatically add escape sequence as required.

	  String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
	  //create Request Spections 
	  RequestSpecification Req = RestAssured.given();
	  
	   // Setting content type to specify format in which request payload will be sent.
	  // ContentType is an ENUM
	  Req.contentType(ContentType.JSON);
	  //Add Uri 
	  Req.baseUri("https://restful-booker.herokuapp.com/auth");
	  //Adding Body as String 
	  
	  Req.body(jsonString);

		// Calling POST method on URI. After hitting we get Response
		//Response response = Req.post();
	  
	  Response response = Req.post();
	  

		// Getting response as a string and writing in to a file
		String responseAsString = response.asString();
		// Converting in to byte array before writing
		byte[] responseAsStringByte = responseAsString.getBytes();
		// Creating a target file
		File targetFileForString = new File("src/main/resources/targetFileForString.json");
		// Writing into files
		Files.write(responseAsStringByte, targetFileForString);

	 }
}
