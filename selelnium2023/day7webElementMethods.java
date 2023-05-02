package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7webElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//<h1 id = "one" class = "two" name = "nm">Hello</h1>
		WebElement checkBoxOne = driver.findElement(By.cssSelector("input[value ='option-1']"));
		//13 WebElement methods
		
		//sendKeys(); //to type text in it//add value in it : works on 'input' and 'textarea' element
		//clear(); whatever you write, will clear it;this also works on 'input' and 'text area' only
		//click(); //anything can be clicked //not just restricted to button
		//isDisplayed(); //true only when webelement is visible, boolean type, false when webelement not visible, if not seen but just overlapping, still isdisplayed is true 
		
		
		//isSelected(); //for dropdown and checkboxes
		//isEnabled(); //something that's interactable/clickable //false for the attribute that's disabled
		//submit(); //for forms //where type attribute is submit, you can use this method

		//getLocation(); //location of element by x and y coordinates
		//getSize(); //size of element by its height and width
		//getText(); //return whatever between opening and closing tag // <h1>hello</h1>
		//getAttribute();
		//getTagname();
		//getCssValue();
		
		
//		
//		//# Scroll down at end of the page
//				//d.findElement(By.tagName("Body")).sendKeys(Keys.END);
//				//d.findElement(By.cssSelector("a[id=\"popup-alerts\"]")).sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(5000);
//				
//				//# Scroll upto the element using JavaScript	
//				//WebElement Ele = d.findElement(By.cssSelector("a[id=\"popup-alerts\"]"));
//				//d.executeScript("arguments[0].scrollIntoView();", Ele);
//				
//				//# Scroll up to the top of the page
//				//d.findElement(By.tagName("Body")).sendKeys(Keys.HOME);
//				Thread.sleep(5000);
//		
//		driver.close();
		
	}

}
