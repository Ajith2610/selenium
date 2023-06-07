package myseleniumdrive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstautomation
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver test=new ChromeDriver();
		test.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		test.manage().window().maximize();
		Thread.sleep(1000);
		test.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Ajith");	
		Thread.sleep(1000);
		test.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Periyasamy");
		Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("1/57,");
		Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Aruvankadu,");
		Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Mettupalayam,");
		Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Kokkalai(Po),");
		Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Tiruchengode(TK),");
		Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Namakkal(DT),");
		Thread.sleep(1000);
		test.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("PIN CODE:637410");
		Thread.sleep(1000);
		test.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("ajithaji1999ypw@gmail.com");
		Thread.sleep(1000);
		test.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys("9790552806");
		Thread.sleep(1000);
		WebElement radio=test.findElement(By.xpath("//*[@value=\"Male\"]"));
		if(radio.isEnabled())
		{
			System.out.println(radio);
			radio.click();
		}
		
		List<WebElement> checkbox_bt=test.findElements(By.xpath("//*[@type=\"checkbox\"]"));
		
		for(int i=0;i<checkbox_bt.size();i++)
		{
			WebElement checkbox =checkbox_bt.get(i);
			String value=checkbox.getAttribute("value");
			System.out.println("values for"+ value);
			
			if(value.equalsIgnoreCase("Cricket")) {
				checkbox.click();
				break;
			}
			if(value.equals("Movies")) {
				checkbox.click();
				break;
			}
			
			
			
		}
		
		
		JavascriptExecutor js = (JavascriptExecutor) test;
		js.executeScript("window.scrollBy(0,350)", "");
		test.findElement(By.xpath("//div[@id=\"msdd\"]")).click();

		List<WebElement> lang = test.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for (int i = 0; i < lang.size(); i++) {
			WebElement list = lang.get(i);
			String value1 = list.getText();
			 System.out.println("values for " + value1);

			if (value1.equalsIgnoreCase("Hindi")) {
	     		list.click();
				break;
			}
		}

		List<WebElement> lan1 = test.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for (int j = 0; j < lan1.size(); j++) {
			WebElement list2 = lan1.get(j);
			String value2 = list2.getText(); // System.out.println("values for" + value);

			if (value2.equalsIgnoreCase("Arabic")) {
				list2.click();
				break;
			}
			}
test.findElement(By.xpath("//input[@id=\"imagesrc\"]")).sendKeys("C:\\pictues\\Screenshot (51).png");
test.findElement(By.xpath("//*[@value=\"Java\"]")).click();
test.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
test.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("India");
test.findElement(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]")).click();

test.findElement(By.xpath("//select[@id=\"yearbox\"]//option[@value=\"2000\"]")).click();
test.findElement(By.xpath("//select[@placeholder=\"Month\"]//option[@value=\"April\"]")).click();
test.findElement(By.xpath("//select[@placeholder=\"Day\"]//option[@value=\"21\"]")).click();

test.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("12345678");
test.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("12345678");
		
test.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
	}
}
