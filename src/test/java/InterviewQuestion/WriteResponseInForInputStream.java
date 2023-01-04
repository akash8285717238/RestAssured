package InterviewQuestion;


import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WriteResponseInForInputStream 
{
	@Test
	public static void main (String[] args) throws IOException
	{
		String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		//create a Request Spections
		
		RequestSpecification request = RestAssured.given();
		// Setting content type to specify format in which request payload will be sent.
		// ContentType is an ENUM.
		request.contentType(ContentType.JSON);
		//Adding URI
		request.baseUri("https://restful-booker.herokuapp.com/auth");
		//Adding body as string
		request.body(jsonString);
		// Calling POST method on URI. After hitting we get Response
		Response response = request.post();
		
		// Directly getting a byte array
				byte[] responseAsByteArray = response.asByteArray();
				// Creating a target file
				File targetFileForByteArray = new File("src/main/resources/targetFileForByteArray.json");
				// Writing into files
				Files.write(responseAsByteArray, targetFileForByteArray);

			}

		
		
		
		
		
	}

