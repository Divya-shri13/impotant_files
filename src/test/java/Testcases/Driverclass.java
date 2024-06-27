package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Driverclass {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		String actURL = "https://www.cardekho.com/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		//accessing the cardekho website .
		driver.get("https://www.cardekho.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
	   Assert.assertEquals(actURL, ExtUrl);
	    System.out.println("The website sucessfull");
	}
}
