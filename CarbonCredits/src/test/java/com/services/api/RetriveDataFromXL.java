package com.services.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetriveDataFromXL {

	// Data file path- If you want to change file add root
	static String fileName = "testData.xlsx";

	protected static String readDataFromXL(int row, int keyvalue) {
		// object of the class
		RetriveDataFromXL rc = new RetriveDataFromXL();
		
		// reading the value of 2nd row and 2nd column
		String vOutput = rc.ReadCellData(row, keyvalue);
		
		return vOutput;
	}

	public String ReadCellData(int vRow, int vColumn) {

		// variable for storing the cell value
		String value = null;

		Workbook wb = null; // initialize Workbook null
		try {
			// reading data from a file in the form of bytes
			FileInputStream fis = new FileInputStream(fileName);

			// constructs an XSSFWorkbook object, by buffering the whole stream into the
			// memory
			wb = new XSSFWorkbook(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// getting the XSSFSheet object at given index
		Sheet sheet = wb.getSheetAt(0);

		// returns the logical row
		Row row = sheet.getRow(vRow);

		// getting the cell representing the given column
		Cell cell = row.getCell(vColumn);

		// getting cell value
		value = cell.getStringCellValue();

		// returns the cell value
		return value;
	}

}
