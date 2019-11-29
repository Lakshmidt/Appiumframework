package com.tyss.qa.androidapp.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Excelreport {
	public static Workbook w;
	public static Sheet s;
	public static Row r;
	public static org.apache.poi.ss.usermodel.Cell c;
	public static void writeData(String filepath,String sheetname,String value,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		w=WorkbookFactory.create(fi);
		s=w.getSheet(sheetname);
		if(s.getRow(row)==null)
			r=s.createRow(row);
		else
			r=s.getRow(row);
		if(r.getCell(cell)==null)
		{
			c=r.createCell(cell);
			c.setCellValue(value);	
		}	
		
		FileOutputStream fo=new FileOutputStream(filepath);
		w.write(fo);
		fo.flush();
		fi.close();
		fo.close();
	}
	public static String readData(String filepath,String sheetname,int row,int cell) throws IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		w=WorkbookFactory.create(fi);
		s=w.getSheet(sheetname);
		r=s.createRow(row);
		return r.createCell(cell).getStringCellValue();	
	
	}
}
