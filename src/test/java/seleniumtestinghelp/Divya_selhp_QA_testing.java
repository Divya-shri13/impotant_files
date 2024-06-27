package seleniumtestinghelp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Divya_selhp_QA_testing {
	static WebDriver driver;

	public static void takecreenshots(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// we use copyfile method to store the file in the given path
		FileUtils.copyFile(file,
				new File("C:\\Users\\CHISRI\\eclipse-workspace\\Global-express\\Screenshot\\" + fileName + ".jpg"));

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// to remove edge options
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow--origins=*");
		String act = "https://www.softwaretestinghelp.com/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.softwaretestinghelp.com");
		driver.manage().window().maximize();
		String Ext = driver.getCurrentUrl();
		Assert.assertEquals(act, Ext);
		System.out.println("the login is susscefull and the url is correct");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// to hover mouse on QA testing field

		Thread.sleep(9000);
		// to close pop up
		//driver.findElement(By.xpath("//div[@class='cb-close']")).click();
		Actions actions = new Actions(driver);
		WebElement QA = driver.findElement(By.xpath("(//a[@class='mega-menu-link'])[4]"));
		actions.moveToElement(QA).perform();
		// to click on drop down button
		driver.findElement(By.xpath("(//a[@class='mega-menu-link'])[4]")).click();
		System.out.println("The hover action is done click is performed");
		// to click on sdlc option frm dropdown
		driver.findElement(By.xpath("//a[text()='SDLC']")).click();

		// Thread.sleep(5000);
		// to close pop up
		// driver.findElement(By.xpath("//div[@class='cb-close']")).click();
		// to validate the text appears on the page
		String titleact = "SDLC (Software Development Life Cycle) Phases, Process, Models";
		String titleexp = driver.findElement(By.xpath("//*[@id=\"post-24427\"]/div/header/h1")).getText();
		System.out.println(titleexp);
		Assert.assertEquals(titleact, titleexp);
		System.out.println("the title is as excepted ");
		// to validate date appears on the page
		String str1 = "June 24, 2023";
		String str2 = driver.findElement(By.xpath("//span[@class='posted-on']/time")).getText();
		System.out.println(str2);
		Assert.assertEquals(str1, str2);
		System.out.println("the date is as present June 24, 2023");
		// to take screenshot
		takecreenshots("QA-testing");
//to scroll page and click on video
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0,775)");
//		Thread.sleep(3000);
//		SearchContext shadow = driver.findElement(By.cssSelector("cnx-button:nth-of-type(19)")).getShadowRoot();
//		Thread.sleep(1000);
//		System.out.println("click is done");
	//	shadow.findElement(By.cssSelector(".cnx-button-label:nth-of-type(1)")).click();
		// to click on tablecontext
		
		Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,850)");
		//driver.findElement(By.xpath("//span[@class='toc_toggle']")).click();
		// to validate the text
		driver.findElement(By.xpath("//a[text()='SDLC Phases']")).click();
		String act1 = "SDLC Phases";
		String exp1 = driver.findElement(By.xpath("//span[@id='SDLC_Phases']")).getText();
		Assert.assertEquals(act1, exp1);
		System.out.println("The text of suboptions is same");
		// to take refresh of the page
		driver.navigate().refresh();
		// to take screenshot for validation of page
		takecreenshots("afterrefresh");
		driver.close();
	}

}
