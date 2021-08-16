package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadsPageFullDetails {

	public static void main(String[] args) {
		// To fill complete details on the Leads Page using Automation
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Virtusa");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Renjini");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpSource = new Select(source);
		drpSource.selectByValue("LEAD_WEBSITE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Renju");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpIndustry=new Select(industry);
		drpIndustry.selectByIndex(2);
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpOwnership=new Select(ownership);
		drpOwnership.selectByVisibleText("Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Selenium Automation");
		WebElement country = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		country.clear();
		country.sendKeys("5");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("333");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("renjini@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Renjini");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("123456");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpCampaign= new Select(campaign);
		drpCampaign.selectByValue("DEMO_MKTG_CAMP");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/15/2021");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ABCDEFGHIJ");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("DEEPA");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("General");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpState=new Select(state);
		drpState.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		}

}
