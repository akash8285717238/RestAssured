package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PoojaClassForSerializationAndDeSerialization.EmployeeDetailsPojo;

public class DeserializationOfEmpDetails //Json to Java Conver
{
   @Test
   
   public void deserializationOfEmpDetails() throws IOException, JsonMappingException, IOException 
   
   {
   //Step1: Creat the Object for Object Mapper
   
  ObjectMapper objm = new ObjectMapper();
  
  //Step2:read the value from object mapper
  
  EmployeeDetailsPojo e = objm.readValue(new File ("./empData.json"),EmployeeDetailsPojo.class);
  
  //Fetch The Required value from the
  System.out.println(e.getEname());
  System.out.println(e.getEmail());
  System.out.println(e.getEid());
  System.out.println(e.getPhoneNo());
  System.out.println(e.Address());
  
   
   }



}

