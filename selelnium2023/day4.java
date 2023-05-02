package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Arrange
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Test case 1 //valid login
		//action //first thing on action is always to findelement
//		Thread.sleep(3000);
//		WebElement username= driver.findElement(By.cssSelector("input[name='username']"));
//		WebElement password= driver.findElement(By.cssSelector("input[placeholder='Password']"));
//		WebElement loginbutton= driver.findElement(By.cssSelector("button[type='submit']"));
//		
//		username.sendKeys("Admin");
//		password.sendKeys("admin123");
//		loginbutton.click();
//		
//		Thread.sleep(3000);
		
		//Assertion //u can validate with anything that shows in homepage
		//example here is "a logo image of homepage is seen"
		
//		WebElement logo= driver.findElement(By.cssSelector("img[alt='client brand banner']"));
//		boolean imgseen = logo.isDisplayed();
//		if(imgseen) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		
		
		//Test case 2 //invalid login
		//action
//		Thread.sleep(3000);
//		WebElement username= driver.findElement(By.cssSelector("input[name='username']"));
//		WebElement password= driver.findElement(By.cssSelector("input[placeholder='Password']"));
//		WebElement loginbutton= driver.findElement(By.cssSelector("button[type='submit']"));
//		
//		username.sendKeys("admin");
//		password.sendKeys("admin12");
//		loginbutton.click();
//		
//		Thread.sleep(3000);
//		//assertion //error msg should be seen
//		WebElement errormsg= driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p oxd-alert-content-text']"));
//		if(errormsg.isDisplayed()) {
//			System.out.println("'Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");9
//		}
//		
		
		// Test case 3 //forgot password
				//action
//				Thread.sleep(3000);
		
//				WebElement forgotbutton = driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
//				forgotbutton.click();
//				
//				//assertion //a reset password page should open
//				//to validate this , check if the substring 'requestPasswordResetCode' is present in url
//				Thread.sleep(2000);
//				String currenturl = driver.getCurrentUrl();
//				System.out.println(currenturl);
//				if(currenturl.contains("requestPasswordResetCode")) {
//					System.out.println("Test case pass");
//				}
//				else{
//					System.out.println("Test case fail");
//				}
				
		
		
		
		
		//Test case 4 //logo is displayed in login page itself
		driver.manage().window().maximize(); //maximize the window
		Thread.sleep(3000);
		WebElement brandimage = driver.findElement(By.className("orangehrm-login-branding"));
		if(brandimage.isDisplayed()) {
			System.out.println("Testcase Pass");
		}
		else {
			System.out.println("Test case fail");
		}

		driver.quit(); //closes all tabs 
		//driver.close(); //closes only the current tab
		}
}


//WebElement methods? //3 methods
//.sendKeys //this is to pass actual values
//.click //to click a button
//.isDisplayed //to verify something is displayed, it's a boolean type

//driver methods? 
//.get("url")
//.findElement(By.


//findElement(By.id("") //search in web by Ctrl F #idname
//(By.className("") //search by .classname
//(By.cssSelector("") //search by tagname[attribute='value']

//all these web element finding should be unique ie; 1 0f 1
// to find, first open url
//on anywhere in the page, right click and inspect
// on three dots, select where to view inspect window, bottom is easier //this step is optional
//on left side of inspect window, click inspect button and hover over to real page what element you want to inspect
//then Ctrl + F to see if locator that you choose to find element is unique; ie 1 to 1



