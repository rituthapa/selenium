package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam1reset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// testcase with reset button
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
		WebElement lname = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
		WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		WebElement comments = driver.findElement(By.cssSelector("textarea[name=\"message\"]"));
		fname.sendKeys("ritu");
		lname.sendKeys("thapa");
		email.sendKeys("ritu123");
		comments.sendKeys("hello");
		Thread.sleep(3000);

		System.out.println("firstname before reset is " + fname.getAttribute("value")); // fname value before reset
																						// //should be ritu
		WebElement reset = driver.findElement(By.cssSelector("input[type=\"reset\"]"));
		reset.click();
		Thread.sleep(3000);

		System.out.println("firstname after reset is" + fname.getText()); // fname value after reset //should be empty
		// .gettext() or .getAttribute("value") both methods returns the value in the webelement field
		

		if (fname.getAttribute("value").isEmpty() && lname.getText().isEmpty() && email.getText().isEmpty()) {
			System.out.println("testcase pass");
		} else {
			System.out.println("testcase fail");
		}

		//driver.close();

//		
//		 String apple = fname.getAttribute("value");
//		 if(apple.isEmpty()) {
//			 System.out.println("TEST PASS");
//		 }else {
//			 System.out.println("TEST FAIL");
//		 }
//		 try {
//			 (fname.getAttribute("value")).isEmpty();
//			 (lname.getAttribute("value")).isEmpty();
//			 email.getAttribute("value").equals("");	//.isempty() and .equals("") returns empty value only		 
//			 comments.getAttribute("value").equals("");
//			 System.out.println("TEST PASS");
//
//		 }
//		 catch(Exception e){
//			 System.out.println("TEST FAIL"+e);
//		 }

	}

}
