package StepDefinition;

import java.io.IOException;

import Page.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;



public class LoginYahoo extends LoginPage {
	LoginPage lp = new LoginPage();
	@Given("^Open the Firefox and launch yahoo$")
	public void open_the_Firefox_and_launch_yahoo() throws IOException  {
	    // Write code here that turns the phrase above into concrete actions
		lp.OpenBrowser();
		lp.OpenYahoo();

	}

	@When("^Enter the Username	and click next button$")
	public void enter_the_Username_and_click_next_button() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		lp.enterEmail(correctEmail);
	   
	}

	@When("^Enter the password and Click on login button$")
	public void enter_the_password_and_Click_on_login_button() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		lp.enterPassword(wrongPassword);

	}



}
