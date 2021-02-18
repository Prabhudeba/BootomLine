package starter.stepdefinitions;


import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.loginStep;


public class gmailStepDefinition extends SerenityStory {

    @Steps
    loginStep login;

    @Given("user logged in to the gmail account")
    public void givenLoggedIn(){
        login.loginToApplication();
    }

    @When("user compose an email to gmail account")
    public void whenSentEmail(){
        login.sentEMail();
    }

    @Then("user can see the email on the inbox")
    public void ThenVerifyEmail(){
        login.verifyEmail();
    }
}
