package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day14BautosuggestedDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

		driver.findElement(By.id("myInput")).sendKeys("p");
		driver.findElement(By.cssSelector("#myInput")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("myInput")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("submit-button")).click();

		Thread.sleep(2000);

		if (driver.getCurrentUrl().contains("Pizza")) {
			System.out.println("Testcase pass");
		} else {
			System.out.println("Testcase fail");
		}
		driver.quit();
	}

}


