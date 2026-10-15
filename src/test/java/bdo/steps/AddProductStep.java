package bdo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddProductStep {
    private static final Logger log = LoggerFactory.getLogger(AddProductStep.class);
    @Steps
    LoginStep loginStep;

        @Given("the user is logged in")
        public void theUserIsLoggedIn() {
            loginStep.abrirNavegador();
            loginStep.ingresarUsuario();
            loginStep.ingresarPassword();
            loginStep.clickLogin();

        }

        @When("the user adds a product to the cart")
        public void theUserAddsAProductToTheCart() {
            loginStep.addProduct();
            loginStep.addSouce();
            loginStep.selectCar();
            loginStep.checkBuy();

        }

        @Then("the product should appear in the shopping cart")
        public void theProductShouldAppearInTheShoppingCart() {
            loginStep.billName();
            loginStep.billLast();
            loginStep.codeBill();
            loginStep.clickContinue();
            loginStep.clickFinish();
            try {
                Thread.sleep(7000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

