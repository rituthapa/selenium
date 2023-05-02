package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// validate the title
	    // validate the url
	    // use all 8 locator to find elements and provide isdisplayed


		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		String title=driver.getTitle();
		System.out.println("Title of the page is "+ title);
		if(title.contains("Online Banking")) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current URL is " + currentUrl);
		if(currentUrl.contains("index")) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
				
		WebElement l1 =driver.findElement(By.id("loginPanel"));
		if(l1.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		WebElement l2 = driver.findElement(By.name("login"));
		if(l2.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		WebElement l3 = driver.findElement(By.className("caption"));
		if(l3.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		WebElement l4 = driver.findElement(By.tagName("h2"));
		if(l4.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		WebElement l5 = driver.findElement(By.cssSelector("input[type='text']"));
		if(l5.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		WebElement l6 = driver.findElement(By.linkText("Register"));
		if(l6.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		WebElement l7 = driver.findElement(By.partialLinkText("login"));
		if(l7.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		WebElement l8 = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h4"));
		if(l8.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		driver.close();
	}

}
