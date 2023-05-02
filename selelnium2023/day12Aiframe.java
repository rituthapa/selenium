package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day12Aiframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");

//		driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")); //error: no such element
		// errored above because Home button element that we are trying to find is
		// within <iframe> tag, not on parent html page

		// iframe: Page inside a page; has its own <html>,<head> and <body> tags
		// to find home element, first need to switch to that iframe page (innerpage)
		// three ways to get to iframe //by webelement //by index //By Id or name

		// by webelement
//		WebElement ifrm=driver.findElement(By.id("frame")); //first find webelement with iframe in it
//		driver.switchTo().frame(ifrm); 
//		
//		WebElement homeEle = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a"));
//		if(homeEle.isDisplayed()) {
//			System.out.println("Testcase pass by webelement");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}

		// for W3schools
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");

		// iframe by index
		
		driver.switchTo().frame(1); 
		boolean h1 = driver.findElement(By.xpath("/html/body/h1")).isDisplayed();
		if (h1) {
			System.out.println("Testcase pass by index");
		} else {
			System.out.println("Testcase fail");
		}
		driver.close();

		// switch to iframe By Id or name  //the name or id attrribute both has same value iframeResult
		//just pass the id or name attribute's value in .frame("   ")

//		 driver.switchTo().frame("iframeResult");
//		 boolean h1 = driver.findElement(By.xpath("/html/body/h1")).isDisplayed();
//			if (h1) {
//				System.out.println("Testcase pass by Id/name");
//			} else {
//				System.out.println("Testcase fail");
//			}
//			driver.close();
		
		
		//when .frame method used to switch to iframes, it's using polymorphism's 'Overloading concept' from OOps concept in java
		//because method name and body is same but the signature/parameters are different, finding frame either by webelement or index or id/name, will find the same thing with any of the three ways/parameters
		
		
		//another overloading example is select class for dropdown menu where you can select either by text or index or attribute's value
		//so, same method, same class Select but different arguments passed : either text or index or value
		
		
		//getting total no of iframes inside a page
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //5 //why?
		
		
	}

}
