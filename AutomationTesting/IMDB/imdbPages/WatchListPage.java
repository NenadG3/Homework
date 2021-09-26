package imdbPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WatchListPage {
	WebDriver driver;
	WebElement editWatchlist;
	WebElement addMovieOrTVShow;
	WebElement title;
	WebElement done;
	WebDriver wait;
	WebElement count;

	public WatchListPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEditWatchlist() {
		return driver.findElement(
				By.cssSelector("#center-1-react > div > div.lister-header > div > div.header-actions.nav-right > a"));
	}

	public WebElement getAddMovieOrTVShow() {
		return driver.findElement(By.id("add-to-list-search"));
	}

	public WebElement getTitle() {
		return driver.findElement(By.cssSelector("#add-to-list-search-results > a:nth-child(1)"));
	}

	public WebElement getDone() {
		return driver.findElement(By.cssSelector("#main > div.lister-edit-form > button"));
	}

	public WebElement getCount() {
		return driver.findElement(By.xpath("/html/body/div[2]/nav/div[2]/div[4]/a/div/span"));

	}

	public void edit() {
		this.getEditWatchlist().click();

	}

	public void add(String title) {
		this.getAddMovieOrTVShow().clear();
		this.getAddMovieOrTVShow().sendKeys(title);
		this.getAddMovieOrTVShow().sendKeys(Keys.ENTER);
	}

	public void clickTitle() {
		this.getTitle().click();
	}

	public void done() {
		this.getDone().click();

	}
}
