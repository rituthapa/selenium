package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class day16Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();

//there's an Action class in selenium to perform actions like double-click,content-click(right-click),draganddrop,hoverover,ect
//first build the action, then perform it

		//double-click
//		WebElement e = driver.findElement(By.cssSelector("#double-click"));
//		System.out.println(e.getAttribute("class"));
//		Actions a = new Actions(driver);
//		a.doubleClick(e).build().perform();
//		Thread.sleep(3000);
//
//		System.out.println(e.getAttribute("class"));
//
//		if (e.getAttribute("class").equals("div-double-click double")) {
//			System.out.println("Testcase pass");
//		}
//		driver.quit();

		//drag and drop //requires source and target in parameter //so find from where to drag and where to drop
//		Actions a =  new Actions(driver);
//		WebElement draggable= driver.findElement(By.cssSelector("#draggable"));
//		WebElement droppable= driver.findElement(By.cssSelector("#droppable"));
//		System.out.println(droppable.getText());
//		a.dragAndDrop(draggable, droppable).build().perform();
//		Thread.sleep(3000);
//		System.out.println(droppable.getText());
//		
//		if(droppable.getText().equals("Dropped!")) {
//			System.out.println("Testcase pass");
//		}
		
		//click and hold
//		Actions a=new Actions(driver);
//		WebElement e=driver.findElement(By.cssSelector("#click-box")); //copying css-selector for click&hold text ie "#click-box >p" doesn't work because that text changes after click&hold
//		System.out.println(e.getText());
//		a.clickAndHold(e).build().perform();
//		System.out.println(e.getText());
//		
//		if(e.getText().equals("Well done! keep holding that click now.....")) {
//			System.out.println("Testcase pass");
//		}
		
		//hover over //movetoElement
		Actions a=new Actions(driver);
		WebElement el=driver.findElement(By.cssSelector("div[style='float:right;']")); //or cssselector for that text ==> "#div-hover > div:nth-child(3) > button"
		a.moveToElement(el).build().perform();
		Thread.sleep(2000);
		//how to assert this
		//you can't assert hover over by itself , so to assert, next step is to click on the element you get when you hover over;
		//if clicking the next element gives you the expected output, testcase pass
		driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > div > a:nth-child(1)")).click();
		Thread.sleep(2000);
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		if(alertmsg.equals("Well done you clicked on the link!")) {
			System.out.println("Testcase pass");
		}
		driver.quit();
		
		//right-click //contextclick
//		Actions a = new Actions(driver);
//		WebElement ele=driver.findElement(By.cssSelector("#main-header"));
//		a.contextClick(ele).build().perform();
//		Thread.sleep(3000);
//		
//		driver.quit();
	}

}
