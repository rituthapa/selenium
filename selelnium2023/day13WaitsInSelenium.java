package selelnium2023;

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

public class day13WaitsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Waits: why waits required
		//Client sends request to server; then server sends back response by creating the element //elements created from response
		//if response is delayed, elements are not created
		//that's why, need to have wait for elements to be created
		
		//4 types of waits
		//implicit wait - dynamic in nature, also called global wait, applied to whole page
		//explicit wait - dynamic, applied to single element based on certain condition
		// Thread.sleep() - static in nature
		// fluent wait - dynamic
		
		//Thread.sleep(5000) // hard wait for 5 sec even if element created before that in 3 sec //that's why static, not changing,5 sec wait means 5 sec wait only
		//implicit wait - dynamic
		//el1 - 3 sec
		//el2 - 5 sec
		//el3 - 2 sec
		//el4 - 1 sec
		//here, wait for 3 sec for el1 to create , then wait for 5 sec for el2 creation and 2 sec wait for el3 and will wait 1 sec for el4
		//with implicitwait, it will wait until element is created and move to next element and so forth and maximum wait it'll do for one element is 5 sec if required
		
		//explicit wait - wait for one particular element only
		
		//so why we need explicit wait if implicit wait waits for time as needed for element creation
		//its because if el3 is expected to be created in 2sec wait time but takes actually 4 sec to create, we wouldn't know it's meeting expectation if implicit wait of 5 sec is used
		//in this case, we can use explicit wait for particular element el3
		
		//similarly, if 99 out of 100 takes less than 5 sec for wait and 1 ele takes 20 sec,
		//then you want to explicitly wait on that particular element so you dont miss other element's wait time discrepancy from expected wait times
		
		
		WebElement ele = driver.findElement(By.id("contact-us"));
		WebDriverWait waitE = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebDriverWait waitF = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		waitE.until(ExpectedConditions.visibilityOf(ele));
		waitF.until(ExpectedConditions.elementToBeClickable(ele));
		
	//	wait.until ExpectedConditions methods
		
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()
		
		
		//fluent wait

		//creating fluent wait first, then apply it to the particular element (just like explicit wait)
		//rarely used
		//if element cahnges every 2 sec from Hi to Bye to Thankyou, total time taken is 6 sec, but at every 2 sec, different text is present
		//so if you want to validate bye which occurs at 2 sec after Hi, then you use fluent wait and poll at every 2 sec to WebDriver expected element is there
		
		Wait <WebDriver> wait= 
				new FluentWait<WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(30)) //total wait time
				.pollingEvery(Duration.ofSeconds(5)) //at every checking interval
				.withMessage("trying to find bye")
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}

