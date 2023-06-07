package myseleniumdrive;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatorcommand2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Options opt=driver.manage();
		Window win=opt.window();
		
		
		driver.get("https://Twitter.com");
		
		
		

	}

}
