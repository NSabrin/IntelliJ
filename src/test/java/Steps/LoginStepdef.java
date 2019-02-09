package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.commons.collections.bag.SynchronizedSortedBag;

import java.util.List;

public class LoginStepdef {
    /*@And("^I enter login name as admin and password admin$")
    public void iEnterLoginNameAsAdminAndPasswordAdmin() {
        System.out.println("Line1");
    }*/

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("Line2");
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("Line3");

    }

    @Then("^I should see the user form$")
    public void iShouldSeeTheUserForm() {
        System.out.println("Line4");
    }


    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String arg0, String arg1) throws Throwable {
        System.out.println(arg0);
        System.out.println(arg1);
    }
}
