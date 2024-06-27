package bmw_divya_home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Divya_bmw_home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
String actUrl = "https://www.bmw.com/en/index.html";
System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
driver = new EdgeDriver();
driver.get("https://www.bmw.com/en/index.html");
String ExtUrl = driver.getCurrentUrl();
Assert.assertEquals(actUrl, ExtUrl);
 System.out.println("The website sucessfull");
driver.manage().window().maximize();
SearchContext shadow = driver.findElement(By.cssSelector("epaas-consent-drawer-shell")).getShadowRoot();
Thread.sleep(1000);
shadow.findElement(By.cssSelector(".accept-button.button-primary")).click();
String act = "A touch of the future with BMW";
String exp = driver.findElement(By.xpath("// div[@class='pw-teaser__text']/h5[1]")).getText();
System.out.println(exp);
//Assert.assertEquals(act, exp);
System.out.println("the text is 'Accept no Imitations'. ");
driver.findElement(By.xpath("(//li[@class='pwh__ln']/a)[2]")).click();
	//driver.findElement(By.xpath("//span[@class='close-button']")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1350)");
	driver.findElement(By.xpath("(//div[@class='pw-teaser__text'])[5]")).click();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	}

}
