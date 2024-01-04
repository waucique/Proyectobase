package pl.automationpractice.testing.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://www.automationpractice.pl/index.php")
public class LandingHomePageObject extends PageObject {
    By link_singIn = By.xpath("//a[@class='login']");
    public By getLink_singIn() {
        return link_singIn;
    }
}
