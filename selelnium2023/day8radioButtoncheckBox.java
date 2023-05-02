package selelnium2023;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8radioButtoncheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		/////////////////////////// individual radio buttons ////////////////////////////////
		//testcase 1
		//to validate if a radiobutton is selected, other button is not selected
		WebElement greenEle = driver.findElement(By.cssSelector("input[value='green']"));
		WebElement blueEle = driver.findElement(By.cssSelector("input[value='blue']"));
		greenEle.click();
		
		if(greenEle.isSelected()) {
			System.out.println("testcase1partA passed");
			if(!(blueEle.isSelected())) {
				System.out.println("testcase1 pass");
			}
			else {
				System.out.println("testcase1 fail");
			}
		}
//		either write if inside if like above //or like below where join two conditions by AND
//		if (greenEle.isSelected() && !(blueEle.isSelected())) {
//			System.out.println("Testcase pass");
//		} else {
//			System.out.println("Testcase fail");
//		}
		//driver.quit();
		
		//////////////////////// radio buttons list /////////////////////////////////
		
//		WebElement box3=driver.findElement(By.cssSelector("form[class='radio-buttons']"));
//		List <WebElement> radioB= box3.findElements(By.cssSelector("input[name='color']"));
//
//		for(int i=0;i<radioB.size();i++) {
//			Thread.sleep(1000);
//			radioB.get(i).click();
//			// System.out.println(radioB.get(i).getText()); //getText doesnt works why? there's a text right? so why not working
//			System.out.println(radioB.get(i).getAttribute("value"));
//		}
		
		
		////////////////////// CheckBoxes ///////////////////////////////////////
		//test case 2
		//to validate if you can select all of the checkboxes
		List <WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']")); //ctrl F should show 1of4//list<webElement> is same as arraylist<datatype> for findElements method
		Thread.sleep(2000);
		for (int i=0;i<checkboxes.size();i++) {
			if(!(checkboxes.get(i).isSelected())){ //if not! (valueofcheckboxesisselecected(); then click
			checkboxes.get(i).click();
			//this above condition is needed because option3 is default selected/checked,
			//we want to use click method only for the unselected ones, so that it selected them too
			//so if you click it without this condition, it will click option3 too and deselect it and testcase fails for option3
			}
			else {
				System.out.println("Already selected");
			}
			if(checkboxes.get(i).isSelected()) {
				System.out.println("Testcase2 pass");
			}
			else {
				System.out.println("Testcase2 fail");
			}
		}
		
		///or///// sir's way
		// Checkbox
//		List <WebElement> cb = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
//		for(int i = 0 ; i < cb.size() ; i++) {
//			if(cb.get(i).isSelected()) {
//				System.out.println("Already selected");
//			}
//			else {
//				cb.get(i).click();
//			}
//		}
//		
//		for(int i = 0 ; i < cb.size() ; i++) {
//			System.out.println(cb.get(i).isSelected());
//			
//		}
		
		////////////////////////////// radiobuttons list again///////////////////////////
		
		//testcase3 //testcase1 but using findElementS method 
		//to list all radiobuttons and finding only one is selected when clicked ???(while others should be deselected)
		//using iterators
		List <WebElement> radiobuttons= driver.findElements(By.cssSelector("input[name='color']")); //CtrlF should show 1of5 //donot use "form[id='radio-buttons']", because even if it's unique it shows the whole box as one element, instead of individual elements
		Iterator<WebElement> rb = radiobuttons.iterator();
	//for(int i=0;i<radiobuttons.size();i++) {	
	radiobuttons.get(0).click();
		while(rb.hasNext()) {
			//rb.next().click();
	System.out.println(rb.next().isSelected());
		}
	//}
		
		
//		while(rb.hasNext()) {
//			rb.next().click();
//			System.out.println(("isSelected"));
//			if((!(rb.next().isSelected())) && rb.hasNext()) {
//	System.out.println("testcase3 partA passed");
//				rb.next().click();
//				
//				}
//			else {
//				System.out.println("testcase3 fail");
//			}
//			
//		}
		
//	for(int i=0;i<radiobuttons.size();i++) {
//		radiobuttons.get(i).click();
//		Thread.sleep(1000);	
//		while(rb.hasNext()) {
//			System.out.println((rb.next().isSelected()));
//		}
//	}
		
//	while(rb.hasNext()) {
//		Thread.sleep(1000);
//		rb.next().click();
//		if(rb.next().isSelected()) {
//			System.out.println("testcase3 pass");
//		}
//		else{
//			System.out.println("testcase3 fail");
//		}
//	}
	
//		if(rb.next().isSelected() && rb.hasNext()) {
//			System.out.println("testcase3 partA passed");
//			if(!(rb.next().isSelected())) {
//				System.out.println("testcase3 pass");
//			}
//			else {
//				System.out.println("testcase3 fail");
//			}
//		}
//		else {
//			System.out.println("testcase3 partA fail");
//		}
//	}
		
		
	
		driver.quit();
	}

	}

//if(radiobuttons.get(i).isSelected()) {
//	System.out.println("testcase3partA pass");
//}
//else {
//	System.out.println("testcase3 fail");
//}



//List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));
//
//// iterate through every radio button in the group
//for (int i = 0; i < radioButtons.size(); i++) {
//  // click on the radio button
//  radioButtons.get(i).click();
//  
//  // check if the next radio button is not already selected
//  if (i < radioButtons.size() - 1 && !radioButtons.get(i+1).isSelected()) {
//      System.out.println("Next radio button is not selected.");
//  }
//}
//

// 10 --- 3


//List<WebElement> radioButtonss = driver.findElements(By.cssSelector("input[name='color']"));

// iterate through every radio button in the group
//Iterator<WebElement> iterator = radioButtonss.iterator();
//
//
//while (iterator.hasNext()) {
//	// click on the radio button
//	WebElement radioButton = iterator.next();
//	radioButton.click();
//	Thread.sleep(2000);
//
//	// check if the next radio button is not already selected
//	if (iterator.hasNext() && !iterator.next().isSelected()) {
//		System.out.println("Next radio button is not selected.");
//	}
//
//}

