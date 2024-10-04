package seleniumRevision.AutomationDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InfosysInterviewSeleniumPractice {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		//get size 
		Dimension d = driver.manage().window().getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		System.out.println("height :-"+height);
		System.out.println("width :-"+width);
		
		
		//set Size 
		//driver.manage().window().setSize(d);
		
		
		//get location
		
		Point p = driver.manage().window().getPosition();
		int x = p.getX();
		int y = p.getY();
		System.out.println("x axis :-"+x);
		System.out.println("y axis :-"+y);
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		
		String username =  prop.getProperty("username");
		String password = prop.getProperty("password");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		/*WebElement beg = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Backpack']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(beg));
		
		File temp = beg.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/begscreenshot.jpeg");
		FileUtils.copyFile(temp,dest);
		
		TakesScreenshot screenshort =  (TakesScreenshot) driver;
		File src = screenshort.getScreenshotAs(OutputType.FILE);
		File destFolder = new File("./screenshot/webpageScreenshot.jpeg");
		FileUtils.copyFile(src, destFolder);
		
		//java script Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement addToCart = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Onesie']/../../..//button[text()='Add to cart']"));
		
		
		
		//actions class is used for mouse and keyword gesture .
		Actions actions = new Actions(driver);
		actions.click(addToCart).perform();
		
		
		//select class
		Select select = new Select(beg);
		select.selectByIndex(9);
		
		//frames 
		driver.switchTo().frame(4);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		String s = "shubhmasaituhjk";
		char c [] = s.toCharArray();
		*/
		//assert 
		String actualTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		
		
		
		
		
		
		
		
		
	
		

	}

}
