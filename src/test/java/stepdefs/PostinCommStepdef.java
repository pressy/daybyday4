package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.sun.corba.se.impl.util.RepositoryId.cache;
import static com.sun.deploy.net.protocol.ProtocolType.HTTP;
import static org.openqa.selenium.remote.http.HttpMethod.GET;

public class PostinCommStepdef {
    @Given("^I can access end point$")
    public void iCanAccessEndPoint() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I post comment$")
    public void iPostComment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the return status should be \"([^\"]*)\"$")
    public void theReturnStatusShouldBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
