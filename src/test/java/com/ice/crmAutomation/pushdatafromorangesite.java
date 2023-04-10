package com.ice.crmAutomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pushdatafromorangesite 
{

	public static void main(String[] args)
	{
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).submit();
	 
	 driver.findElement(By.xpath("//span[text()='PIM']")).click();
	 driver.findElement(By.xpath("//button[@class='oxd-icon-button']")).click();
	 
	 List<WebElement>Columns=driver.findElements(By.xpath("//div[@class='oxd-table-header']/div/div)"));
	 
		int totalColumns= Columns.size();
	    System.out.println(totalColumns);
   
	    for(int i = 1; i<=Columns.size() ; i++)
	    {
         String ColumnsXpath ="//div[@class='oxd-table-header']/div/div["+i+"]";
	    	
	    	String ColumnsName = driver.findElement(By.xpath(ColumnsXpath)).getText();
	    	
	    	System.out.print(ColumnsName+" ");
	    	
	    	
	    	List<WebElement> Rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));//56
			
			int totalRow = Rows.size();
			System.out.println(totalRow);
			
			for(int i1= 1 ; i1<Rows.size(); i1++)
			{
				String RowXpath= "//div[@class='oxd-table-body']/div["+i1+"]/div/div";//9
				
				List<WebElement> rowsize =driver.findElements(By.xpath(RowXpath));
				
				for(int j=1 ; j<rowsize.size();j++)
				{
					WebElement row=rowsize.get(j);
					String rowText=row.getText();
					
				}
				System.out.println();
			}
		
			String filepath= "D:\\selenium\\TestData.xlsx";
			
			String extension = filepath.substring(filepath.indexOf(".")+1);
			
			Workbook workbook=null;
			
			try
			{
				FileInputStream inputstream = new FileInputStream(filepath);
				
				if(extension.equals("xlsx"))
				{
					workbook = new XSSFWorkbook(inputstream);
				}
				
				else if(extension.equals("xlx"))
				{
					workbook = new HSSFWorkbook(inputstream);
				}
				
				Sheet sheet = workbook.getSheet("Orangehrm");
				
				if(sheet== null)
				{
					sheet = workbook.createSheet("Orangehrm");
				}
	    
				for(int i1=1; i1<2; i1++)
				{
						System.out.println("row created");
						Row row = sheet.createRow(0);
				
						for(int j = 1; j< Columns.size(); j++)
						{
								String xpath = "//div[@class='oxd-table-header']/div["+i1+"]/div["+j+"]" ;
								
							    WebElement rowvalue= driver.findElement(By.xpath(xpath));
							    
							    String headerRow = rowvalue.getText();
							    
							    Cell cell = row.createCell(j-1);
							    
							    cell.setCellValue(headerRow);
							    
							    FileOutputStream outputstream = new FileOutputStream(filepath);
							    
							    workbook.write(outputstream);
						
						}
				}
			}
			catch(IOException e)
			{
				
			}
	    }
	    
			
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
					