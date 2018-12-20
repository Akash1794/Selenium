package Seldemo;

import java.io.FileInputStream;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	public FileInputStream fin;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	
	
	public Excelread(String path, String Sheetname) {
		try {
			fin=new FileInputStream(path);
			workbook=new XSSFWorkbook(fin);
			sheet=workbook.getSheet(Sheetname);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void getcelldata(int rownum,int colnum) {
		XSSFCell Celldata=sheet.getRow(rownum).getCell(colnum);
		String celldata = Celldata.getStringCellValue();
		System.out.println(celldata);
	}
	
	public String gettingcelldata() {
		int lastrow=sheet.getLastRowNum();
		short lastcell=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<lastrow;i++){
			for(int j=0;j<sheet.getRow(0).getLastCellNum();i++) {
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
		}
		return null;
		
	}
	

	public static void main(String[] args) {
		Excelread read=new Excelread("G:\\Software testing\\Cognigalllary Signup  model testcases.xlsx");
		read.getcelldata(1,1);
		read.gettingcelldata();
		

	}

}
