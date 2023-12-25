package Sep16;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CellData {

	public static void main(String[] args) throws Throwable {
		//read path of file
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		//get workbook from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from workbook
		XSSFSheet ws = wb.getSheet("Emp");
		//get row from sheet
		XSSFRow row = ws.getRow(5);
		//count no. of rows in sheet
		int rc = ws.getLastRowNum();
		System.out.println("No. of rows are::"+rc);
		//get each cell
		XSSFCell c1 = row.getCell(0);
		XSSFCell c2 = row.getCell(1);
		XSSFCell c3 = row.getCell(2);
		XSSFCell c4 = row.getCell(3);
		String Fname = c1.getStringCellValue();
		String Mname = c2.getStringCellValue();
		String Lname = c3.getStringCellValue();
		int Eid = (int) c4.getNumericCellValue();
		System.out.println(Fname+"  "+Mname+"  "+Lname+"  "+Eid);
		fi.close();
		wb.close();
		
		
		

	}

}
