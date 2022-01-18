import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pacharla\\Desktop\\vamsi selenium\\Drivers\\Chrome\\chromedriver.exe ");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("oldSelectmenu"));
		
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy (0,500)");
		
		Select select = new Select(dropdown);
		
		
		//driver.findElement(By.xpath("//*[@id=\'userName\']")).click();
	//	driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("vamsi");
		
		
	//	WebElement Textbox = driver.findElement(By.xpath("//*[@id=\'item-0\']"));
		//String bgcolor = Textbox.getCssValue("background color");
		//System.out.println(bgcolor);
		
		//WebElement fullNameLabel = driver.findElement(By.id("userName-label"));
		//String FullName = fullNameLabel.getText();
		//System.out.println(FullName);
	}
	
	

}
