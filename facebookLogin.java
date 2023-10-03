package week1.Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://en-gb.facebook.com/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.manage().window().maximize();
 
 driver.findElement(By.linkText("Create new account")).click();
 
 driver.findElement(By.name("firstname")).sendKeys("Jothi");
 driver.findElement(By.name("lastname")).sendKeys("test");
 driver.findElement(By.name("reg_email__")).sendKeys("9790667125");
 driver.findElement(By.id("password_step_input")).sendKeys("Jothis1234");

WebElement day = driver.findElement(By.id("day"));
Select daydd = new Select(day);
daydd.selectByIndex(29);

WebElement month = driver.findElement(By.id("month"));
Select monthdd = new Select(month);
monthdd.selectByVisibleText("May");

WebElement year = driver.findElement(By.id("year"));
Select yeardd = new Select(year);
yeardd.selectByVisibleText("1986");


driver.findElement(By.xpath("//label[text()='Female'] ")).click();

driver.findElement(By.xpath("//button[@name='websubmit'] ")).click(); 
	}

}
