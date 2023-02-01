package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {
public static void main(String[] args) throws IOException {
FileInputStream file=new FileInputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\ExcelFiles\\SingleTestData.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(file);

XSSFSheet sheet=workBook.getSheet("Sheet1");
Row row=sheet.createRow(2);
Cell cell=row.createCell(3);
cell.setCellValue("Testing");
FileOutputStream file1=new FileOutputStream("C:\\Users\\hi\\Desktop\\AutomationScripts\\WebApplicationTesting\\ExcelFiles\\SingleTestData.xlsx");
workBook.write(file1);

}
}
