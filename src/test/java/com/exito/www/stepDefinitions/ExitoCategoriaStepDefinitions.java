package com.exito.www.stepDefinitions;

import com.exito.www.driver.SeleniumWebDriver;
import com.exito.www.steps.ExitoCategoriaSteps;
import com.exito.www.util.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExitoCategoriaStepDefinitions {

    @Steps
    public static ArrayList<Map<String,String>> lecturaExcel =new ArrayList<Map<String,String>>();
    @Steps
    ExitoCategoriaSteps exitoCategoriaSteps = new ExitoCategoriaSteps();

    @Given("^que me encuentro en la pagina de inicio del exito$")
    public void queMeEncuentroEnLaPaginaDeInicioDelExito() {
        try{
            lecturaExcel = Excel.readExcel("excelreto.xlsx","urlExito");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDrive(lecturaExcel.get(0).get("url"));
    }

    @When("^quiero seleccionar una categoria y producto$")
    public void quieroSeleccionarUnaCategoriaYProducto() {
        exitoCategoriaSteps.Categoria();
        exitoCategoriaSteps.validarNombreProducto();
    }

    @Then("^la pagina me reidirige a toda la informacion del producto seleccionado$")
    public void laPaginaMeReidirigeATodaLaInformacionDelProductoSeleccionado() {
        SeleniumWebDriver.driver.close();

    }
}
