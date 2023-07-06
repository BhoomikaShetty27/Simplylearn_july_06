package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	
	public static void main(String[] args) {
	//1)Open the browser
	ChromeDriver driver = new ChromeDriver();//class object = new class()
	
	//2)navigate to application 
	//Object.method()
	driver.get("https://www.facebook.com");
	
	//3)Verify the visitor on the page sees the title - 'Facebook - log in or sign up'
	String expectedTitle = "Facebook - log in or sign up";
	String actualTitle = driver.getTitle();
	
	System.out.println(expectedTitle);
	System.out.println(actualTitle);
	
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Test case Passed");
	}
	else {
		System.out.println("Test case Failed");
	}
	
	
	//4)Close the browser
	driver.quit();	
	}

}
