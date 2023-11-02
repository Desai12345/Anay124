package selenimPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium insatll\\sele\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver Driver= new ChromeDriver(options);
		Driver.get("https://www.flipkart.com");
		Driver.manage().window().maximize();
		Driver.findElement( By.tagName("img")).click();
		Driver.findElement (By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8097924672");
	    Thread.sleep(2000);
		
}}