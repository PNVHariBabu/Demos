package project1Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcel2 {

	public String ExcelLibrary(String sheetName,int rowNum,int cellNum) {
		String Fival= null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\babuh\\Downloads\\Book1.xlsx");
			try {
				Workbook wb =WorkbookFactory.create(fis);
				Sheet s =wb.getSheet(sheetName);
				Row r =s.getRow(rowNum);
				Cell c =r.getCell(cellNum);
				Fival = c.getStringCellValue();
				
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return Fival;
	}

}
