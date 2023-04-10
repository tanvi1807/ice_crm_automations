package testngpackage;

import org.testng.annotations.Test;

import com.ice_crm_automation.utility.BaseClass;
import com.ice_crm_automation.utility.exelutil;
import com.ice_crm_automation.utility.getEmpData;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceltest extends BaseClass {

    @DataProvider
    public Object [][]  getTestData(){
    	exelutil excelUtil = new exelutil();
        String filePath = "D:\\selenium\\dataprovider.xlsx";
        String sheetName = "Sheet1";
        return excelUtil.getExcelData(filePath, sheetName);
    }

    @Test(dataProvider = "getTestData")
    public void test(String username, String password){
        System.out.println(username + " "+ password);
    }

    @DataProvider
    public Object[][] getEmpData() {
    	exelutil excelUtil = new exelutil();
        String filePath = "D:\\\\selenium\\\\dataprovider.xlsx";
        String sheetName = "sheet1";
        return excelUtil.getEmpData(filePath, sheetName);
    }

    @Test(dataProvider = "getEmpData")
    public void empTest(getEmpData empDetails) {
    	click(By.xpath("//span[text()='Employees']"));
    	click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));
    	click(By.xpath("//span[contains(text(),'Add New')]"));
        entertext(By.id("employee_id"), String.valueOf(empDetails.getId()));
        entertext(By.id("first_name"), empDetails.getFirstName());
        entertext(By.id("middle_name"), empDetails.getMiddleName());
        entertext(By.id("last_name"), empDetails.getLastName());
    	click(By.xpath("//span[text()='Save']"));

    }


}

