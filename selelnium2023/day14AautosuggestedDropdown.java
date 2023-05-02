package selelnium2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day14AautosuggestedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		//there's two ways you can select autosuggested elements of autodropdowns
		//either by typing first letter and find list of all options, once you hover on the option "#id >div", loop thru it, click on the desired one, then find submit button and click it
		
		//or, after typing first letter and options on dropdown appears, use arrow down key to navigate to the desired options and click it, then submit
		
		//way 1
		WebElement e = driver.findElement(By.id("myInput"));
				e.sendKeys("p");
	List <WebElement> list= driver.findElements(By.cssSelector("#myInputautocomplete-list >div")); //you have to reach to the first element (> div) (shows 1 of 3) to loop thru it
	for(int i=0;i<list.size();i++) {
		//System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("Pancakes")) {
			list.get(i).click();
			break;
		}
	}
	Thread.sleep(3000);
driver.findElement(By.cssSelector("#submit-button")).click();

//for assertion, try to see if url contains pancakes
if(driver.getCurrentUrl().contains("Pancakes")) {
	System.out.println("Testcase pass");
}
else {
	System.out.println("Testcase fail");
}
	}
}
