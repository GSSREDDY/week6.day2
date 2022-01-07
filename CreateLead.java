package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead  extends BaseClass{

//@Then("Homepage should be displayed")
//public void homepage_should_be_displayed() {
//  
//	driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
//}


@When("Click on the {string} link") 
public void clickLink(String linkText) {
driver.findElement(By.linkText(linkText)).click();

}

@Then("{string} page should be displayed") 
public void verifyPage(String text) { 
	 
boolean displayed = driver.findElement(By.xpath("//div[text()='"+text+"']")).isDisplayed();

if (displayed) { System.out.println(text+"is displayed"); 
}else {
System.out.println(text+"is not displayed"); 
}

}
}
