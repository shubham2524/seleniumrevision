package seleniumRevision.AutomationDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SaucelabPractice {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		//take screenshort 
		WebElement element = driver.findElement(By.id("username"));
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("path");
		FileUtils.copyFile(temp, dest);
		
		//for scrolling window
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//for hover or perform mouse related operatiion
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		
		//for dropdown 
		Select select = new Select(element);
		select.selectByIndex(3);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		
	}

	
}
