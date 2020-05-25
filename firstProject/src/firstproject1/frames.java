package firstProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Sudhar Selenium\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.findElement(By.xpath("//button[contains(text() ,'Try it')]")).click();
		Thread.sleep(2000);
		driver.close();
			
		
		// TODO Auto-generated method stub

	}

}
