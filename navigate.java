package myseleniumdrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.get("https:\\Twitter.com");
		driver.get("https:\\facebook.com");
		Navigation nav=driver.navigate();
		nav.back();
	}

}
