/**
 * 
 */
package firstProject1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author hi
 *
 */
public class Firtprogrm {
	WebDriver driver;

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get("https://www.google.com");
			driver.get("https://www.facebook.com");
			//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			//driver.findElement(By.xpath("//input[@type='submit']")).click();
			//Alert alert1= driver.switchTo().alert();
			//alert1.accept();
			Thread.sleep(2000);
			//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(src,new File("D:\\JavaExample\\sudharsen\\src\\com\\qa\\test\\google.png"));
			File src2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src2, new File("D:\\JavaExample\\firstProject\\src\\firstProject1\\rediff5.png"));
			driver.findElement(By.name("firstname")).sendKeys("hari");
			driver.findElement(By.name("lastname")).sendKeys("harivishnu");
			
			driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("9999999891");
			driver.findElement(By.id("u_0_w")).sendKeys("hello");
			
			Select select= new Select(driver.findElement(By.id("day")));
			select.selectByValue("23");
			Select select1= new Select(driver.findElement(By.id("month")));
			select1.selectByVisibleText("Aug");
			Select select2= new Select(driver.findElement(By.id("year")));
			select2.selectByVisibleText("2012");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='2']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			
			//FILE LOCATION SHOULD BE TIL PACKAGE NAME AND THEN have to give filname- under that location of filename ss is captured
			//driver.findElement(By.xpath("//input[@name= 'q']")).sendKeys("testing");
								
		driver.close(); 
		
		
	}

	

}
