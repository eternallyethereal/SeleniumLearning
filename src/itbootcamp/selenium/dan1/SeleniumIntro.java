package itbootcamp.selenium.dan1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//povezivanje racunara sa drajverom; System je klasa u okviru JAVE
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmili\\Documents\\ITbootcamp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		// manage je interface u WebDriver klasi; postoji i navigate() interface;
		driver.manage().window().maximize(); //maksimizuje prozor
		driver.navigate().to("https://www.youtube.com");
		/*
		 * driver.navigate().back(); driver.navigate().forward();
		 */
		driver.findElement(By.id("search")).sendKeys("Sport");
		driver.findElement(By.id("search-icon-legacy")).click();
	}
}