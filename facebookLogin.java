package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class facebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		//EdgeDriver.driver2 = new EdgeDriver();
		driver1.get("https://www.facebook.com/login");
		//driver2.get("https://www.facebook.com/login");
		WebElement email = driver1.findElement(By.id("email"));
		email.sendKeys("testleaf.2023@gmail.com");
		WebElement password = driver1.findElement(By.id("pass"));
		password.sendKeys("Tuna@321"); 
		WebElement login = driver1.findElement(By.id("loginbutton"));
		login.click();
		WebElement link = driver1.findElement(By.linkText("Find your account and log in."));
		link.click();
		String title = driver1.getTitle();
		System.out.println("title: " + title);
	}

}
