package com.ice.crmAutomation;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import java.io.IOException;

public class getdatafromexcelfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filepath  ="D:\\selenium\\TestData.xlsx";
		String extension=filepath.substring(filepath.indexOf(".")+1);
		System.out.print(filepath);
		
		Workbook workbook = null;
		try 
		{
			FileInputStream inputstream= new FileInputStream(filepath);
			if(extension.equals("xlsx"))
			{
				workbook=new XSSFWorkbook(inputstream);
			}else if(extension.equals("xlx"))
			{
				workbook=new HSSFWorkbook(inputstream);
			}
			Sheet sheet= workbook.getSheet("credential");
					
			int totalRows=sheet.getPhysicalNumberOfRows();
			int totalolumns=sheet.getRow(0).getPhysicalNumberOfCells();
			
			for(int i=0;i<totalRows;i++)
			{
				for(int j=0;j<totalolumns;j++)
				{
					Cell cell=sheet.getRow(i).getCell(j);
					CellType cellType= cell.getCellType();
					
					if(cellType.equals(cellType.NUMERIC))
					{
						System.out.println(cell.getNumericCellValue()+"");
					}
					else if (cellType.equals(cellType.STRING))
					{
						System.out.println(cell.getStringCellValue()+ " ");
					}
					else if (cellType.equals(cellType._NONE)|| (cellType.equals(cellType.STRING)))
					{
						System.out.println();
					}
					else if (cellType.equals(cellType.ERROR))
					{
						System.out.println(cell.getErrorCellValue());
					}
				}
				System.out.println();
			}
			workbook.close();
		}
			catch(IOException e)
			{
				throw new RuntimeException(e);
			}
		
	}

	

}
