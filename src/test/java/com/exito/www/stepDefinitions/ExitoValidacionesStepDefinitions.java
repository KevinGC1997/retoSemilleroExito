package com.exito.www.stepDefinitions;

import com.exito.www.driver.SeleniumWebDriver;
import com.exito.www.steps.ExitoValidacionesSteps;
import com.exito.www.util.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExitoValidacionesStepDefinitions {
    @Steps
    public static ArrayList<Map<String,String>> lecturaExcel =new ArrayList<Map<String,String>>();
    @Steps
    ExitoValidacionesSteps exitoValidacionesSteps = new ExitoValidacionesSteps();

    @Given("^que me encuentro en el home de la pagina del exito$")
    public void queMeEncuentroEnElHomeDeLaPaginaDelExito() {
        try{
            lecturaExcel = Excel.readExcel("excelreto.xlsx","urlExito");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDrive(lecturaExcel.get(0).get("url"));
    }

    @When("^cuando quiero validar diferentes productos$")
    public void cuandoQuieroValidarDiferentesProductos() {
        exitoValidacionesSteps.celular();
        exitoValidacionesSteps.validarProductoCelular();
        exitoValidacionesSteps.televisor();
        exitoValidacionesSteps.validarProductoTelevisor();
        exitoValidacionesSteps.nevera();
        exitoValidacionesSteps.validarProductoNevera();
        exitoValidacionesSteps.portatil();
        exitoValidacionesSteps.validarProductoPortatil();
        exitoValidacionesSteps.consola();
        exitoValidacionesSteps.validarProductoConsola();
    }

    @Then("^la pagina me redirige a cada producto$")
    public void laPaginaMeRedirigeACadaProducto() {
        SeleniumWebDriver.driver.close();

    }
}
