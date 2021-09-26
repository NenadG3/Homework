package imdbBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import imdbPages.MainPage;
import imdbPages.SignInPage;
import imdbPages.WatchListPage;

public class Base {
	public WebDriver driver;
	public MainPage mainPage;
	public SignInPage signInPage;
	public WatchListPage watchListPage;
	public WebDriverWait wait;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		mainPage = new MainPage(driver);
		signInPage = new SignInPage(driver);
		watchListPage = new WatchListPage(driver);
		driver.navigate().to("https://www.imdb.com/");
	}

	
	  @AfterClass public void tearDown() { driver.close(); driver.quit(); }
	 

}
