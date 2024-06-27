package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Scenario2 extends inherit {

	public static void main(String[] args) throws InterruptedException {
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
	    Thread.sleep(3000); 
	    
	    driver.findElement(By.id("cardekhosearchtext")).sendKeys("Mahindra BE Cars");
	    //driver.findElement(By.xpath("//button[@value='search']")).click();
	    String  search_car_text1 = "Mahindra Thar";
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='typeHeadContainer ']/div/ul/li[1]")).click();
	    WebElement expectedresult = driver.findElement(By.xpath("//div[@class='gsc_col-xs-12 gsc_col-sm-12 gsc_col-md-7 gsc_col-lg-7 overviewdetail']/h1"));
	    System.out.println(expectedresult.getText());
	    String str = expectedresult.getText();
	    Assert.assertEquals(search_car_text1, str);
	    System.out.println("the strings are same ");
	}

}

