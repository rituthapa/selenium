package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7webEle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Database ---------- API ---------- UI (html,css,useraction)
		// html hypertext markup language 
				// css
				// javascript
				// element - html elements
				// html elements will have attribute and value 
				// on user actions 
				// element are created , updated , retrieve and deleted
				// based on user action 
				// html element's attribute are created , updated , retrive , deleted
		
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		
//		WebElement fn=driver.findElement(By.name("first_name"));
//		WebElement ln=driver.findElement(By.name("last_name"));
//		WebElement email=driver.findElement(By.name("email"));
//		WebElement comments=driver.findElement(By.name("message"));
//		WebElement sub=driver.findElement(By.cssSelector("input[type='submit']"));
//		
//		//sendKeys("value") //to type on the webelement //to send the values
//		//usually with tagname 'input' and 'textarea'
//		fn.sendKeys("ritu");
//		ln.sendKeys("thapa");
//		email.sendKeys("rituthapakunwar@gmail.com");
//		comments.sendKeys("hello all");
//		
//		//clear(); //input and textarea
//		fn.clear(); //removes the input value in firstname field //clears the text out
//		
//		//click() //you click the submit button //click for buttons //but you can click any webElement so not specific to buttons only
//		//sub.click();
//		
//		//submit() //you submit the info //used in forms
//		sub.submit(); //click and submit method does same thing here
		
driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

Thread.sleep(3000);
//isSelected  //to check if the given value is selected or not //for this, press click to select something and assert by is selected method
boolean el1= driver.findElement(By.cssSelector("input[value='lettuce']")).isEnabled();
boolean el2=driver.findElement(By.cssSelector("input[value='cabbage']")).isEnabled();
System.out.println(el1);
System.out.println(el2);


Thread.sleep(3000);
//isEnabled  //to check if the given value is Interactable/clickable or not ie, something that's not enabled is disabled and isn't able to click, so, cant be selected too
driver.findElement(By.cssSelector("input[value='green']")).click();
boolean eleSelected1=driver.findElement(By.cssSelector("input[value='green']")).isSelected();
boolean eleSelected2=driver.findElement(By.cssSelector("input[value='blue']")).isSelected();
System.out.println(eleSelected1);
System.out.println(eleSelected2);
 driver.close();
		
	}

}
