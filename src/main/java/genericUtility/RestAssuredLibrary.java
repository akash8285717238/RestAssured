package genericUtility;
import io.restassured.response.Response;

//consist of methods of Rest assured tool
public class RestAssuredLibrary 
{
	/**
	 * This method will return json data from the corresponding response body
	 * @author Akash
	 */
	public String getJsonData(Response response, String path) 
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}


	}


