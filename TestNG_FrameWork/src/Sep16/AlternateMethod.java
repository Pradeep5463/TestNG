package Sep16;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlternateMethod {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		//print any row 1st cell data
		String Fname = ws.getRow(7).getCell(1).getStringCellValue();
		String Mname = ws.getRow(4).getCell(2).getStringCellValue();
		String Lname = ws.getRow(5).getCell(0).getStringCellValue();
		int Eid = (int) ws.getRow(3).getCell(3).getNumericCellValue();
		System.out.println(Fname+"  "+Mname+"  "+Lname+"  "+Eid);
		fi.close();
		wb.close();
		
		

	}

}
