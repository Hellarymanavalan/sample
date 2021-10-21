package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataprovider {
	
	private void Excel() throws IOException {
	File f=new File("C:\\Users\\hp\\eclipse-workspace\\maven\\src\\test\\resources\\excel\\Booking details.xlsx");
	
	FileInputStream ft=new FileInputStream("C:\\Users\\hp\\Desktop\\My project\\sample\\src\\test\\resources\\excel\\Booking details.xlsx");
	Workbook w=new XSSFWorkbook(ft);
	Sheet s=w.getSheet("Sheet1");
	}

}
