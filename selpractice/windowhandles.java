package selpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");

		driver.findElement(By.cssSelector("#contact-us")).click();
		String parentTab = driver.getWindowHandle();
		Set<String> allTabs = driver.getWindowHandles();
		Iterator<String> i = allTabs.iterator();

		while(i.hasNext()) {
			String childTab= i.next();
			if(!parentTab.equals(childTab)) {
				driver.switchTo().window(childTab);  //switch to childtab ie,2nd tab
			}
		}
		

//		String firstTab = i.next();
//		System.out.println(firstTab);
//
//		String secondTab = i.next();
//		System.out.println(secondTab);
//		driver.switchTo().window(secondTab);
//		driver.switchTo().window(firstTab); //switching between first and second tab

		if (driver.getTitle().equals("WebDriver | Contact Us")) {
			System.out.println("testcase pass");
		} else {
			System.out.println("testcase fail");
		}

		driver.switchTo().window(parentTab); //switch to parenttab ie, 1st tab
		WebElement heading = driver.findElement(By.cssSelector("#nav-title"));
		if (heading.isDisplayed()) {
			System.out.println("Testcase pass");
		} else {
			System.out.println("Testcase fail");
		}
	}

}
