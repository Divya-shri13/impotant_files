package mymtrp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class holidaypackage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow--origins=*");
		String act = "https://www.makemytrip.com/flights/?cmp=SEM%7CD%7CDF%7CB%7CRoute%7CRoute-Top40_DT%7CDF_Mixed%7CMixed%7CRSA%7COffer3%7CRSA%7CNewEmot%7C&s_kwcid=AL!1631!3!!e!!o!!redbus&ef_id=:G:s&msclkid=8a0eadba31f31c86221bc87790ccb6b8";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM%7CD%7CDF%7CB%7CRoute%7CRoute-Top40_DT%7CDF_Mixed%7CMixed%7CRSA%7COffer3%7CRSA%7CNewEmot%7C&s_kwcid=AL!1631!3!!e!!o!!redbus&ef_id=:G:s&msclkid=8a0eadba31f31c86221bc87790ccb6b8");
		driver.manage().window().maximize();
		String Ext = driver.getCurrentUrl();
		Assert.assertEquals(act, Ext);
		System.out.println("the login is susscefull and the url is correct");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions actions = new Actions(driver);
		actions.moveByOffset(100, 100).click().perform();
		// click on the hoLIDAy icon
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@data-cy='item-wrapper'])[4]")).click();
		driver.findElement(By.xpath("//span[@data-cy='fromCity']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='citypicker_input']")).clear();
		driver.findElement(By.xpath("//input[@class='citypicker_input']")).sendKeys("Shimla");
		driver.findElement(By.xpath("(//p[@class='makeFlex hrtlCenter'])[3]")).click();
		driver.findElement(By.xpath("//span[@data-cy='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");
//		Actions actions2 = new Actions(driver);
//		WebElement hp= driver.findElement(By.xpath("(//p[@class='dateInnerPara'])[29]"));
//		actions2.moveToElement(hp).perform();
		driver.findElement(By.xpath("//span[@data-cy='departureDate']")).click();
		// driver.findElement(By.xpath("(//p[@class='dateInnerPara'])[29]")).click();
		driver.findElement(By.xpath("(//p[@class='dateInnerPara'])[32]")).click();
		driver.findElement(By.xpath("//div[@class='select-pax-container pointer ']")).click();
		driver.findElement(By.xpath("//div[@data-testid='adult-increment-counter']")).click();
		driver.findElement(By.xpath("//div[@data-testid='child-increment-counter']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@class='font12 darkText childAge-selector-scale']/li)[4]")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//button[@class='applyBtn']")).click();
		Thread.sleep(3000);
		js1.executeScript("window.scrollBy(0,-150)");
		driver.findElement(By.xpath("//div[@class='filter-input-container ']")).click(); // click on fliters
		Actions a = new Actions(driver);
		//slider code 
		WebElement s = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-1']"));
		WebElement d = driver.findElement(By.xpath("//div[@class='rc-slider']"));
		a.moveToElement(s).clickAndHold().dragAndDropBy(d, 0, 300).perform();
		//a.moveToElement(s).click().sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT);
		 driver.findElement(By.xpath("//div[@class='field-label blue-font up-arrow']")).click();
		 System.out.println("clicked on filter");
//		 Thread.sleep(3000);
//		// driver.findElement(By.xpath("//li[@class='makeFlex Selection activeStar ']")).click();
//		driver.findElement(By.xpath("(//label[@class='rating-star'])[2]")).click(); // rating
//		
//		Thread.sleep(3000);
//		js1.executeScript("window.scrollBy(0,200)");
//		driver.findElement(By.xpath("//button[@class='action']")).click(); // apply button
//		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();// submit buttons
//		driver.getCurrentUrl();
//		System.out.println(driver.getCurrentUrl());
//		//Actions actions3 = new Actions(driver);
//		Thread.sleep(3000);
//		WebElement close = driver.findElement(By.xpath("//span[@class='close closeIcon']"));
//		close.click();
//		//actions3.moveToElement(close).perform();
//		Thread.sleep(3000);
//		actions.moveByOffset(100, 150).click().perform();
//		driver.findElement(By.xpath("//span[text()='Popular']")).click();
//		driver.findElement(By.xpath("//ul[@class='sortingDropdown']/li[2]")).click();
//		System.out.println("the filter low to high is applied");
//		
//		actions.moveByOffset(100, 150).click().perform();
//		driver.findElement(By.xpath("//span[text()='All-Inclusive ']")).click();
//		js1.executeScript("window.scrollBy(0,200)");
//		driver.findElement(By.xpath("(//img[@alt='Package Image'])[1]")).click();
//		// window handelings
//		String mainWindow = driver.getWindowHandle();
//		Set<String> allWindows = driver.getWindowHandles();
//		for (String window : allWindows) {
//			if (!window.equals(mainWindow)) {
//				//driver.switchTo().window(window);
//				break;
//			}
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("SKIP")).click();
//		js1.executeScript("windows.scrollBy(0, 600)");
//		driver.findElement(By.linkText("PROCEED TO BOOK ONLINE")).click();
//		driver.findElement(By.partialLinkText("Change Flight")).click();
//		driver.findElement(By.xpath("(//p[@id='departure_domReturns_selection'])[1]")).click();
//		driver.findElement(By.linkText("Update Package"));
//		String cost1 = "₹36,285";
//		String cost2 = driver.findElement(By.id("price_detail")).getText();
//		Assert.assertEquals(cost1, cost2);
//		System.out.println(cost2);
//		driver.findElement(By.id("changeLogUndoBtn")).click();
//		driver.close();
//
	}
//
}
