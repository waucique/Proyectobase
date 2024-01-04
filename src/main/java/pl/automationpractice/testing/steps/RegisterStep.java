package pl.automationpractice.testing.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.automationpractice.testing.pageobjects.LandingHomePageObject;
import pl.automationpractice.testing.pageobjects.LoginPageObject;
import pl.automationpractice.testing.pageobjects.RegisterPageObject;

public class RegisterStep {

    //Instanciar objeto de la clase
    LandingHomePageObject landPO;
    LoginPageObject loginPO;
    RegisterPageObject registerPO;

    @Step
    public void openApp(){
        landPO.open();
    }

    @Step
    public void clickSignIn(){
        WebDriverWait wait = new WebDriverWait(landPO.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(landPO.getLink_singIn()));
        landPO.getDriver().findElement(landPO.getLink_singIn()).click();
    }

    @Step
    public void writeEmail(String email){
        String text = loginPO.getDriver().findElement(loginPO.getLbl_authentication()).getText();
        System.out.println(text);
        Assert.assertEquals("AUTHENTICATION",text);

        loginPO.getDriver().findElement(loginPO.getInp_email()).sendKeys(email);
    }

    @Step
    public void clickCreateAccount(){
        loginPO.getDriver().findElement(loginPO.getBtn_createAccount()).click();
    }

    @Step
    public void clickTitle(){
        registerPO.getDriver().findElement(registerPO.getRdn_gender()).click();
    }

    @Step
    public void writeFirstName(String firstName){
        registerPO.getDriver().findElement(registerPO.getInp_firsName()).sendKeys(firstName);
    }
}
