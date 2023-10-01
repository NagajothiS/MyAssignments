package week1.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Jothitest account13";
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();

//Requirements:
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
//System.out.println(driver.findElement(By.tagName("h2")).getText());
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Jothitest account13");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

WebElement dd1 = driver.findElement(By.name("industryEnumId"));
Select industrydd = new Select(dd1); 
industrydd.selectByIndex(3);

WebElement dd2 = driver.findElement(By.name("ownershipEnumId"));
Select ownershipdd = new Select(dd2);
ownershipdd.selectByVisibleText("S-Corporation");

WebElement dd3 = driver.findElement(By.id("dataSourceId"));
Select sourcedd = new Select(dd3);
sourcedd.selectByValue("LEAD_EMPLOYEE");


WebElement dd4 = driver.findElement(By.id("marketingCampaignId"));
Select marketingdd = new Select(dd4);
marketingdd.selectByIndex(7);


WebElement dd5 = driver.findElement(By.id("generalStateProvinceGeoId"));
Select statedd = new Select(dd5);
statedd.selectByValue("TX");

driver.findElement(By.className("smallSubmit")).click();


String aname = (driver.findElement(By.partialLinkText("Jothitest")).getText());
if (aname.contains(text))
	System.out.println("account name is created successfully" + aname + text);
else
	System.out.println("account name is not created successfully" + aname + text);

//driver.close();
	}

}
