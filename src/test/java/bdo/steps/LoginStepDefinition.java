package bdo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("que el usuario esta en la pagina web")
    public void queElUsuarioEstaEnLaPaginaWeb() {
        loginStep.abrirNavegador();
    }

    @When("el usuario ingresa sus credenciales")
    public void elUsuarioIngresaSusCredenciales() {
        loginStep.ingresarUsuario();
        loginStep.ingresarPassword();

    }

    @Then("el usuario podra ver los productos")
    public void elUsuarioPodraVerLosProductos() {
        loginStep.clickLogin();

        try {
            Thread.sleep(7000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

}
