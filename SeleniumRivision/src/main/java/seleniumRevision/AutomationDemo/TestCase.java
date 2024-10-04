package seleniumRevision.AutomationDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	
	public static void main (String arg []) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
//		driver.getTitle();
//		driver.getCurrentUrl();
//		driver.getPageSource();
//		//driver.close();
//		//driver.quit();
//		
//		//navigate -used for brouser history navigation
//		//--------------
//		//driver.navigate().refresh();
//		//driver.navigate().forward();
//		//driver.navigate().back();
//		
//		//manage() -used for window related oprations and timeout opration
//		//--------------------------------------------------------------
//		//for window related Operation
		driver.manage().window().maximize();
//		//driver.manage().window().fullscreen();
//		//driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		//for resizing of window
//		//-----------------------------
//		//get size
//		
//		 org.openqa.selenium.Dimension dimention = driver.manage().window().getSize();
//		double width = dimention.getWidth();
//		double height = dimention.getHeight();
//		System.out.println(width);
//		System.out.println(height);
//	
//		//for set size 
//		org.openqa.selenium.Dimension newdimention =  new org.openqa.selenium.Dimension(1381,735);
//		driver.manage().window().setSize(newdimention);
//		
//		//current position of window
//		Point p = driver.manage().window().getPosition();
//		int x = p.getX();
//		int y = p.getY();
//		System.out.println(x);
//		System.out.println(y);
//		
//		// set current position of window
//		Point newPoint = new Point(9, 9);
//		driver.manage().window().setPosition(newPoint);
//		
//		
//		//Assert 
//		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
//		String ExpectedTitle = "Swag Labs";
//		Assert.assertEquals(ExpectedTitle, actualTitle, "same title");
//
//		// data driven by propertyfile
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
//
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
//		
//		
//		//for comments 
//		Reporter.log("logged in successfully");
//		
//		// javascriptexecutor
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
//
//		// used dependent and independent variable
//		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/../../..//button[text()='Add to cart']"))
//				.click();
//		driver.findElement(By.id("shopping_cart_container")).click();
//		WebElement element = driver.findElement(By.id("remove-sauce-labs-backpack"));
//
//		// explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		wait.until(ExpectedConditions.visibilityOf(element));
//
//		// takescreenshort(elements)
//		File src = element.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./screenshot/screenshort2.jpeg");
//		FileUtils.copyFile(src, dest);
//		
//		//takescreenshort (webpage)
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//		File dst = new File("./screenshot/screenshort4.jpeg");
//		FileUtils.copyFile(scr, dst);
//		
//		
//
//		// Actions class
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//
		driver.quit();


	

	
		
	}
	
	
	
	
	

}
