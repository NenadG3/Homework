package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_16_09_2021 {

	// Napisati program
	// koji ucitava https:// practicetestautomation.com/ stranicu, klikne na
	// "Practice" i klikne na "Test
	// login page", popunjava username i password (student/Password123), loguje se
	// na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme
	// Logout. Na kraju zatvoriti program.

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		// Thread.sleep(2000);
		WebElement practiceButton = driver.findElement(By.cssSelector("#menu-item-20"));
		practiceButton.click();
		// Thread.sleep(2000);
		WebElement testLoginButton = driver
				.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
		testLoginButton.click();
		// Thread.sleep(2000);
		WebElement usernameBox = driver.findElement(By.id("username"));
		usernameBox.clear();
		usernameBox.sendKeys("student");
		// Thread.sleep(2000);
		WebElement passwordBox = driver.findElement(By.id("password"));
		passwordBox.clear();
		passwordBox.sendKeys("Password123");
		// Thread.sleep(2000);
		WebElement submitBox = driver.findElement(By.id("submit"));
		submitBox.click();
		// Thread.sleep(2000);
		WebElement logOutButton = driver
				.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
		logOutButton.click();
		// Thread.sleep(2000);
		driver.close();

	}

}
