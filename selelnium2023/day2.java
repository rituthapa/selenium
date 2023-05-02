package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//arrange,action,assertion
		
		//Arrangement
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		
		//Action
		driver.findElement(By.id("userName")).sendKeys("rituthapa"); //use the unique id inside class By, there's id method where you write id that is present only once (ie, 1 of 1, means it's unique)
		driver.findElement(By.id("password")).sendKeys("!New123@");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000); //waiting for 2sec to respond
		
		//Assertion //to see the expected result is actual result or not // to see if homepage opens with successful login //positive test case
		boolean elementonhomepage = driver.findElement(By.id("books-wrapper")).isDisplayed();
		if(elementonhomepage) {
			System.out.println("TestCase Pass");
		}
		else {
			System.out.println("TestCase Fail");
		}
		
		
		
		driver.close();
		
	}

}
