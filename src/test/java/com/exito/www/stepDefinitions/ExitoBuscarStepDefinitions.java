package com.exito.www.stepDefinitions;

import com.exito.www.driver.SeleniumWebDriver;
import com.exito.www.steps.ExitoBarraBusquedaSteps;
import com.exito.www.util.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExitoBuscarStepDefinitions {
    @Steps
    ExitoBarraBusquedaSteps exitoSteps = new ExitoBarraBusquedaSteps();

    @Steps
    public static ArrayList<Map<String,String>> lecturaExcel =new ArrayList<Map<String,String>>();

    @Given("^que me encuentro en la pagina del exito$")
    public void queMeEncuentroEnLaPaginaDelExito() {
        try{
            lecturaExcel = Excel.readExcel("excelreto.xlsx","urlExito");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDrive(lecturaExcel.get(0).get("url"));
    }

    @When("^quiero buscar un producto del exito$")
    public void quieroBuscarUnProductoDelExito() {
        exitoSteps.BarraDeBusquedaExito();

    }

    @Then("^la pagina me reidirige al producto buscado$")
    public void laPaginaMeReidirigeAlProductoBuscado() {
        SeleniumWebDriver.driver.close();
    }
}
