package selelnium2023;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10alertsinSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//javascript alerts: that can't be seen in screen; so can do fin element in it,can't inspect
		//need to manage the alerts in order to perform the action in it
		//three alert types
		//alert popup: to Ok only kind of alert
		//confirm alert popup: either to Ok(accept) or Cancel(dismiss) kind of alert
		//prompt popup: where you have to enter something and ok it
		
		//alert

		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
//		driver.findElement(By.cssSelector("#button1")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept(); //accept() to OK the alert
//		Thread.sleep(2000);
		
		//confirm: Ok
//		
//		driver.findElement(By.cssSelector("span[id='button4']")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept(); //accept
//		Thread.sleep(2000);
//		
//		//assertion
//		System.out.println(driver.findElement(By.id("confirm-alert-text")).getText());
//		driver.quit();
		
		
//		//confirm: Cancel
//		driver.findElement(By.cssSelector("span[id='button4']")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss(); //dismiss
//		Thread.sleep(2000);
//		
//		//assertion
//		String textDismiss = driver.findElement(By.id("confirm-alert-text")).getText();
//		//notice the coding to get text for both accept and cancel is exact same, but output is different based on action
//		//here with dismiss method, cancel option i clicked and text we get is 'you pressed cancel'
//		//with action to click OK, the same code gives output 'you pressed ok'
//		System.out.println(textDismiss);
//		driver.quit();
		
		//Prompt alert: add something to it and ok it
		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
//		Thread.sleep(2000);
//		Alert al= driver.switchTo().alert(); //selenium has an Alert class too
//		al.sendKeys("hello"); //adding smth here
//		al.accept(); //oking it
//		
//		WebElement msg= driver.findElement(By.cssSelector("#result"));
//		if(msg.getText().equals("You entered: hello")) {
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
//		
		//propmt alert: cancel
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss(); //or Alert al2=driver.switchTo().alert; //al2.dismiss();
		//with dismiss method, on alerts, cancel is clicked //and here on prompt alert, results null because nothing entered
		
		WebElement msg2= driver.findElement(By.cssSelector("#result"));
		if(msg2.getText().equals("You entered: null")) {
			System.out.println("testcase pass");
		}
		else {
			System.out.println("testcase fail");
		}
	}

}
