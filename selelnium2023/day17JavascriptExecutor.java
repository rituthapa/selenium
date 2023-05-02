package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day17JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// sometimes you can't perform certain things using selenium scripts
		// that's when you need to execute javascript scripts
		// so, selenium has javascriptExecutor class that allows to execute javascript codes using selenium

		System.setProperty("Webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.webdriveruniversity.com/");

		// example 1: getTitle
		// System.out.println(driver.getTitle()); //WebDriverUniversity.com

		// javascript for this is document.title //to execute jvascript in selenium, do
		// as follows
		// create an instance of class JavascriptExecutor for the driver; typecast
		// javascriptexecutor
		// so write javascript code with return infront inside doblequotes; store the
		// script in string //or small script directly pass in js.executescript(" ")
		// then whatever the code return (either, string or integer or webelement),
		// store that value in that datatype, typecast the datatype and run executescript method
		// and print the desired output

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String titlejs = "return document.title";
//		String title = (String) js.executeScript(titlejs);
//		System.out.println(title);

		// example 2: finding element
		// driver.findElement(By.cssSelector("#contact-us"));
		// with javascript, code is document.querySelector("#contact-us")

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String ele = "return document.querySelector(\"#contact-us\")";
//		WebElement contact= (WebElement) js.executeScript(ele);
//		System.out.println(contact.getText());

//		int x = "c";
//		let x = 10; // number
//		let x = "chinmay"// string 
//	    let x = true

		// example 3: from w3schools
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement iframe = driver.findElement(By.cssSelector("#iframeResult"));
		driver.switchTo().frame(iframe);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String el= "return document.querySelector(\"body > button\")";
//		WebElement button= (WebElement) js.executeScript(el);
//		button.click();
//		
//		//for assertion
//		String alertmsg = driver.switchTo().alert().getText();
//		System.out.println(alertmsg);
//		if(alertmsg.equals("Hello! I am an alert box!")) {
//			System.out.println("Testcase pass");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jsScript = "myFunction()"; // just typing myFunction() in console clicks Try button and opens alertbox
											// because attribute onclick="myFunction()"
		js.executeScript(jsScript);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.quit();

	}

}
