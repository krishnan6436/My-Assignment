package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2day1assignment01 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Demosalesmanager");
		WebElement userpassword = driver.findElement(By.xpath("//input[@id='password']"));
		userpassword.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement CRMlink = driver.findElement(By.linkText("CRM/SFA"));
		CRMlink.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement companyname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyname.sendKeys("HCL");
		WebElement firstname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstname.sendKeys("deekshita");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("srinivasan");
		WebElement industrydd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd=new Select(industrydd);
		dd.selectByIndex(2);
		WebElement marketingdd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		marketingdd.sendKeys("Automobile");
		driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']")).sendKeys("India");
		WebElement createleads = driver.findElement(By.xpath("//input[@name='submitButton']"));
		createleads.click();
		System.out.println("page title"+driver.getTitle()); 
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//WebElement rename = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();	
		firstname.clear();
		WebElement againcreatelead = driver.findElement(By.id("ext-gen633"));
		againcreatelead.click();
		System.out.println("driver get title of duplicate page " +driver.getTitle());
		
		
	
		
		
	}

}
