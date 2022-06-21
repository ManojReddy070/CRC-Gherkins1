package StepDefinations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import POM.AddnewclientPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Addnewclient {

	WebDriver driver;
	AddnewclientPage client;
	
	@Given("Select client tab")
	public void select_client_tab() {
		
	   client = new AddnewclientPage(Login.driver);
	   client.Clients.click();
	}

	@Then("Click on Add new client button")
	public void click_on_add_new_client_button() {
		client.Addnewclientbutton.click();	   
	}
	
	@And("Pass the client First name")
	public void pass_the_client_first_name() {
		// System.out.println("First name is entering");
		Assert.assertTrue("First name is displaying", client.firstname.isDisplayed());
	   client.firstname.sendKeys("Hey");
	}
	
	@And("Pass client Last name")
	public void pass_client_last_name() {
	   client.lastname.sendKeys("John");
	}

	@And("Click on Email Checkbox")
	public void enter_click_on_email_checkbox() {
	   client.EmailCheckbox.click();
	}

	@And("Click on Save button")
	public void click_on_save_button() {
	   client.Savebutton.click();
	}

	@And("Click on Ok button in the warining popup")
	public void click_on_ok_button_to_create_client() {
	    client.Okbutton.click();
	}

	@Then("User should navigate to client dashboard")
	public void client_should_navigate_to_client_dashboard() throws InterruptedException {
	    System.out.println("User is navigate to CLIENT DASHBOARD");
	    Thread.sleep(5000);
	}
	@When("user clicks on clients tab")
	public void user_clicks_on_clients_tab() {
      client.Clients.click();
	}

	@And("user enters Client name in search field")
	public void user_enters_client_name_in_search_field() {
	   client.searchfld.sendKeys("Hey John");
	}
	@And("click beside")
	public void click_beside() throws InterruptedException {
	  client.beside.click();
	  JavascriptExecutor js = (JavascriptExecutor) Login.driver;
	   js.executeScript("window.scrollBy(0,1000)");
	  
	}
	@And("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
	  client.searchbtn.click();
	  Thread.sleep(3000);
	}

	@And("user click on client dropdown")
	public void user_click_on_client_dropdown() {
	   client.dropdownbtnclient.click();
	}

	@And("user clicks on delete button")
	public void user_clicks_on_delete_button() throws InterruptedException {
	 client.deletebtnclient.click();
	 Thread.sleep(3000);
	}

	@Then("click on deletethisclientbutton")
	public void click_on_deletethisclientbutton() {
	client.deleteclient.click();
	}
}
