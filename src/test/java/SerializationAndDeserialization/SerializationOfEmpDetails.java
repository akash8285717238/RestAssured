package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;
import static io.restassured.RestAssured.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PoojaClassForSerializationAndDeSerialization.EmployeeDetailsPojo;
import io.restassured.internal.mapping.ObjectMapping;


public class SerializationOfEmpDetails   //Java to Json Convert
    {
	@Test
    
     public void serializationOfEmpDetails() throws Throwable, Throwable,Throwable
	{
   //Create the  Object Pojo Class 
   EmployeeDetailsPojo emp = new EmployeeDetailsPojo("Akash","Ty012","AN@gmail.com",8285,"Delhi");
   //Creat the Object for Object Mapping
   
   ObjectMapper objm = new ObjectMapper();
   //Write The Value to Json File
   objm.writeValue(new File("./empData.json"), emp);
   
   
   


	


	}
 }
