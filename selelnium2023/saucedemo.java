package selelnium2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		
		boolean logo = driver.findElement(By.cssSelector(".app_logo")).isDisplayed();
		if(logo) {
			System.out.println("testcase1 pass: successful login");
			
		
			List <WebElement> products = driver.findElements(By.cssSelector(".inventory_item"));
			System.out.println(products.size());
			
			if(products.size()==6) {
				System.out.println("testcase2 pass: validatetotalnumberofproducts=6");
			}
		
			driver.quit();
		}
	}

}
