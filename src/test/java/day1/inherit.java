package day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class inherit {
	public void waits(WebDriver driver,int time,By loc) {
		 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));

		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		

	
	}	
	/*this is a generic method use for Taking screenshots*/
//	public static void takecreenshots(String fileName) throws IOException {
//		//create a file with takescreenshot interface and get the screenshot as File
//	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//we use copyfile method to store the file in the given path
//	FileUtils.copyFile(file, new File("C:\\Users\\CHISRI\\eclipse-workspace\\Capgemini.talent\\Screenshots\\" +fileName+".jpg"));
//	
//	}
}

