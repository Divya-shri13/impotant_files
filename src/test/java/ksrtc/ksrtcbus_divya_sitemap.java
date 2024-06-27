package ksrtc;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class ksrtcbus_divya_sitemap {
	static WebDriver driver;
	public static void takecreenshots(String fileName) throws IOException {
		//create a file with takescreenshot interface and get the screenshot as File
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//we use copyfile method to store the file in the given path
	FileUtils.copyFile(file, new File("C:\\Users\\CHISRI\\eclipse-workspace\\Global-express\\Screenshot\\" +fileName+".jpg"));
	
	}


	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String actURL = "https://www.ksrtc.in/oprs-web/login/perform.do";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		//accessing the cardekho website .
		driver.get("https://www.ksrtc.in/oprs-web/login/perform.do");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
	   Assert.assertEquals(actURL, ExtUrl);
	    System.out.println("The website sucessfull");
	    //username
	    driver.findElement(By.id("userName")).sendKeys(" chilakabhathini-divya.sri@capgemini.com");
	    System.out.println("username entered");
	    //password
	    driver.findElement(By.id("password")).sendKeys("Divya@13");
	    System.out.println("password entered");
	    //selectionof checkbox
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("document.getElementById('TermsConditions').click();");
	    //login button
	   driver.findElement(By.name("submitBtn"));
	   System.out.println("login is sucessfull");
	   //mitra click
	    driver.findElement(By.xpath("//img[@src='/oprs-web/_assets/images/web/mitra.png']")).click();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   //new window
	   String mainWindow = driver.getWindowHandle();
       Set<String> allWindows = driver.getWindowHandles();
       for (String window : allWindows) {
           if (!window.equals(mainWindow)) {
               driver.switchTo().window(window);
               break;
           }}
       //language change
	    driver.findElement(By.linkText("English")).click();
	    takecreenshots("language");
	    //sitemap click
	    driver.findElement(By.xpath("//a[@href='sitmp.jsp']")).click();
	    Thread.sleep(3000);	
	    //expand about 
	    driver.findElement(By.xpath("//ul[@id='sitemap']//child::li[2]//span[2]")).click();
	    String act = "ITS";
	    Thread.sleep(3000);
	    //click on stackholder
	    String exp = driver.findElement(By.xpath("(//a[@title='About ITS'])[2]")).getText();
	//WebElement exp  = driver.findElement(By.xpath("(//a[@title='About StackHolder'])[2]"));

	  System.out.println(exp);
	  Assert.assertEquals(act, exp);
	  System.out.println("the text is correct");
	    takecreenshots("Stakeholder");
	    //to move to main window 
	  driver.switchTo().window(mainWindow);
	  // to close the main window 
	  driver.close();
	  //to quit the whole browser
	  driver.quit();
       }
}