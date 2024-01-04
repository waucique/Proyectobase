package pl.automationpractice.testing.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {

    By inp_email = By.id("email_create");
    By btn_createAccount = By.id("SubmitCreate");
    By lbl_authentication = By.xpath("//h1[text()='Authentication']");

    public By getInp_email() {
        return inp_email;
    }

    public By getBtn_createAccount() {
        return btn_createAccount;
    }

    public By getLbl_authentication() {
        return lbl_authentication;
    }
}
