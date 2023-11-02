package selenimPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethod {

	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium insatll\\sele\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver Driver= new ChromeDriver(options);
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
        Driver.getTitle();
        String T=Driver.getTitle();
        System.out.println(T);
		Driver.getCurrentUrl();
	    String s=Driver.getTitle();
	    System.out.println(s);
		Driver.getPageSource();
	    String u=Driver.getTitle();
	    System.out.println(u);
		Driver.navigate().to("https://www.flipkart.com");
		Driver.navigate().forward();
		Driver.navigate().back();
	
		Driver.navigate().refresh();
		//driver.quit();
		Driver.manage().window().maximize();
		Driver.manage().window().minimize();
		Thread.sleep(3000);
		//driver.close();
	}
	

		
		
		
		
	}
	

