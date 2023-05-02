package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestedDropbox {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		driver.findElement(By.id("myInput")).sendKeys("p");
		//two ways to dropdown //one: by looping through it and reaching the element and click it
		//next is by arrowing down until you reach the one you want
		List<WebElement> food = driver.findElements(By.cssSelector("#myInputautocomplete-list >div")); // you have to reach to the items while selecting element so >div after id
		for(int i=0;i<food.size();i++) {
			String fooditem =food.get(i).getText();
			System.out.println(fooditem);
			if(fooditem.equals("Pancakes")){
				food.get(i).click();
				Thread.sleep(1000);
				
				driver.findElement(By.id("submit-button")).click();
				//break; //breaks the loop after pancakes
			}
		}
		//assertion //when pancakes click, then new currenturl contains pancakes, you can assert that
		String url = driver.getCurrentUrl();
		if(url.contains("Pancakes")) {
			System.out.println("Testcase pass");
		} 
		else {
			System.out.println("Testcase fail");
		}
		}
}
