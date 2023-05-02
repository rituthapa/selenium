package selpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		//reading from file
		FileInputStream inputt= new FileInputStream(
				"C:\\Users\\Thapa\\eclipse-Rituworkspace\\Selenium\\src\\selpractice\\testt.properties");
		prop.load(inputt);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
//		if(browser=="chrome") {
//			System.setProperty("webdriver.chrome.driver","C:\\\\Browsers\\\\chromedriver.exe");
//			ChromeDriver driver = new ChromeDriver();
//			driver.get(prop.getProperty("baseurl"));
//		}
//		else {
//			System.setProperty("webdriver.chrome.driver","C:\\\\Browsers\\\\chromedriver.exe");
//			FirefoxDriver driver= new FirefoxDriver();
//		}
		
		//writing to the file
		FileOutputStream outputt = new FileOutputStream("C:\\Users\\Thapa\\eclipse-Rituworkspace\\Selenium\\src\\selpractice\\testt.properties");
		prop.setProperty("country", "USA");
		prop.store(outputt,"storing the country name");
	}

}
