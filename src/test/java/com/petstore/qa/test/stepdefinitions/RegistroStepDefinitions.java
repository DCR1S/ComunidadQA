package com.petstore.qa.test.stepdefinitions;

import com.petstore.qa.automation.interactions.AbrirNavegador;
import com.petstore.qa.automation.tasks.registro.DiligenciaLosCampos;
import com.petstore.qa.automation.ui.RegistroFormPage;
import com.petstore.qa.automation.utils.SpecialMethods;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegistroStepDefinitions {

    @Managed
    public static WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Cristian").can(BrowseTheWeb.with(driver));
    }

    @Dado("^Que estoy en la pagina de registro$")
    public void queEstoyEnLaPaginaDeRegistro() throws InterruptedException {

        OnStage.theActorInTheSpotlight().attemptsTo(AbrirNavegador.en(RegistroFormPage.PET_STORE_URL));
        SpecialMethods.waitFor(3);

    }


    @Cuando("^Complete todos los campos requeridos y presione el boton de guardar$")
    public void completeTodosLosCamposRequeridosYPresioneElBotonDeGuardar() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciaLosCampos.ingresarDatosParaRegistro());

        SpecialMethods.waitFor(4);

    }

    @Entonces("^Observo la pagina principal de la pagina$")
    public void observoLaPaginaPrincipalDeLaPagina() {
        // Write code here that turns the phrase above into concrete actions

    }
}
