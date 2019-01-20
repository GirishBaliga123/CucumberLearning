package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user is already on Login page$")
	public void user_is_already_on_Login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		
	    String title = driver.getTitle();
	    Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	
	
//	 //Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);

	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	    //driver.findElement(By.xpath("//input[@type='submit']")).click();
	    WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user is on Home page$")
	public void user_is_on_Home_page() {
	    String homepagetitle = driver.getTitle();
	    Assert.assertEquals("CRMPRO", homepagetitle);
	    driver.close();

	}
	
	
	@Then("^user closes the browser$")
	public void user_closes_the_browser() {
	    driver.quit();
	}
}
