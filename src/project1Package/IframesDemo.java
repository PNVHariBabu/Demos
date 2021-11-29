package project1Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(1);
		
		//driver.findElement(By.xpath("//input[@name='name1']")).sendKeys("hari varma");
		
		//Thread.sleep(3000);
		
		driver.switchTo().frame("secondframe");
		
		driver.findElement(By.xpath("//input[@name='rep']")).click();
		
		WebElement frm = driver.findElement(By.xpath("//frame[@src='third.html']"));
		
		driver.switchTo().frame(frm);
		driver.findElement(By.name("check")).click();


		
	}

}
