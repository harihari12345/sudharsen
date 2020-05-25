package firstProject1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	

	System.setProperty("webdriver.chrome.driver","F:\\Sudhar Selenium\\Softwares\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com");
			//driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<WebElement> listlink= driver.findElements(By.tagName("a"));
			System.out.println(listlink.size());
			//listlink.addAll(driver.findElements(By.tagName("img")));
			//int m=listlink.size();
			//System.out.println(listlink.size());
			List<WebElement> linkedlist= new ArrayList<WebElement>();
			for (int i=0; i<listlink.size(); i++)
			{
				if( listlink.get(i).getAttribute("href")!=null)
				{
				linkedlist.add(listlink.get(i));
			}
			}
			 
			System.out.println(linkedlist.size());
			
			
}
}
