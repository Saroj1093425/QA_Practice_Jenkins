package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
    
    public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
        String filePath = "C:\\Users\\Saroj Gope\\Downloads\\TestData.xlsx";
        
        // Using FileInputStream instead of File
        try (FileInputStream fis = new FileInputStream(filePath); 
        		XSSFWorkbook workbook = new XSSFWorkbook(fis)) 
        {
            XSSFSheet sheet = workbook.getSheetAt(0);  // Get the first sheet
            return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
        }
    }
}