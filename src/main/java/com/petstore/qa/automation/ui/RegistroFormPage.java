package com.petstore.qa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroFormPage {

    public static String PET_STORE_URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm";

    public static final Target USER_ID_INPUT = Target.the("Boton para loguear al usuario").located(By.name("username"));
    public static final Target PASSWORD_INPUT = Target.the("Boton password").located(By.name("password"));

    public static final Target FIRST_NAME_INPUT = Target.the("Información de la cuenta").located(By.name("account.firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Información de la cuenta").located(By.name("account.lastName"));
    public static final Target REPEAT_PASSWORD_INPUT = Target.the("Información del usuario").located(By.name("repeatedPassword"));
    public static final Target EMAIL_INPUT = Target.the("Información de la cuenta").located(By.name("account.email"));
    public static final Target PHONE_INPUT = Target.the("Información de la cuenta").located(By.name("account.phone"));
    public static final Target ADDRESS1_INPUT = Target.the("Información de la cuenta").located(By.name("account.address1"));
    public static final Target ADDRESS2_INPUT = Target.the("Información de la cuenta").located(By.name("account.address2"));
    public static final Target CITY_INPUT = Target.the("Información de la cuenta").located(By.name("account.city"));
    public static final Target STATE_INPUT = Target.the("Información de la cuenta").located(By.name("account.state"));
    public static final Target ZIP_INPUT = Target.the("Información de la cuenta").located(By.name("account.zip"));
    public static final Target COUNTRY_INPUT = Target.the("Información de la cuenta").located(By.name("account.country"));
    public static final Target LANGUAGE_INPUT = Target.the("Información del perfil").located(By.name("account.languagePreference"));
    public static final Target FAVOURITE_CATEGORY_INPUT = Target.the("Información del perfil").located(By.name("account.favouriteCategoryId"));
    public static final Target SAVE_ACCOUNT = Target.the("Información del perfil").located(By.name("newAccount"));


}
