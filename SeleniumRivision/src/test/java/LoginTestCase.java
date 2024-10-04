

import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.time.Duration;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class LoginTestCase {
		@Test
		public static void main(String[] args) throws IOException, MailosaurException, InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.get("https://test.employeeprogram.in/");
			
			driver.findElement(By.xpath("//p[text() = 'Personal Email ID (Registration required)']")).click();
			driver.findElement(By.id("home_email")).sendKeys("through-combination@bd9wyann.mailosaur.net");
			driver.findElement(By.id("send_login_link")).click();
			
			Thread.sleep(10000);
			String apiKey = "ga2ViM87HiEBCs3fKqeb35bRWTOlGXc5";
			String serverId = "bd9wyann";
			String serverDomain = "bd9wyann.mailosaur.net";

			MailosaurClient mailosaur = new MailosaurClient(apiKey);

			MessageSearchParams params = new MessageSearchParams();
			params.withServer(serverId);

			SearchCriteria criteria = new SearchCriteria();
			criteria.withSentTo("through-combination@" + serverDomain);
			

			Message message = mailosaur.messages().get(params, criteria);

			assertNotNull(message);
			//System.out.println(message.subject());
			
			org.jsoup.nodes.Document doc = Jsoup.parse(message.html().body());

			org.jsoup.select.Elements elements = doc.getElementsByTag("b");
			String verificationCode = elements.get(0).text();

			//System.out.println(verificationCode); // "542163"
			
			Thread.sleep(5000);
			driver.findElement(By.id("otpVerify")).sendKeys(verificationCode);
			
			Thread.sleep(5000);
			driver.findElement(By.id("submitOTP")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.id("emp_name")).sendKeys("shubham saurabh");
			
			Thread.sleep(2000);
			driver.findElement(By.id("institute_name")).sendKeys("Guru Nanak Dev University");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text() = ' Upload Student ID Card (Front & Back)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("front_image")).sendKeys("C:\\Users\\niranjan kumar\\Downloads\\gndec id card side 1.jpg");
			Thread.sleep(2000);
			driver.findElement(By.id("back_image")).sendKeys("C:\\Users\\niranjan kumar\\Downloads\\gndec id card side 2.jpg");
			Thread.sleep(2000);
			
			System.out.println("test passsed successfully");
			
			//driver.findElement(By.id("submitInsDetails")).click();
	}

}
