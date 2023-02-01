package com.ExcelCommonMethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelOperationMethods {
	public static String getRowOfCellValue(String excelFilePath,String sheetName,int rowIndex,int cellIndex) throws IoException
	FileInputStream excelFile=new FileInputStream(excelFilePath);
	XSSFWorkbook workBook=new XSSFWorkbook(excelFile);
	XSSFSheet sheet=workBook.getSheet(sheetName);
	XSSFRow row=sheet.getRow(rowIndex);
	XSSFCell rowOfCell=row.getCell(cellIndex);
	String rowOfCelValue= rowOfCell.getStringCellValue();
	return rowOfCellValue;
}

	public static void setRowOfCellValue(String excelFilePath,String sheetName,int rowIndex,int cellIndex) throws IoException
	FileInputStream excelFile=new FileInputStream(excelFilePath);
	XSSFWorkbook workBook=new XSSFWorkbook(excelFile);
	XSSFSheet sheet=workBook.getSheet(sheetName);
	XSSFRow row=sheet.getRow(rowIndex);
	XSSFCell RowOfNewCellCreated=row.createCell(cellIndex);
	RowOfNewCellCreated.setCellValue(data);
	FileOutputStream saveFile=new FileOutputStream(excelFilePath);
	workBook.write(saveFile);
	saveFile.close();
	
}
}
