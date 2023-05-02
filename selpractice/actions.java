package selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		//double-click
		Actions action = new Actions(driver);
//		WebElement doubleclickEle = driver.findElement(By.cssSelector("#double-click"));
//		System.out.println("class value before is " + doubleclickEle.getAttribute("class"));
//		action.doubleClick(doubleclickEle).build().perform();
//		//while double clicking; notice the change in element; what is changing? 
//		//one is color//hard to validate; next is value of class attribute 
//		System.out.println("class value before is " + doubleclickEle.getAttribute("class"));
//		if(doubleclickEle.getAttribute("class").equals("div-double-click double")){
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
		
		//drag and drop
		//find element to be dragged and place where it's to be dropped
//		WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
//		WebElement droppable = driver.findElement(By.cssSelector("#droppable"));
//		action.dragAndDrop(draggable, droppable).build().perform();
//		
//		if(droppable.getText().equals("Dropped!")) {
//			System.out.println("testcase pass");
//		}
		
		//click and hold
//		
//		WebElement clickbox = driver.findElement(By.cssSelector("#click-box"));
//		System.out.println("text before click&Hold is " + clickbox.getText());
//		action.clickAndHold(clickbox).build().perform();
//		Thread.sleep(1000);
//		System.out.println("text during click&Hold is " + clickbox.getText());
//		if(clickbox.getText().contains("keep holding")) {
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
//		action.release().build().perform();
//		System.out.println("text after click&Hold is " + clickbox.getText());
		
		//hover over //movetoElement
		WebElement thirdbutton = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
		action.moveToElement(thirdbutton).build().perform();
		driver.findElement(By.linkText("Link 1")).click();
		if(driver.switchTo().alert().getText().equals("Well done you clicked on the link!")) {
			System.out.println("testcase pass");
		}
		else {
			System.out.println("testcase fail");
		}
		
		//right-click //contextclick
		action.contextClick(thirdbutton).build().perform();
		driver.quit();
	}

}
