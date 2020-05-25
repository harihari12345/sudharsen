package firstProject1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Sudhar Selenium\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		Thread.sleep(3000);
		Set<String> handler= driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
		String parentwindowid = it.next();
		System.out.println("parentid is  "+ parentwindowid);
		driver.switchTo().window(parentwindowid);
		driver.close();
		String childwindowid = it.next();
		driver.switchTo().window(childwindowid);
		System.out.println("chilwindowid is  "+ childwindowid);
		driver.close();
		
	}

}
