package generic_script;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Data_Driven 
{
	public static String fetchData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./Excel/Book2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		String value = book.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}
}
