package selpractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttoncheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		//////////////////// individual radio-button ////////////////////////////////
//		WebElement green = driver.findElement(By.cssSelector("input[value='green']"));
//		WebElement blue = driver.findElement(By.cssSelector("input[value='blue']"));
//		green.click();
//		
//		//assertion for radio-button //if one option is clicked and selected, other's should be unclicked/unselected
//		if(green.isSelected() && !blue.isSelected()) {
//			System.out.println("testcase pass");
//		}
//		
//		 /////////////////////list of radio-buttons//////////////////////////////////////
//		 
//		List <WebElement> buttons = driver.findElements(By.cssSelector("input[name='color']"));
//		 Iterator<WebElement> i = buttons.iterator();
//		 
//		 //to assert if one is selected, the next is not selected
//		  while(i.hasNext()) {
//			  i.next().click();
//			  System.out.println("element selected");			
//			  Thread.sleep(2000);
//			  if(i.hasNext() && !i.next().isSelected()) {
//				  System.out.println("Next element is not selected"); //prints this twice because
//			  }
//			//  else {
//			//	  System.out.println("element is selected"); //last element purple will be selected
//			//  }
//		  }
		  
		  ////////////////////////check-boxes/////////////////////////////////////
		  List <WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		  for(int ii=0;ii<checkboxes.size();ii++) {
		 Thread.sleep(2000);
		  if(checkboxes.get(ii).isSelected()) {
			  System.out.println("already selected");
		  }
		  else {
			  checkboxes.get(ii).click();
		  }
		  }
		  //assertion //all checkboxes should be selected
		  for(int iii=0;iii<checkboxes.size();iii++) {
			  if(checkboxes.get(iii).isSelected()) {
				  System.out.println("Testcase pass");
			  }
			  else {
				  System.out.println("Testcase fail");
			  }
		 
		  }
		  driver.quit();
	}

}
