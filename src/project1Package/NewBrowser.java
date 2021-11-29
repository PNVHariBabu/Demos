package project1Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Nav-icons Lounge']")).click();
		
		Set<String> allWindows= driver.getWindowHandles();
		
		Iterator <String> it = allWindows.iterator();
		String Irctc =it.next();
		String Lounge = it.next();
		
		driver.switchTo().window(Lounge);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.close();
		
		driver.switchTo().window(Irctc);
		driver.findElement(By.id("stationFrom")).sendKeys("banglore");
		
			

	}

}
