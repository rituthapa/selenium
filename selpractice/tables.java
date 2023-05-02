package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

		//.how to find sum of first three ages
		//technique to retrieve element inside table anywhere
		//first find total number of tables
		//then total number of rows
		//then total number of columns
		//then loop thru each row/column to reach the element; then perform the required action on it
		//tip: finding element by Xpath is easier for tables
	List <WebElement> tables = driver.findElements(By.tagName("table"));
	System.out.println(tables.size());
	List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
	System.out.println(rows.size()); //4
	List <WebElement> columns = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
	System.out.println(columns.size());
	
	//age is always in 3rd column , but rows keeps on changing for each age value; so loop thru rows
//	xpath //*[@id="t01"]/tbody/tr[2]/td[3] is for 45 //2nd row
	      //*[@id="t01"]/tbody/tr[3]/td[3] is for 94 //3rd row
	      //*[@id="t01"]/tbody/tr[4]/td[3] is for 20 //4th row
	 
	int sum=0;
	for(int i=2;i<=rows.size();i++) {
		WebElement age = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]"));
		sum = sum + Integer.parseInt(age.getText()); //changing String of age.getText to integer // "45" ===> 45
	}
	System.out.println(sum); // 45+94+20  // "45" ===> 45 //159
	
	//find person with lastname "jackson"
	
	for(int i=2; i<=rows.size();i++) {
		String lastname = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[2]")).getText();
		if(lastname.equals("Jackson")) {
			System.out.println(lastname + " is found: testcase pass");
		}
	}
	driver.quit();
	}

}
