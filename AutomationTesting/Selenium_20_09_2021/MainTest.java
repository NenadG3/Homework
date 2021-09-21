package Selenium_20_09_2021;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Scanner sc = new Scanner(System.in);

		driver.navigate().to("https://the-internet.herokuapp.com/login");
		System.out.print("Choose happy path or sad path[hp/sp]: ");
		String path = sc.next();
		switch (path) {
		case "hp":
			HappyPath hp = new HappyPath();
			WebElement userBox = driver.findElement(By.id("username"));
			userBox.sendKeys(hp.getUsername());
			WebElement passBox = driver.findElement(By.id("password"));
			passBox.sendKeys(hp.getPassword());
			break;
		case "sp":
			SadPath sp = new SadPath();
			WebElement userBox2 = driver.findElement(By.id("username"));
			userBox2.sendKeys(sp.getUsername());
			WebElement passBox2 = driver.findElement(By.id("password"));
			passBox2.sendKeys(sp.getPassword());
			break;
		default:
			System.out.println("Invalid request, please enter hp or sp!");
		}

		WebElement loginButton = driver.findElement(By.cssSelector("#login > button > i"));
		loginButton.click();

		if (path.equals("hp")) {
			System.out.println("You are logged in!");
		} else if (path.equals("sp"))
			System.out.println("Wrong username or password!");

		sc.close();
	}

}
