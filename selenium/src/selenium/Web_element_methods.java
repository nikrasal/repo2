package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_methods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\java\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//click method
		WebElement benzradio = driver.findElement(By.xpath("//input[@id='benzradio']"));
		benzradio.click();
		

	}

}
