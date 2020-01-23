package com.java.programs;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	XSSFSheet sheet;
	XSSFWorkbook wb;
	
	public ExcelUtility(String excelpath){
		try{
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
				
	}
	 catch(Exception e){
		 System.out.println(e.getMessage());		 
	}
}
	public String getData(int sheetNo,int rowNum,int colNum){
	sheet = wb.getSheetAt(0);
	String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	return data;
		
	}

}
