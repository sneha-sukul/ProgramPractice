package com.java.programs;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String args[])throws Exception{
	
	File src = new File("C:\\Users\\ssukul\\Desktop\\Book1.xlsx");
	FileInputStream fis = new FileInputStream (src);
	XSSFWorkbook wb = new XSSFWorkbook (fis);
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowCount = sheet.getLastRowNum();
//	System.out.println(rowCount);
	for(int i=0;i<=rowCount;i++){
		String data = sheet.getRow(i).getCell(0).getStringCellValue();
//		System.out.println(data);
	}
	ExcelUtility excel = new ExcelUtility("C:\\Users\\ssukul\\Desktop\\Book1.xlsx");
	System.out.println(excel.getData(0, 0, 1));
	}

}
