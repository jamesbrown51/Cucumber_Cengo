package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs_Steps {

    private WebDriver driver;
    @Given("navigate to Website")
    public void navigate_to_website() {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }
    @Given("click on contact us button")
    public void click_on_contact_us_button() {

    }
    @Given("select Subject Heading")
    public void select_subject_heading() {

    }
    @Given("type Email")
    public void type_email() {

    }
    @Given("type Order referance")
    public void type_order_referance() {

    }
    @Given("type a message")
    public void type_a_message() {

    }
    @When("click on send button")
    public void click_on_send_button() {

    }
    @Then("verify sucsess message")
    public void verify_sucsess_message() {

    }
}
