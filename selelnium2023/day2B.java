package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

public class day2B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/login");

//negetive testcase with invalid login

driver.findElement(By.id("userName")).sendKeys("rituthapa");
driver.findElement(By.id("password")).sendKeys("!New123");
driver.findElement(By.id("login")).click();
Thread.sleep(2000);

boolean errormessage= driver.findElement(By.id("name")).isDisplayed();
if(errormessage) {
	System.out.println("Testcase pass");
}
	else {
		System.out.println("Testcase Fail");
	}


driver.close();

}
}
