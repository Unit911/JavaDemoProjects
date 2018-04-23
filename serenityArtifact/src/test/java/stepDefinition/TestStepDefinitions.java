package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.TestSteps;

/**
 * Created by demch on 4/23/2018.
 */
public class TestStepDefinitions {

    @Steps
    TestSteps tests;

    @Given("^i'm sending request to google$")
    public void sendingRequestToGoogle() {
        tests.sendRequestToGoogle();
    }

    @Then("^response should contain something$")
    public void messageCheck() {
        tests.checkMessage();
    }

    @And("^Do shit$")
    public void doShit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tests.doShitNow();
    }
}
