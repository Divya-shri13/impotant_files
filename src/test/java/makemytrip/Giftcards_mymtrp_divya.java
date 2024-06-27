package makemytrip;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Giftcards_mymtrp_divya {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow--origins=*");
		String act = "https://www.makemytrip.com/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		String Ext = driver.getCurrentUrl();
		Assert.assertEquals(act, Ext);
		System.out.println("the login is susscefull and the url is correct");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveByOffset(100, 50).click().perform();
//		// click on login button 
//		driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']/p")).click();
//		//click on mybiz account
//		driver.findElement(By.xpath("//li[text()='MyBiz Account']")).click();
//		//enter the username
//		driver.findElement(By.xpath("//input[@placeholder='Enter your work email id']")).sendKeys("chilakabhathini-divya.sri@capgemini.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(3000);
//		//checking weather close if click on blank screen
////		WebElement QA = driver.findElement(By.xpath("//a[@class='close']"));
////		actions.moveToElement(QA).perform();
//		//driver.findElement(By.xpath("//a[@class='close']")).click();
//		//click on contunie 
//		driver.findElement(By.xpath("//span[@data-cy='MyBizLogin_118']")).click();
//		//Actions actionss = new Actions(driver);
//		//actionss.moveByOffset(100, 100).click().perform();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//enter the  password
//		driver.findElement(By.xpath("//div[@class='inputField']")).sendKeys("Divya@13");
//		//check the toogle button 
//		driver.findElement(By.xpath("//span[@data-cy='MyBizPassword_129']")).click();
//		//click on login button
//		driver.findElement(By.xpath("//button[@class='font16 latoBold button loginWrapMybiz buttonPrimary']")).click();
//		//click on pop up 
//		driver.findElement(By.xpath("//span[@class='myBiz__Close-wrap']")).click();
//		//giftcards
//		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chGiftcards']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//li[@class='choosFrom__list--item'][5]")).click();
		// window handelings
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		// clicking in the category
		driver.findElement(By.xpath("//label[@for='All']")).click();
		// checking the option add gift is pesent or not
		String add1 = driver.findElement(By.xpath("//span[@class='icon__text__gap'][1]")).getText();
		System.out.println(add1);
		String add2 = driver.findElement(By.xpath("//li[@class='cursorPointer'][2]")).getText();
		System.out.println(add2);
		String add3 = driver.findElement(By.xpath("//li[@class='cursorPointer'][3]")).getText();
		System.out.println(add3);
		String add4 = driver.findElement(By.xpath("//li[@class='cursorPointer'][4]")).getText();
		System.out.println(add4);

		// click on loved ones in category
		driver.findElement(By.xpath("(//p[@class='lato-bold cap-text append-bottom5 line-height18 cap-text'])[4]"))
				.click();
		// verify the text Luxury Hotels Gift Card & performe click
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,775)");
		String str1 = driver.findElement(By.xpath("(//h3[@class='lato-black black-text'])[1]")).getText();
		System.out.println(str1);
		// check the page redirection.
		/*
		 * String actre = "https://www.makemytrip.com/"; String expre =
		 */ driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		// Assert.assertEquals(actre, expre);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[@class='lato-black black-text'])[1]")).click();
		// click on quantity 2
		driver.findElement(By.xpath("//div[@class='calc_wrap']/span[3]")).click();
		// printing the price of the cupon
		String text = driver.findElement(By.xpath("//span[@class='push-right']")).getText();
		System.out.println(text);
		// click on buynow button
		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
		// on click the page moves to purchase details
		driver.findElement(By.name("senderName")).sendKeys("divya");
		driver.findElement(By.name("senderMobileNo")).sendKeys("8463942578");
		driver.findElement(By.name("senderEmailId")).sendKeys("chilakabhathini-divya.sri@capgemini.com");
		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
		// the page redirects to payments page.
		driver.navigate().back();
		driver.switchTo().window(mainWindow);
		driver.close();
		driver.quit();
	}
}
