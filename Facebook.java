package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// To fill all the details in facebook page
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("jenR");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("Check@123");
		WebElement day = driver.findElement(By.id("day"));
		Select drpDay=new Select(day);
		drpDay.selectByValue("10");
		WebElement month = driver.findElement(By.id("month"));
		Select drpMonth=new Select(month);
		drpMonth.selectByValue("10");
		WebElement year = driver.findElement(By.id("year"));
		Select drpYear=new Select(year);
		drpYear.selectByValue("2010");
		//couldn't implement radio button
        driver.findElement(By.name("websubmit")).click();
        	}

}
