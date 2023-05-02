package selpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.webdriveruniversity.com/");
//		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		String title = "return document.title";
//		String titleWeb = (String) js.executeScript(title);
//		System.out.println(titleWeb);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String contactjs= "return document.querySelector(\"#contact-us\")";
//		WebElement contact = (WebElement) js.executeScript(contactjs);
//		System.out.println(contact.getText());
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame("iframeResult");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//String jscript = "myFunction()";
		js.executeScript("myFunction()");
		driver.switchTo().alert().accept();
}
}