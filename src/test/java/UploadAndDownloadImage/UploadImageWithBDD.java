package UploadAndDownloadImage;

import java.io.File;

import org.testng.annotations.Test;

public class UploadImageWithBDD 
{
   @Test
   public void UploadImage()
   {
	   File file = new File("");
     given()
     .multiPart("file", file,)
    
   }
   
}
