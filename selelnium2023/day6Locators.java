package selelnium2023;

import org.openqa.selenium.chrome.ChromeDriver;

public class day6Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://127.0.0.1:5501/index.html");
     
		//8 Locators
     //By id attribute
     
     driver.close();
     
	}

}
