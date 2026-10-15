package bdo.steps;

import bdo.pageobjets.LoginPage;
import net.serenitybdd.annotations.Step;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class LoginStep {
        LoginPage objLoginPage = new LoginPage();

        @Step
        public void abrirNavegador(){
            objLoginPage.open();
    }


        @Step
        public void ingresarUsuario(){
            objLoginPage.getDriver().findElement(objLoginPage.getTXT_USERNAME()).sendKeys("standard_user");
        }


        @Step
        public void ingresarPassword(){
            objLoginPage.getDriver().findElement(objLoginPage.getTXT_PASSWORD()).sendKeys("secret_sauce");
        }


        @Step
        public void clickLogin(){
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_LOGIN()).click();
        }

        @Step
        public void addProduct(){
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_ADDBACKPACK()).click();
        }

        @Step
        public void addSouce(){
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_ADDSAUCE()).click();
        }

        @Step
        public void selectCar(){
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_SELECTCAR()).click();
        }

        @Step
        public void checkBuy(){
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_CHECK()).click();
        }

        @Step
        public void billName(){
            objLoginPage.getDriver().findElement(objLoginPage.getTXT_FirstName()).sendKeys("Andres");
        }

        @Step
        public void billLast(){
            objLoginPage.getDriver().findElement(objLoginPage.getTXT_LastName()).sendKeys("Lugo");
        }
        @Step
        public void codeBill(){
            objLoginPage.getDriver().findElement(objLoginPage.getTXT_PostalCode()).sendKeys("100010");
        }

        @Step
        public void clickContinue(){
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_CONTINUE()).click();
        }

        public void clickFinish(){
            objLoginPage.getDriver().findElement(objLoginPage.getBTN_FINISH()).click();
        }

}
