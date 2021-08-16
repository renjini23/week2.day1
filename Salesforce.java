package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// To register for free trial in Salesforce
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("TestUser");
		driver.findElement(By.name("UserLastName")).sendKeys("T");
		driver.findElement(By.name("UserEmail")).sendKeys("testuser@abc.com");
		WebElement job = driver.findElement(By.name("UserTitle"));
		Select drpJob=new Select(job);
		drpJob.selectByValue("Operations_Manager_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("TestCompany");
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select drpEmployees=new Select(employees);
		drpEmployees.selectByIndex(1);
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.findElement(By.name("start my free trial")).click();
		
		

	}

}
