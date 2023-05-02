package selpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		four types of waits:
//			implicit wait - dynamic
//			explicit wait - dynamic
//			Thread.sleep - static //this is the only wait that will hard wait for the mentioned time no matter how early the response is got
//			fluentwait - dynamic
		
		//implicitwait-  it will wait only until the element is found and then move on to the next
		//the maximum it waits for a code to run is the seconds that we mentioned
		
		//if it waits until one request is responded and not a fixed wait; then why do we need explicit wait
		// if el1= 2sec 
		//    el2= 3sec
		//    el3= 5sec
		
		//what if element 1 takes 4 sec to execute, do we know it if we use implicit wait ? NO 
		//it will execute in 4 sec and move to next element without throwing error because maximum time for implicit wait is 5 sec
		//that's when explicitwait is helpful
		
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.cssSelector("contact-us"));
		WebDriverWait waitE =  new WebDriverWait(driver,Duration.ofSeconds(10));
		WebDriverWait waitEE = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		waitE.until(ExpectedConditions.visibilityOf(ele));
		waitEE.until(ExpectedConditions.elementToBeClickable(ele));
	
		//Fluent Wait
		//if element changes every 2 sec from HI to Bye to Thankyou, and you want to check Bye element
		//then use fluent wait, same like explicit create an object of wait class for <webDriver>, total duration  of 6 sec and polling at every 2 sec until you get the expected element
		// Wait <Webdriver> waitF = new FluentWait<WebDriver> (driver)
		// ---.withtimeout(totaltime) ---.pollingEvery(exacttime) --- .withMessage --- .ignoring(NoSuchElementException.class) 
		//then wait.until(ExpectedConditions.elementtobeclickable(ele)
		
		
		Wait <WebDriver> wait = 
				new FluentWait <WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(6))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("trying to find bye")
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeSelected(ele));
	}
}
