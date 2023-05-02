package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		//Locators
		//By id attribute
		driver.findElement(By.id("main-header")).isDisplayed();
		
		//By className attribute
		driver.findElement(By.className("navbar-header")).isDisplayed();
		
		//By tagName attribute
		driver.findElement(By.tagName("h1")).isDisplayed();
		
		//By name attribute
		driver.findElement(By.name("viewport")).isDisplayed();
		
		//By cssSelector
		driver.findElement(By.cssSelector("div[id='nav-container']")).isDisplayed();
		
		driver.get("http://www.webdriveruniversity.com/");
		
		Thread.sleep(3000);
		
		//By linktext attribute
		//driver.findElement(By.linkText("LOGIN PORTAL")).isDisplayed(); //error //login portal is not entire text //can be seen from javascript //more text in it.. //also clicked from any of the desciprtion text of login portal
		driver.findElement(By.linkText("Automationteststore")).isDisplayed();
		
		//By partial linktext attribute
		driver.findElement(By.partialLinkText("PORTAL")).isDisplayed();
		
		//By xpath
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[2]")).isDisplayed();
		driver.findElement(By.xpath("//*[@id=\"ajax-loader\"]/div/div[1]/h1")).isDisplayed();
		
		//??how to find unique xpath?? //or just randomly copy xpath
		
		driver.quit();
		
//		// Locate the element by Css selector
//		driver.findElement(By.cssSelector("#checkboxes")).isDisplayed();
		
		//<h1 id = "one"  class = "two"  name = "nm">Hello</h1>
		//by cssSelector you can write following ways
		//#one -csselector id
		//.two -cssselector class
		//h1- cssselector tagname
		//h1[name='nm'] - cssselector tagname[attribute='value']
	}

}
