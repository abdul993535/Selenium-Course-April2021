package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {


	public static void main(String[] args) throws InterruptedException {
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		
		//to open the chromedriver
		ChromeDriver driver=new ChromeDriver();
		
		//to get the url
		driver.get("http:leaftaps.com/opentaps/control/main");
		
		//to maximize the windpw
		driver.manage().window().maximize();
		
		//to locate the username text field
		//WebElement username = driver.findElementById("username");
		
		//to locate the web element;
		 driver.findElementById("username").sendKeys("demosalesManager");
		
		// ((Object) password).sendkeys("crmfsa");
	
		
		//to locate the password;
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("test leaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Abdul");
		driver.findElementById("createLeadForm_lastName").sendKeys("Nazar");
		WebElement createLeadForm_dataSourceId = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown=new Select(createLeadForm_dataSourceId);	
		dropDown.selectByVisibleText("Cold Call");
		dropDown.selectByValue("LEAD_COLDCALL");
		dropDown.selectByIndex(1);

		//driver.findElementById("firstNameLocal").sendKeys("Abd");
		//driver.findElementById("lastNameLocal").sendKeys("Naz");
		//java wait
		//Thread.sleep(2000
		
		//to close the window
		//driver.close();
	}
		

	}


