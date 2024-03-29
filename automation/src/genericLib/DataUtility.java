package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class DataUtility {


		public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\neelam\\new1.txt");
			Properties pobj=new Properties();
		pobj.load(fis);
			String value=pobj.getProperty(key);
			return value;
	}
		public String getDataFromExcelSheet(String sheetname,int rownum,int cellnum) throws  IOException {
			FileInputStream fis=new FileInputStream("G:\\My Drive\\data1.gsheet");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh=book.getSheet(sheetname);
			DataFormatter format=new DataFormatter();
			String val=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
			return val;
		}
	
	}

