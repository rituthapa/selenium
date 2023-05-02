package selpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//three types of alerts in javascript
		//alert //just ok it and and you can move ahead
		//confirm alert //yes or no to move ahead
		//prompt alert //where you types something and see a message as a result
		
		//these alerts can't be found by WenElement method:findelement //you have to switch to alerts which itself is in an Alert class
		
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	//	driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		 //OK alert
//		driver.findElement(By.cssSelector("#button1")).click();
//		driver.switchTo().alert().accept();
		
		//confirm alert //Oking it
//		driver.findElement(By.cssSelector("#button4")).click();
//		Alert confirm = driver.switchTo().alert();
//		Thread.sleep(1000);
//		confirm.accept();
//		Thread.sleep(1000);
//		
//		WebElement Okmsg = driver.findElement(By.id("confirm-alert-text"));
//		if(Okmsg.getText().equals("You pressed OK!")) {
//			System.out.println("testcase pass");
		
		//confirm alert //cancel it
		
//		driver.findElement(By.cssSelector("#button4")).click();
//		Alert confirm = driver.switchTo().alert();
//		Thread.sleep(1000);
//		confirm.dismiss();
//		Thread.sleep(1000);
//		
//		WebElement Cancelmsg = driver.findElement(By.id("confirm-alert-text"));
//		if(Cancelmsg.getText().equals("You pressed Cancel!")) {
//			System.out.println("testcase pass");
//		}
		
		//prompt alert
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
//		driver.switchTo().alert().sendKeys("ok");
//		driver.switchTo().alert().accept();
//		
//		WebElement okmsg = driver.findElement(By.cssSelector("#result"));
//		if(okmsg.getText().equals("You entered: ok")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
		
		Alert prompt = driver.switchTo().alert();
				prompt.dismiss();
		
		
		WebElement cancelmsg = driver.findElement(By.cssSelector("#result"));
		if(cancelmsg.getText().equals("You entered: null")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("testcase fail");
		}
	}

}
