import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susmita\\chromedriver_win32_update\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.findElement(By.cssSelector("[id='draggable']")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("[class='demo-frame']")));
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("[id='draggable']")).click();
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.cssSelector("[id='draggable']"));
		WebElement target=driver.findElement(By.cssSelector("[id='droppable']"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); 
		
	}

}
