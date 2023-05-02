package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//selected&Disabled box
				System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
				
				WebElement pumpkin = driver.findElement(By.cssSelector("input[value='pumpkin']")); //because pumpkin is default selected
				if(pumpkin.isSelected()) {
					System.out.println("testcase pass");
				}
				
				WebElement lettuce = driver.findElement(By.cssSelector("input[value='lettuce']"));
				if(lettuce.isEnabled()) {
					System.out.println("testcase pass");
				}
				
				WebElement cabbage = driver.findElement(By.cssSelector("input[value='cabbage']"));
				if(!cabbage.isEnabled()) {
					System.out.println("testcase pass");
				}
				
				////////////////////////////////// DropDown Menu : select class ////////////////////////////////////////
				
				WebElement el = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
				Select sel= new Select(el);
				//select by visible Text
				
//				sel.selectByVisibleText("Python");
//				Thread.sleep(1000);

				//select by Index
					
//				sel.selectByIndex(1);
//				Thread.sleep(1000);
				
				//select by value //attribute value
				
			//	sel.selectByValue("sql");
				
			//get all options of dropdown menu
				
				List<WebElement> alloptions = sel.getOptions();
				System.out.println(alloptions); //gives reference to list of elements
				for (int i=0; i<alloptions.size(); i++) {
					System.out.println(alloptions.get(i).getText()); //gives you text of all elements
				}
				
				
			//	driver.quit();
				
	}

}
