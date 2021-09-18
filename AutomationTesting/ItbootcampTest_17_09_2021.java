package SeleniumOsnove;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItbootcampTest_17_09_2021 {

//	Pomocu jave i seleniuma
//	Otvoriti novi prozor u pretrazivacu i otici na stranicu  IT Bootcamp-a
//	Primeniti metode- get URL i Title, navigate - refresh, to, back, forward
//	U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )
//	Dokazati da li prilikom koriscenja reci “testiranje” u search-u 
//	(i trazanja jelte) dobijamo rezultat shodno trazenom tako sto cete napraviti screenshot stranice. nakon pretrage.
//	Proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu.

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://itbootcamp.rs/");
		driver.getCurrentUrl();
		String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);

		driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera-qa/");

		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().getSize();
		Dimension x = driver.manage().window().getSize();
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.cssSelector(
				"#masthead > div.site-header-wrapper.affix-top > div > div > div.header-search.pull-right.hidden-xs > a > i"));
		search.click();
		WebElement searchBox = driver.findElement(By.className("form-control"));
		searchBox.sendKeys("testiranje");
		searchBox.sendKeys(Keys.ENTER);
		screenShot(driver, "C://Scr//test.png");

		WebElement kontakt = driver.findElement(By.id("menu-item-4141"));
		kontakt.click();
		String provera = driver.getCurrentUrl();
		System.out.println(provera);
		String provera2 = driver.getTitle();
		System.out.println(provera2);
		screenShot(driver, "C://Scr//testKontakt.png");

		driver.manage().window().setSize(x);
		Thread.sleep(3000);
		driver.close();

	}

	public static void screenShot(WebDriver webdriver, String fileWithPath) throws Exception {
		TakesScreenshot screnShot = ((TakesScreenshot) webdriver);
		File scrFile = screnShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(scrFile, DestFile);

	}

}
