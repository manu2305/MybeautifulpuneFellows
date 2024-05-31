package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromexcelFile {
@Test
public void readData() throws EncryptedDocumentException, IOException {
File path=new File("D:\\Selenium\\loginFile.xlsx");
FileInputStream fis=new FileInputStream(path);
Workbook wb = WorkbookFactory.create(fis);
Sheet sheet = wb.getSheet("Sheet1");
int row=sheet.getPhysicalNumberOfRows();
int colom=sheet.getRow(0).getPhysicalNumberOfCells();
for (int i = 0; i <row ; i++) {
	for (int j = 0; j <colom; j++) {
		String s=sheet.getRow(i).getCell(j).toString();
		System.out.println(s);
	}
}
}
}
















