package imdbTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import imdbBase.Base;

public class ImdbTest extends Base {

	@BeforeMethod

	public void pageSetUp() {

		driver.manage().window().maximize();

	}

	@Test(priority = 10)

	public void newWatchList() {

		mainPage.createWatchlist();

	}

	@Test(priority = 20)

	public void signIn() {
		signInPage.getSignIn();
		signInPage.clickSignIn();
		signInPage.insertEmail("cotogax164@u461.com");
		signInPage.insertPassword("testuser");
		signInPage.clickSubmitButton();
	}

	@Test(priority = 30)

	public void addToWatchlist() {
		watchListPage.edit();
		watchListPage.add("Mayans M.C. (2018)");
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("#add-to-list-search-results > a:nth-child(1)")));
		watchListPage.clickTitle();
		watchListPage.done();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/nav/div[2]/div[4]/a/div/span")));
		Assert.assertTrue(watchListPage.getCount().isDisplayed());
		
	}

	@AfterMethod

	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
