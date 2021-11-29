package project1Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFramework {

	public static void main(String[] args) throws InterruptedException {
		 DemoExcel2 dis = new DemoExcel2();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 
		 for(int i=1;i<=4;i++) {
			 String un = dis.ExcelLibrary("Sheet1", i, 0);
			 String pwd =dis.ExcelLibrary("Sheet1", i, 1);
			 driver.findElement(By.id("username")).sendKeys(un);
			 driver.findElement(By.name("pwd")).sendKeys(pwd);
			 Thread.sleep(5000);
			 driver.findElement(By.id("loginButton")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.id("logoutLink")).click();
			 
		 }
		 

	}

}
