package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {
	static FileInputStream fis=null;
	public FileInputStream getFileInputStream()
	{
String filepath = System.getProperty("user.dir")+"\\src\\test\\java\\data\\ProductDDt.xlsx";
File srcFile=new File(filepath);
try {
	fis =new FileInputStream(srcFile);
}
catch (FileNotFoundException e) {
	
}
return fis;}
public Object[][] getExceldata() throws IOException
{
	fis=getFileInputStream();
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet=wb.getSheetAt(0);
	int TotalNumberOfRows = (sheet.getLastRowNum()+1);
	int TotalNumberofColumns=2;
	String[][] arrayExcelData=new String[TotalNumberOfRows][TotalNumberofColumns];
	
	for (int i = 0; i < TotalNumberOfRows; i++) {
		for (int j = 0; j < TotalNumberofColumns; j++) {
			XSSFRow row=sheet.getRow(j);
			arrayExcelData[i][j]=row.getCell(j).toString();
			
		}
		
	}
	wb.close();
	
	
	return arrayExcelData;
	
	
	
}}
	

