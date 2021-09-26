package imdbPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	WebDriver driver;
	WebElement singIn;
	WebElement email;
	WebElement password;
	WebElement submitButton;

	public WebElement getEmail() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("ap_password"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("signInSubmit"));
	}

	public SignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignIn() {

		return driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/div[1]/div/div[1]/a[1]"));
	}

	public void clickSignIn() {
		this.getSignIn().click();

	}

	public void insertEmail(String emailData) {
		this.getEmail().clear();
		this.getEmail().sendKeys(emailData);
	}

	public void insertPassword(String passwordData) {
		this.getPassword().clear();
		this.getPassword().sendKeys(passwordData);
	}

	public void clickSubmitButton() {
		this.getSubmitButton().click();
	}

}
