package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desu\\eclipse-workspace\\SampleMaven\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("shri");
		//String text1 = textEmail.getText();
		//System.out.println(text1);
		WebElement textFb = driver.findElement(By.className("_8eso"));
		String text = textFb.getText();
		System.out.println(text);
		//driver.findElement(By.xpath("//input[ends-with("));
	}
}
