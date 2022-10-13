package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectWebelement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\java\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement enterEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		enterEmail.sendKeys("nikhilrasal123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("nikhil123");
		WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		loginButton.click();

	}

}
