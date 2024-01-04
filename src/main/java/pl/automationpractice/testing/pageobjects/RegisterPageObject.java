package pl.automationpractice.testing.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPageObject extends PageObject {

    By rdn_gender = By.xpath("//input[@id='id_gender1']");
    By inp_firsName = By.id("customer_firstname");
    By inp_lastName = By.id("customer_lastname");
    By inp_password = By.id("passwd");
    By slc_day = By.id("days");
    By slc_month = By.id("months");
    By slc_years = By.id("years");

    public By getRdn_gender() {
        return rdn_gender;
    }

    public By getInp_firsName() {
        return inp_firsName;
    }

    public By getInp_lastName() {
        return inp_lastName;
    }

    public By getInp_password() {
        return inp_password;
    }

    public By getSlc_day() {
        return slc_day;
    }

    public By getSlc_month() {
        return slc_month;
    }

    public By getSlc_years() {
        return slc_years;
    }
}
