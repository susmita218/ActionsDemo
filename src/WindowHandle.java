import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susmita\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("[class='blinkingText']")).click();
	
		Set<String> windows=driver.getWindowHandles(); //[parent window and child window]
		Iterator<String> itr=windows.iterator();
		String parentid=itr.next(); //parent window
		String childid=itr.next(); //childid
		driver.switchTo().window(childid);
		driver.findElement(By.cssSelector("[class='im-para red']")).getText();
		String emailid=driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentid);
driver.findElement(By.cssSelector("[name='username']")).sendKeys(emailid);
		
		
		
	}

}
