package MyFirstWebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



public class TestTheWeb {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.get("https://www.careem.com");
		System.out.print("Yalla lets go");
		WebElement signupIn = driver.findElement(By.id("openMenu"));
		
		signupIn.click();
		WebElement signupIn2 = driver.findElement(By.id("signin-submit-button"));
		signupIn2.click();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
