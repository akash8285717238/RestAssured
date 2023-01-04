package genericUtility;
    import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Excel_Utilities {
		
		 /**
		  * This method is used to read the data from Excel file
		  * @author Akash
		  * @param SheetName
		  * @param Rno
		  * @param colmno
		  * @return
		  * @throws Throwable
		  * @throws IOException
		  */
	public String testDataFromExcel(String SheetName, int Rno, int colmno) throws Throwable, IOException {
		FileInputStream fi =new FileInputStream(IPath_Constants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		Row ro=sh.getRow(Rno);
		Cell cel=ro.getCell(colmno);
		String value=cel.getStringCellValue();
		return value;
		
		
	}
	/**
	 * This Method is used to write the data into Excel File
	 * @author B G ARUNKUMAR
	 * @param SheetName
	 * @param Rno
	 * @param colmno
	 * @param Data
	 * @throws Throwable
	 * @throws IOException
	 */
	public void writeDataIntoExcel(String SheetName, int Rno, int colmno, String Data) throws Throwable, IOException {
		FileInputStream fi =new FileInputStream(IPath_Constants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		Row ro=sh.createRow(Rno);
		Cell cel=ro.createCell(colmno);
		cel.setCellValue(Data);
		FileOutputStream fo =new FileOutputStream(IPath_Constants.ExcelPath);
		wb.write(fo);
	}
	/**
	 * This Method is used to get Last row count of excel sheet
	 * @author B G ARUNKUMAR
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 */

	public int getLastRowNo(String SheetName) throws Throwable {
		FileInputStream fi=new FileInputStream(IPath_Constants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int count=sh.getLastRowNum();
		return count;
	}

	public void getList(String SheetName, WebDriver driver) throws Throwable {
		FileInputStream fi=new FileInputStream(IPath_Constants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int count=sh.getLastRowNum();
		for(int i=1;i<=count;i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);
		}
	}

	public Map<String, String> getList(String SheetName) throws Throwable {
		FileInputStream fi=new FileInputStream(IPath_Constants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int count=sh.getLastRowNum();
		Map<String, String> map=new HashMap<String, String>();
		for(int i=1;i<=count;i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}

	public Object[][] readDataFromDataProvider(String SheetName) throws Throwable {
		FileInputStream fi=new FileInputStream(IPath_Constants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int lastRow=sh.getLastRowNum()+1;
		int lastCell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRow][lastCell];
		for (int i = 0; i <lastRow; i++) {
			for (int j = 0; j < lastCell; j++) {
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		return obj;
	}
}
	
	


 
	
	

