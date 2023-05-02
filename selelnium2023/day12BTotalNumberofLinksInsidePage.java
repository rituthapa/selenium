package selelnium2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day12BTotalNumberofLinksInsidePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to check total no of links inside page //look for anchor tag ie, <a> tag
		
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
		List <WebElement> aList = driver.findElements(By.tagName("a"));
		System.out.println(aList.size());
		
		//to get all the links //links are inside href attribute
//		int count=0;
		for(int i=0;i<aList.size();i++) {
			//System.out.println(aList.get(i).getText());
			System.out.println(aList.get(i).getAttribute("href"));
//			count=count+1;
		}
//		System.out.println(count);
		
		driver.close();
		 //to get total no of iframes inside a page
//		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
//		List<WebElement> iframetotal = driver.findElements(By.tagName("iframe"));
//		System.out.println(iframetotal.size()); //1 only
	}

}
//look for anchor tag <a> tag, and href in particular, because href contains links
//and even more particularly, look for the ones that has https in url because those links are the true links that open a different website/webpage