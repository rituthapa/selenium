package selelnium2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day15Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

		// question: find the sum of first three ages

		// first find total number of tables
		// then find total no. of rows
		// then total no. of columns
		// loop through the rows and columns to get text of element
		// convert text to necessary data-type to perform the desired action
		// perform the action on the content you get from the table

//		// first find total number of tables 
//		List<WebElement> tables = driver.findElements(By.xpath("//*[table]")); //gives you 2 tables only
//		System.out.println(tables.size());
		
		List <WebElement> tables = driver.findElements(By.tagName("table"));
		System.out.println(tables.size()); //3 tables total
		
		// then find total no. of rows //4 rows in table 1
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='t01']/tbody/tr"));
		int totalrows = rows.size();
		System.out.println(totalrows);
		// then total no. of columns //here 3 columns in each row
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='t01']/tbody/tr[2]/td"));
		int totalcolumns = columns.size();
		System.out.println(totalcolumns);

		// //table[@id="t01"]/tbody/tr[1]/td[3]
		// //table[@id="t01"]/tbody/tr[2]/td[3]
		// //table[@id="t01"]/tbody/tr[3]/td[3]

		// now, loop/iterate through the rows to get the text of the third column of
		// each row
		// List <WebElement> age =
		// driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td[3]"));
		int sum = 0;
		for (int i = 2; i <= totalrows; i++) {// i=2 because i=1 has headers only; actual data present from 2nd row,
												// here i is row position,which is 2
			String txt = driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[" + i + "]/td[3]")).getText();
			int age = Integer.parseInt(txt);
			sum = sum + age; // 45+94+20  // "45" ===> 45 //159
		}
		System.out.println(sum);
		
		//find person with lastname "jackson"

		// check if there's any "jackson" as lastname
		for (int i = 2; i <= totalrows; i++) {
			String lastname = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[2]")).getText();
			// System.out.println(lastname); //prints smith, jackson and breaks at jackson,
			// so dont print lastname after that
			if (lastname.equals("Jackson")) {
				System.out.println("testcase pass");
				break;
			}

		}

		driver.quit();
	}

}
