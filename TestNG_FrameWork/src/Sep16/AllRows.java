package Sep16;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllRows {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for (int i=1;i<=rc;i++)
		{
		//print any row 1st cell data
		String Fname = ws.getRow(i).getCell(0).getStringCellValue();
		String Mname = ws.getRow(i).getCell(1).getStringCellValue();
		String Lname = ws.getRow(i).getCell(2).getStringCellValue();
		int Eid = (int) ws.getRow(i).getCell(3).getNumericCellValue();
		System.out.println(Fname+"  "+Mname+"  "+Lname+"  "+Eid);
		}
		fi.close();
		wb.close();

	}

}
