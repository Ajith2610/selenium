package myseleniumdrive;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumwebdriver1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title is"+title);
		String Url=driver.getCurrentUrl();
		System.out.println("URL is"+Url);
		driver.get("http://www.facebook.com");
		System.out.println("Title is"+driver.getTitle());
		System.out.println("URL is"+driver.getCurrentUrl());
		driver.get("http://www.yahoo.com");
		System.out.println("Title is"+driver.getTitle());
		System.out.println("URL is"+driver.getCurrentUrl());
	

	}

}
