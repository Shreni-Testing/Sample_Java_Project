package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desu\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		//is enabled or not
		Thread.sleep(5000);
		WebElement fem = driver.findElement(By.id("u_0_4_cs"));
		boolean en = fem.isEnabled();
		System.out.println(en);
		//is selected or not
		boolean se = fem.isSelected();
		System.out.println(se);
		//is displayed or not
		boolean dis = fem.isDisplayed();
		System.out.println(dis);
		driver.close();
	}
}
