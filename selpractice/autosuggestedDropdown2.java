package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestedDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		driver.findElement(By.id("myInput")).sendKeys("p");
		driver.findElement(By.id("myInput")).sendKeys(Keys.ARROW_DOWN); //pizza
		driver.findElement(By.id("myInput")).sendKeys(Keys.ARROW_DOWN); //arrowdown two times will give you second option //pepperoni
		driver.findElement(By.id("myInput")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#submit-button")).click();
		
		String currenturl = driver.getCurrentUrl();
		if(currenturl.contains("Pepperoni")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
	}
}
