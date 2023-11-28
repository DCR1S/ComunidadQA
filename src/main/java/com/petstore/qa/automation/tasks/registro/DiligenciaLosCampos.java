package com.petstore.qa.automation.tasks.registro;


import com.petstore.qa.automation.ui.RegistroFormPage;
import com.petstore.qa.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DiligenciaLosCampos implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();

        actor.attemptsTo(
                //aqui ingreso los datos
                WaitUntil.the(RegistroFormPage.USER_ID_INPUT,isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues(SpecialMethods.properties.getProperty("userId")).into(RegistroFormPage.USER_ID_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("password")).into(RegistroFormPage.PASSWORD_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("repeatPassword")).into(RegistroFormPage.REPEAT_PASSWORD_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("firstName")).into(RegistroFormPage.FIRST_NAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("lastName")).into(RegistroFormPage.LAST_NAME_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("email")).into(RegistroFormPage.EMAIL_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("phone")).into(RegistroFormPage.PHONE_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("addressOne")).into(RegistroFormPage.ADDRESS1_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("addressTwo")).into(RegistroFormPage.ADDRESS2_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("city")).into(RegistroFormPage.CITY_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("state")).into(RegistroFormPage.STATE_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("zip")).into(RegistroFormPage.ZIP_INPUT),
                Enter.keyValues(SpecialMethods.properties.getProperty("country")).into(RegistroFormPage.COUNTRY_INPUT),
                JavaScriptClick.on(RegistroFormPage.SAVE_ACCOUNT)

        );
    }

    public static DiligenciaLosCampos ingresarDatosParaRegistro(){
        return instrumented(DiligenciaLosCampos.class);
    }
}
