package pl.automationpractice.testing.stepdefinitions;

import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;
import pl.automationpractice.testing.models.RegisterUserModel;
import pl.automationpractice.testing.steps.RegisterStep;

import java.util.List;

public class RegisterUserStepDefinition {

    @Steps
    RegisterStep register;

    @Dado("^que estoy en automation practice$")
    public void queEstoyEnAutomationPractice() {
        register.openApp();
        register.clickSignIn();
    }

    @Cuando("^registro la información del usuario$")
    public void registroLaInformaciónDelUsuario(List<RegisterUserModel> registerData) {
        register.writeEmail(registerData.get(0).getEmail());
        register.clickCreateAccount();
        register.clickTitle();
        register.writeFirstName(registerData.get(0).getFirstName());

    }

    @Entonces("^debo verificar mensaje de registro$")
    public void deboVerificarMensajeDeRegistro() {

    }
}
