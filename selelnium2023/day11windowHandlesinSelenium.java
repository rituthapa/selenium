package selelnium2023;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11windowHandlesinSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// without handling windows, when another tab opens from clicking something in current tab, selenium code works only for the parent/first tab
		//windowHandling: is done when another tab opens from clicking something in current tab; at that time window handles used to go to desired tab
		//and also to switch back and forth to whichever tab we want to work on
		
		//two methods
		//getwindowHandle : reaches the first window//parent window
		//getwindowHandles: set (hashSet) of all tabs opened
		
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		//firstly, findelement for contactus and click it
		Thread.sleep(2000);
		WebElement contact = driver.findElement(By.id("contact-us"));
		contact.click();
		//contact page opens in another tab // we can assure this with target="_blank" attribute inside <a> tag
		//now we need to go to second tab to perform action in contact page //use windowhandles to go to next tab
		String parent=driver.getWindowHandle(); //this will always refer back to initial tab
		System.out.println(parent);
		Set <String> allTabs=driver.getWindowHandles(); 
		System.out.println(allTabs);
		Iterator <String> i = allTabs.iterator();
		String firsttab=i.next();
		System.out.println(firsttab);
		String secondtab=i.next();
		System.out.println(secondtab);
		driver.switchTo().window(secondtab);
		
		//another way // instead of individual next, you can loop thru the iterator
//		while(i.hasNext()){
//			String child= i.next();
//			if(!parent.equals(child)){
//				driver.switchTo().window(child);
//			}
//		}
		//now assert the element in the contactus page
		if(driver.getTitle().equals("WebDriver | Contact Us")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		
		//now to go back to firsttab and assert/do something there
		driver.switchTo().window(firsttab);
		WebElement heading=driver.findElement(By.cssSelector(".navbar-brand"));
		if(heading.isDisplayed()) {
			System.out.println("testcase pass");
		}
		else {
			System.out.println("testcase fail");
		}
		driver.quit();
	}

}
