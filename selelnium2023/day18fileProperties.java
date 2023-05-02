package selelnium2023;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day18fileProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// reading from the file //fileinputstream ---> load(fileobject) ---> getProperty("key")
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(
				"C:\\Users\\Thapa\\eclipse-Rituworkspace\\Selenium\\src\\selelnium2023\\test.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);

		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver","C:\\\\Browsers\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("baseurl"));
		}
		else {
			System.setProperty("webdriver.chrome.driver","C:\\\\Browsers\\\\chromedriver.exe");
			FirefoxDriver driver= new FirefoxDriver();
		}

		// writing into the file //FileOuputStream ---> setProperty("key","value") ----> store(fileobject,"comments")
		FileOutputStream output = new FileOutputStream(
				"C:\\Users\\Thapa\\eclipse-Rituworkspace\\Selenium\\src\\selelnium2023\\test.properties");
		prop.setProperty("country", "USA");
		prop.store(output, "storing the country");
	}

}
