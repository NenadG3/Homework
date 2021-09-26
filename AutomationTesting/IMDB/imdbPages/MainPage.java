package imdbPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement newWatchlist;

	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getWatchlist() {
		return driver.findElement(By.cssSelector(
				"#imdbHeader > div.ipc-page-content-container.ipc-page-content-container--center.navbar__inner > div.NavWatchlistButton-sc-1b65w5j-0.dAMWXo.imdb-header__watchlist-button > a > svg"));
	}

	public void createWatchlist() {
		this.getWatchlist().click();
	}

}
