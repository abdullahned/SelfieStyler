package com.excel.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demoexcel {

	public static void main(String[] args) throws Exception  {
		
	File src=new File("C://Users//m.abdullah//Desktop//brands.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
	    XSSFSheet sheet1=wb.getSheetAt(0);
		
	   /* String data0=sheet1.getRow(1).getCell(0).getStringCellValue();

	    System.out.println("Data from Excel is "+data0);
	    
	    String data1=sheet1.getRow(2).getCell(0).getStringCellValue();

	    System.out.println("Data from Excel is "+data1); */
	    
	    

	    sheet1.getRow(1).createCell(1).setCellValue("Pass");
	    
	    sheet1.getRow(2).createCell(1).setCellValue("Fail");
	    
	    sheet1.getRow(3).createCell(1).setCellValue("14.12");
	    
	    sheet1.getRow(4).createCell(1).setCellValue("Abdullah");
	    
	    FileOutputStream fout=new FileOutputStream(src);
	    
	    wb.write(fout);
	    
	    
	    
	    
	    wb.close();
	    
		
		
		
		

	}

}
