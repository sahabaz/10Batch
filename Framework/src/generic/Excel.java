package generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements AutoConst
{
	public static String readData(String sheet , int n , int m) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Workbook wb = WorkbookFactory.create(new File(PATH));
		String s = wb.getSheet(sheet).getRow(n).getCell(m).toString();
		return s;
	}
}
