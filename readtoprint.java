package data_driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readtoprint {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
String path ="C:\\Users\\Aswin\\Downloads\\empty_excel_file.xlsx";
FileInputStream fis = new FileInputStream(path);
Workbook book = WorkbookFactory.create(fis);
Sheet s=book.getSheet("Sheet1");
Row r1=s.getRow(1);
Cell c1 =r1.getCell(0);

String data1 = c1.getStringCellValue();
System.out.println(data1);

Row r2=s.getRow(1);
Cell c2 =r2.getCell(1);

String data2 = c2.getStringCellValue();
System.out.println(data2);

Row r3=s.getRow(2);
Cell c3 =r3.getCell(0);

String data3 = c3.getStringCellValue();
System.out.println(data3);

Row r4=s.getRow(2);
Cell c4 =r4.getCell(1);

String data4 = c4.getStringCellValue();		
System.out.println(data4);
	}

}
