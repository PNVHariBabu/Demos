package project1Package;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOfMouseAndKeyBoard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Branches =  driver.findElement(By.xpath("//span[text()='Branches']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Branches).perform();
		Thread.sleep(3000);
		WebElement Marthahali = driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		act.moveToElement(Marthahali).perform();
		Thread.sleep(3000);
		WebElement SeleniumTrainingInMarathahalli = driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
		Thread.sleep(3000);
		act.moveToElement(SeleniumTrainingInMarathahalli).perform();
		Thread.sleep(3000);
		act.contextClick(SeleniumTrainingInMarathahalli).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();

	}

}
