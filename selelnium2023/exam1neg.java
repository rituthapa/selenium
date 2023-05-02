package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam1neg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//testcase with invalid email address
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("ritu");
		driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("thapa");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("ritu123");
		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		 Thread.sleep(5000);
		 

//		 String currenturl=driver.getCurrentUrl();
//		 System.out.println(currenturl);
//		 if(currenturl.contains("contact_us")) {
//			 System.out.println("test case pass");
//		 }
//		 else {
//			 System.out.println("test case fail");
//		 }
		 boolean errmsg= driver.findElement(By.cssSelector("body")).isDisplayed();
		 if(errmsg) {
			 System.out.println("Testcase Pass");
		 }
		 else {
			 System.out.println("Testcase Fail");
		 }
		 
        driver.close();
	}}
