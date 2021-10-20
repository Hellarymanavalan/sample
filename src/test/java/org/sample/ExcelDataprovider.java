package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDataprovider {
	
	private void Excel() throws FileNotFoundException {
	File f=new File("C:\\Users\\hp\\eclipse-workspace\\maven\\src\\test\\resources\\excel\\Booking details.xlsx");
	
	FileInputStream ft=new FileInputStream(f);
	}

}
