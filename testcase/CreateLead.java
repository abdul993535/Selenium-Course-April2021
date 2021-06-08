package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
@DataProvider
	@Test(dataProvider= "sendData")
	public  void runCreateLead(String compname,String fname,String lname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("compname");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lname");
		driver.findElement(By.name("submitButton")).click();
		
}
	 @DataProvider///to send the data value
	 public String[][] sendData() {
		 
	 String[][] data=new String[2][3];//Class name object =new Class name
	 
	 data[0][0]="TestLeaf";// object method=data
	 data[0][1]="hari";
	 data[0][2]="R";
	 
	 data[1][0]="TestLeaf";
	 data[1][1]="Naveen";
	 data[1][2]="V";
	 
	 return data;
	 
	 
	 
	}
}






