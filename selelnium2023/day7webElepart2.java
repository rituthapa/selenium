package selelnium2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7webElepart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //getLocation(); //location of element by x and y coordinates
				//getSize(); //size of element by its height and width
				//getText(); //return whatever between opening and closing tag // <h1>hello</h1>
				//getAttribute();
				//getTagname();
				//getCssValue();
		
		
		//getLocation() //gives you location in x and y coordinates
		System.setProperty("webdriver.chrome.driver","C:\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement e1 = driver.findElement(By.cssSelector("h2"));
		Point p = e1.getLocation();
		System.out.println(p);
		System.out.println(p.x);
		int y = p.y;
		System.out.println(y);
		
		//getText() 
		//text is something that's written between opening and closing tag
		// <h1>Hello</h1> //here, text is hello 
		WebElement e2=driver.findElement(By.cssSelector("h2"));
		String txt=e2.getText();
		if(txt.contains("CONTACT US")) {
			System.out.println("testcase pass");
		}
		else {
			System.out.println("testcase fail");
		}
		
		//gettagName()
		WebElement e3=driver.findElement(By.name("first_name"));
		String tagname = e3.getTagName();
		System.out.println(tagname);
		
		
		//getSize() /gives size of element in width and height
		driver.get("https://www.amazon.com/amazonprime");
		
		WebElement e4=driver.findElement(By.cssSelector("#nav-logo-sprites"));
		Dimension size=e4.getSize();
		System.out.println(size);
		System.out.println(size.height);
		System.out.println(size.width);
		
		//on user action
		//we create element
		//we can retrieve element
		//we can update element
		//we can delete element
		
		//on user action
		//we can add attribute
		//we can retrieve attribute
		//we can update attribute value
		//we can delete value
		
		//getAttribute(nameofattribute)//you get valueof attribute
		WebElement e5=driver.findElement(By.cssSelector("#nav-logo-sprites"));
		System.out.println(e5.getAttribute("class"));;
//		driver.quit();
		
		//getcssValue()
		driver.get("file:///C:/Users/Thapa/OneDrive/Desktop/zorbaHTML/index.html");
		
		WebElement e6= driver.findElement(By.cssSelector(".makeup"));
		String cl = e6.getCssValue("color");
		System.out.println(cl); //output: rgba(255,0,0,1) //rgba: red,green,blue,alpha(opacity 0-1)
		
		driver.quit();
	}
}
