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


public class DemoExcel {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\babuh\\OneDrive\\Documents\\Kapileswarapuram employees details.xlsx");
			try {
				Workbook wb =  WorkbookFactory.create(fis);
				Sheet s =wb.getSheet("sheet1");
				Row r = s.getRow(4);
				Cell c =r.getCell(3);
				String te = c.getStringCellValue();
				System.out.println(te);
				
				
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
		
		
	}

}
