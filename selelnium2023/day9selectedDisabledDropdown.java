package selelnium2023;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day9selectedDisabledDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//selected&Disabled box
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		//testcase1 //checking lettuce is Enabled //ie, if it is clickable
		WebElement lettuceEle= driver.findElement(By.cssSelector("input[value='lettuce']"));
		WebElement cabbageEle= driver.findElement(By.cssSelector("input[value='cabbage']"));
		WebElement pumpkinEle= driver.findElement(By.cssSelector("input[value='pumpkin']"));
		
		
		Thread.sleep(1000);
		
		if(lettuceEle.isEnabled()) {
				System.out.println("testcase1 pass");
			}
			else {
				System.out.println("testcase1 fail");
			}
		
		
		//testcase2 //checking cabbageisdisabled
		 if(!(cabbageEle.isEnabled())) {
			 System.out.println("Testcase2 pass");
		 }
		 else {
			 System.out.println("Testcase2 fail");
		 }
		
		//testcase3 //pumpkinisdefaultselected
		 if(pumpkinEle.isSelected()) {
			 System.out.println("Testcase3 pass");
		 }
		 else {
			 System.out.println("Testcase3 fail");
		 }
		
		 
		 ///////////////////////DROPDOWN////////////////////////////
		 
		 //Select class only applies to 'dropdown element' with <select> tagname //not for auto-suggested dropdowns
		 //we need to pass the select element to the constructor
		 //we can select by text, by value, and by index
		 
		 WebElement e=driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		 Select se = new Select(e);
		 
		//select by index: select the element based on index //select by index
		// se.selectByIndex(3); //output is SQL
		 
		 //select by value: select the element based on attribute's value
		 //se.selectByValue("python"); //output is python
		 
		 //select by visible text: select the element based on text
		 se.selectByVisibleText("C#"); //output C#
		 
		 Thread.sleep(1000);
		 //driver.quit();
		 
		 //getalloptions method gives List of elements, then loop through it to get individual elements
		 List <WebElement> alloptions = se.getOptions();
		 System.out.println(alloptions); //this gives the reference only //loop it to get values
		 for(int i=0;i<alloptions.size();i++) {
			 System.out.println(alloptions.get(i).getText());
		 }
		
		 driver.quit();
	}

}
