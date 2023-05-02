package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//iframe: page inside a page // has its own html,head and body tag
		//to find any element that's inside iframe
		//need to switch to frame //by webelement //by index //or by Id or name; then find the element

		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		// switchto/frame/by webelement
//		WebElement iframe = driver.findElement(By.cssSelector("#frame"));
//		driver.switchTo().frame(iframe);
//		WebElement home = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));
//		if(home.isDisplayed()) {
//			System.out.println("testcase pass");
//		}
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		 //frame by index
		//driver.switchTo().frame(1);
		
		//frame by id or name
//		driver.switchTo().frame("iframeResult");
//		boolean h1 = driver.findElement(By.cssSelector("body > h1")).isDisplayed();
//		if(h1) {
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
		
		//totalnumberofframesinsideapage
		List <WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size()); //22
		
		
		//totalNumeberofLinksinsidepage //anything that has anchor tag; <a> tag
		List <WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());//15
		//int count =0;
		//to look for specific href attribute inside <a> tag; 
		//to get all the links //links are inside href attribute; loop thru it and getattribute(href)
		for(int i=0; i<totallinks.size();i++) {
			System.out.println(totallinks.get(i).getAttribute("href"));
		//count = count + 1;
		}
		//System.out.println(count);
		driver.quit();
		
		
	}

}
