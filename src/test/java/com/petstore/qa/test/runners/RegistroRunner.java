package com.petstore.qa.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Registro.feature",
        glue = "com.petstore.qa.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@registro")

public class RegistroRunner {
}
