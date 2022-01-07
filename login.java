package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends BaseClass {

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void verifyHomePage() {
	 driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
	System.out.println("Error message is displayed");
	}

	
	
}






	
	
	

	



	
















	
		//By using snippet from console and copy
	
	
	/*
	 * ChromeDriver driver;
	 * 
	 * @Given("Open the chrome browser") public void open_the_chrome_browser() {
	 * 
	 * WebDriverManager.chromedriver().setup();
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * 
	 * 
	 * }
	 * 
	 * @Given("Load the application url") public void load_the_application_url() {
	 * 
	 * driver.get("http://leaftaps.com/opentaps"); }
	 * 
	 * @Given("Enter the username as Demosalesmanager") public void
	 * enter_the_username_as_demosalesmanager() {
	 * driver.findElement(By.id("username")).sendKeys("DemosalesManager"); }
	 * 
	 * @Given("Enter the password as crmsfa") public void
	 * enter_the_password_as_crmsfa() {
	 * driver.findElement(By.id("password")).sendKeys("crmsfa"); }
	 * 
	 * @When("Click on login button") public void click_on_login_button() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); }
	 * 
	 * @Then("Homepage should be displayed") public void
	 * homepage_should_be_displayed() { boolean displayed =
	 * driver.findElement(By.linkText("CRM/SFA")).isDisplayed(); if (displayed) {
	 * System.out.println("Homepage is displayed"); }else {
	 * System.out.println("Homepage is not displayed"); }
	 * 
	 * }
	 */
	//////////
	/*
	 * @Given("Enter the password as crmsfa") public void enterPassword() {
	 * driver.findElement(By.id("password")).sendKeys("crmsfa");
	 */
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

