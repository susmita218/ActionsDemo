import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susmita\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		
		//pass keys in search box
				WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
						a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("pendrive").doubleClick().build().perform();
		
		
		//moves to specific element
		WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();
		
		
	}

}
