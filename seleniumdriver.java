package myseleniumdrive;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdriver {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String src=driver.getPageSource();
		System.out.println(src);


	}

}
