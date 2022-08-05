package com.exito.www.steps;

import com.exito.www.pageObjects.ExitoCatElecPageObjects;
import com.exito.www.pageObjects.ExitoHomePageObjects;
import com.exito.www.pageObjects.ExitoProductoPageObjects;
import com.exito.www.util.EsperaImplicita;
import com.exito.www.util.Excel;
import com.exito.www.util.Scroll;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExitoCategoriaSteps extends MetodosSeleniumSteps {

    ExitoHomePageObjects exitoHomePageObjects = new ExitoHomePageObjects();
    ExitoCatElecPageObjects exitoCatElecPageObjects = new ExitoCatElecPageObjects();
    ExitoProductoPageObjects exitoProductoPageObjects = new ExitoProductoPageObjects();
    Scroll scroll = new Scroll();
    EsperaImplicita espera = new EsperaImplicita();
    private static ArrayList<Map<String,String>> lecturaExcel =new ArrayList<Map<String,String>>();

    @Step
    public void Categoria(){
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScrollHome());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblSrcoll1Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll2Home());
        clickear(exitoCatElecPageObjects.getBtnElectrodomesticoHome());
        espera.espera(60);
        scroll.scrollPorElemento(exitoCatElecPageObjects.getLblScroll3Electrodomesticos());
        clickear(exitoCatElecPageObjects.getBtnLavadoraElectrodomestico());
        espera.espera(60);
        clickear(exitoProductoPageObjects.getBtnProductoLavadora());
    }
    @Step
    public void validarNombreProducto(){
        try{
            lecturaExcel= Excel.readExcel("excelreto.xlsx","validacionCategoria");
        }catch (IOException E){
            E.printStackTrace();
        }
        validar(exitoProductoPageObjects.getLblProductoLavador(),lecturaExcel.get(0).get("producto"));
    }
}
