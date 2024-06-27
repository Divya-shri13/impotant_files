package day1;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class scenario1  extends inherit{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//WebDriver driver;
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
	    //validating the text "new car" 
	    String  nameofthetitle = "NEW CARS";
	    driver.findElement(By.xpath("//div[@id=\"rf01\"]/header/div[2]/div/div/nav/ul/li[1]/a/span")).click();
	    WebElement text1 = driver.findElement(By.xpath("//div[@id=\"rf01\"]/header/div[2]/div/div/nav/ul/li[1]/a/span"));
	
	    System.out.println(text1.getText());
	   String textname = text1.getText();
	   Assert.assertEquals(nameofthetitle,textname);
	   System.out.println("The text is validated" );
	   
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
	 WebElement newcar = driver.findElement(By.xpath("//span[text()='NEW CARS ']/i"));
	 
	actions.click(newcar).perform();
Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@title='Upcoming Cars']")).click()	;
	   Thread.sleep(3000);
	   driver.findElement(By.id("oemName")).click();
	   driver.findElement(By.xpath("//div[@class='typeHeadContainer ']/div/ul/li[4]")).click();
	  System.out.println("select brand is given ");
	   Thread.sleep(3000);
	   //adding the type of vehicle 
	  driver.findElement(By.id("vehicleTypeName")).click();
	 // System.out.println("2");
	 
	   driver.findElement(By.xpath("//div[@class='typeHeadContainer ']/div/ul/li[1]")).click();
	   Thread.sleep(3000);
	   //adding the month in the sear filter 
	   driver.findElement(By.id("noOfMonths")).click();
	driver.findElement(By.xpath("//div[@class='typeHeadContainer ']/div/ul/li[2]")).click();
	 driver.findElement(By.name("go")).click();
	 System.out.println("click is performed");
	 // validation of text 
	 String act = "No cars available for selected criteria";
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");
	 driver.findElement(By.xpath("//h2[text()='No cars available for selected criteria']"));
	 System.out.println("element fount");
	WebElement ele = driver.findElement(By.xpath("//h2[text()='No cars available for selected criteria']"));
	System.out.println(ele.getText());
	String  str = ele.getText();
	Assert.assertEquals(act, str);
	System.out.println("The text is validate and true ");
	driver.close();
	}
	}


