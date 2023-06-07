package myseleniumdrive;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Trial 
{
public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver test=new ChromeDriver();
		
		test.manage().window().maximize();
		
		Thread.sleep(1000);
		
		test.get("https://forumqc.forumnxt.com/iforumsp_qc/index.php?module=xSalesman&action=index&parenttab=Salesforce");
		
		test.findElement(By.xpath("//input[@placeholder=\"User Name\"]")).sendKeys("HULL");	
		Thread.sleep(1000);
		
		test.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123456");
		Thread.sleep(1000);
		
		test.findElement(By.xpath("//input[@class=\"green-button\"][@type=\"submit\"]")).click();
		Thread.sleep(1000);
		
		File f = ((TakesScreenshot) test).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("./Screenshot/Ajith.png"));
		
		test.findElement(By.id("Salesforce")).click();
		Thread.sleep(1000);
		
		test.findElement(By.xpath("//img[@title=\"Create New Salesman...\"]")).click();
  		Thread.sleep(1000);
		
		test.findElement(By.xpath("//input[@id=\"salesman\"]")).sendKeys("Ajith");
		Thread.sleep(1000);
		
		test.findElement(By.xpath("//input[@id=\"sman_mobile\"]")).sendKeys("9790552806");
		Thread.sleep(1000);
		
		test.findElement(By.className("combo-arrow")).click();
		
		test.findElement(By.xpath("//div[contains(text(),\"SCG67\")]")).click();
		WebElement rrr=test.findElement(By.xpath("//select[@name=\"classification\"]"));
		rrr.click();
		Select obeselect=new Select(rrr);
		obeselect.selectByVisibleText("RSP");
		test.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[position()=1]")).click();
		
		/*
		 * TakesScreenshot ts =(TakesScreenshot)
		 * ((TakesScreenshot)test).getScreenshotAs(OutputType.FILE); //File
		 * screenshot1=ts.getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(screenshot1,new File("./Screenshot/Ajith.png"));
		 */
		
		
	     
	     
	     
	    // (f, new File("C:/Users/Chait/Desktop/Screenshots/screenshot01.png"));
		
		test.quit();
		/*FileUtils.copyFile(screenshot, new File(""));
		TakesScreenshot ts2=((TakesScreenshot)abc);
		File screenshot2=ts2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File("./Screenshots/demo3.png"));
		

		
		/*To capture screenshots in Selenium, one has to utilize the method TakesScreenshot. This notifies WebDriver that it should take a screenshot in Selenium and store it.

			Syntax:
		 * File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		 * 
		 * 
		 * Here’s an example of this usage method:
		 * X getScreenshotAs(OutputType(X). target) throws WebDriverException
		 * 
		 * Step 1 – Convert web driver object to TakeScreenshot
		 * TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		 * 
		 * Step 2 – Call getScreenshotAs method to create image file
		 * File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 * 
		 * 
		 * Step 3 – Copy file to Desired Location
		 * driver.get("https://www.browserstack.com");
			//Call take screenshot function
				this.takeSnapShot(driver, "c://test.png") ;
		 * 
		 * 
		 * 
		 * 
		 */
	}


}
