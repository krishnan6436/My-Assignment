package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day1Assignment2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement compname = driver.findElement(By.id("createLeadForm_companyName"));
		compname.sendKeys("krishnan");
		driver.findElement(By.name("lastName")).sendKeys("sss");
		driver.findElement(By.name("firstName")).sendKeys("krish");
		WebElement findElemendd = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select firstdd = new Select(findElemendd);
	firstdd.selectByIndex(2);
	WebElement firstnameclear = driver.findElement(By.name("companyName"));
	firstnameclear.clear();
	
	
	//driver.findElement(By.className("smallSubmit")).click();
		
		driver.getTitle();
		System.out.println("title"   +driver);
		
	}

}
