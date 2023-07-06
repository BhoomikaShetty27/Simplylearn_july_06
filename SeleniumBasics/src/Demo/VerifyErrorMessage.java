package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	
	public static void main(String[] args) {
		//1)Open the browser
		ChromeDriver driver = new ChromeDriver();//class object = new class()
		
		//2)navigate to application 
		driver.get("https://facebook.com");
		
		//3)Enter invalid username 'batman554466@gmail.com' in the 'Email address or phone number' textbox
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
		
		//4)Enter invalid password "password@123" in the 'Password' textbox
		driver.findElement(By.id("pass")).sendKeys("password@123");
		
		//5)Click login button
		driver.findElement(By.name("login")).click();
		
		//6)Verify user sees the error message - "The email address you entered isn't connected to an account. Find your account and log in"
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		//String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String actualErrMsg = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
		
		
		//System.out.println(expectedErrMsg);//if test case failed we can use this
		//System.out.println(actualErrMsg);

		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		
		//7)Close the browser
		driver.quit();	
				
}
	
}
