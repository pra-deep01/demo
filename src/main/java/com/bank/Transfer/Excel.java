package com.bank.Transfer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements AutoConstant{
public String getExcel(String excelpath,int rownum,int cellnum ) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream f=new FileInputStream(excelpath);
Workbook wb=WorkbookFactory.create(f);
return wb.getSheet(excelpath).getRow(rownum).getCell(cellnum).getStringCellValue();
}
}
