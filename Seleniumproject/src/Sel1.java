import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Sel1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pacharla\\Desktop\\vamsi selenium\\Drivers\\Chrome\\chromedriver.exe ");
 	
 	WebDriver driver = new ChromeDriver();
		
 	//ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullNametextbox = driver.findElement(By.xpath("//*[@id='userName']"));
		fullNametextbox.sendKeys("kvk");
		
		WebElement mailtextbox = driver.findElement(By.xpath("//*[@id=\'userEmail\']"));
		mailtextbox.sendKeys("kvk@kvk.com");
		
		WebElement currentaddress = driver.findElement(By.xpath("//*[@id=\'currentAddress\']"));
		currentaddress.sendKeys("25 drive dr , xyz, AP");
		
		WebElement permanentaddress = driver.findElement(By.xpath("//*[@id=\'permanentAddress\']"));
		permanentaddress.sendKeys("25 drive dr , xyz, AP");
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy (0,500)");
				
		WebElement submitbutton = driver.findElement(By.xpath("//*[@id=\'submit\']"));
		submitbutton.click();
		
		
		
	//	WebElement submitbutton = driver.findElement(By.id("submit"));
	//	submitbutton.click();
		
		
	}

	}


