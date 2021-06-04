package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desu\\eclipse-workspace\\SampleMaven\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtSearch.sendKeys("testing");
		Thread.sleep(1000);
		//to get the list of suggestions
		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		//System.out.println(listOfSuggestions.size());
		//for selecting the testing jobs in chennai need to iterate the list of suggestions available
		for(int i = 0; i < listOfSuggestions.size(); i++)
		{
			//get the list of item present in the entire list at a specific index
			WebElement listOfItem = listOfSuggestions.get(i);
			//to get the text of specific element in the particular iteration
			String item = listOfItem.getText();
			//check whether the list of item is containing jobs in chennai
			if(item.contains("jobs in chennai"))
			{
				//click on that specific item
				listOfItem.click();
				break;
			}
		}
	}
}
