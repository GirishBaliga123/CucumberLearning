package stepDefinition;

import java.util.Map;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ContactsStepDefinition {

WebDriver driver;
	
	@Given("^user is on Login page$")
	public void user_is_already_on_Login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}
	
	@When("^title of login page Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		
	    String title = driver.getTitle();
	    Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable usercredential) {
		
		for(Map<String, String> data : usercredential.asMaps(String.class,String.class))
		{
		
	       driver.findElement(By.name("username")).sendKeys(data.get("username"));
	       driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}
	
	@Then("^user clicking on login button$")
	public void user_clicking_on_login_button() {
	    //driver.findElement(By.xpath("//input[@type='submit']")).click();
	    WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user to moves Home page$")
	public void user_to_moves_Home_page() {
	    String homepagetitle = driver.getTitle();
	    Assert.assertEquals("CRMPRO", homepagetitle);
	    driver.close();

	}
	
	
	@Then("moves to new contacts page")
	public void create_contacts() {
	    
		driver.switchTo().frame("mainpanel");
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
	    driver.findElement(By.xpath("New Contact")).click();
	}
	
	
	
	@Then("^user closing the browser$")
	public void user_closes_the_browser() {
	    driver.quit();
	}
}
