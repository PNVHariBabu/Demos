package project1Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Project1Class1 {

	public static void main(String[] args) {
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		

		WebDriver driver = new FirefoxDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='downloads/selenium-server-standalone-2.53.1.jar']")).click();
		

	}

}
