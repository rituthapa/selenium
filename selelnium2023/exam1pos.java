package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam1pos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//testcase with valid email
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("ritu");
		driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("thapa");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("ritu123@gmail.com");
		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		 Thread.sleep(5000);
		 
		 
		 boolean nextpage= driver.findElement(By.cssSelector("div[class=\"cbp-af-header\"]")).isDisplayed();
		 if(nextpage) {
			 System.out.println("Testcase Pass");
		 }
		 else {
			 System.out.println("Testcase Fail");
		 }
		driver.close();
	}

}
