package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {

    @Given("Amazon websitesine git")
    public void amazon_websitesine_git() {
        System.out.println( "siteye gidildi");
    }
    @Given("login butonuna tikla")
    public void login_butonuna_tikla() {
        System.out.println("logine tiklandi");
    }
    @Given("isim gir")
    public void isim_gir() {
        System.out.println("isim girildi");
    }
    @Given("sifre gir")
    public void sifre_gir() {
        System.out.println("sifre girildi");
    }
    @When("submit butonuna tikladigimda")
    public void submit_butonuna_tikladigimda() {
        System.out.println("butona tiklandi");
    }
    @Then("success mesajini verify et")
    public void success_mesajini_verify_et() {
        System.out.println("verify edildi");
    }
}
