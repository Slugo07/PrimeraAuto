package bdo.pageobjets;

import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    private By TXT_USERNAME =  By.xpath("//input[@id=\"user-name\"]");
    private By TXT_PASSWORD =  By.xpath("//input[@id=\"password\"]");
    private By BTN_LOGIN = By.xpath("//input[@id=\"login-button\"]");

    public By getTXT_USERNAME() {
        return TXT_USERNAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    private By BTN_ADDBACKPACK= By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    public By getBTN_ADDBACKPACK() {
        return BTN_ADDBACKPACK;
    }

    private By BTN_ADDSAUCE = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");

    public By getBTN_ADDSAUCE() {
        return BTN_ADDSAUCE;
    }

    private By BTN_SELECTCAR = By.xpath("//*[@id=\"shopping_cart_container\"]");


    public By getBTN_SELECTCAR() {
        return BTN_SELECTCAR;
    }

    private By BTN_CHECK = By.xpath("//*[@id=\"checkout\"]");

    public By getBTN_CHECK() {
        return BTN_CHECK;
    }

    private By TXT_FirstName = By.xpath("//*[@id=\"first-name\"]");
    private By TXT_LastName = By.xpath("//*[@id=\"last-name\"]");
    private By TXT_PostalCode = By.xpath("//*[@id=\"postal-code\"]");


    public By getTXT_FirstName() {
        return TXT_FirstName;
    }

    public By getTXT_LastName() {
        return TXT_LastName;
    }

    public By getTXT_PostalCode() {
        return TXT_PostalCode;
    }

    private By BTN_CONTINUE = By.xpath("//*[@id=\"continue\"]");
    private By BTN_FINISH = By.xpath("//*[@id=\"finish\"]");

    public By getBTN_CONTINUE() {
        return BTN_CONTINUE;
    }

    public By getBTN_FINISH() {
        return BTN_FINISH;
    }
}
