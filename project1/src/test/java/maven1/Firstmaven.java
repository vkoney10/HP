package maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstmaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
	WebDriverManager.chromedriver().setup();
	WebDriver Driver= new ChromeDriver();
	Driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.1");
	
	}

}
