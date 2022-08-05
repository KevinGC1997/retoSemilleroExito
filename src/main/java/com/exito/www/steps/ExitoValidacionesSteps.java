package com.exito.www.steps;

import com.exito.www.pageObjects.ExitoHomePageObjects;
import com.exito.www.pageObjects.ExitoProductoPageObjects;
import com.exito.www.util.EsperaImplicita;
import com.exito.www.util.Excel;
import com.exito.www.util.Scroll;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExitoValidacionesSteps extends MetodosSeleniumSteps{
    ExitoHomePageObjects exitoHomePageObjects = new ExitoHomePageObjects();
    ExitoProductoPageObjects exitoProductoPageObjects = new ExitoProductoPageObjects();
    Scroll scroll = new Scroll();
    EsperaImplicita espera = new EsperaImplicita();
    private static ArrayList<Map<String,String>> lecturaExcel =new ArrayList<Map<String,String>>();

    @Step
    public void celular() {
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScrollHome());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblSrcoll1Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll2Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll4Home());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll5Home());
        clickear(exitoHomePageObjects.getBtnCelularesHome());
        espera.espera(60);
        clickear(exitoProductoPageObjects.getBtnProductoCelular());
    }
    @Step
    public void validarProductoCelular(){
        try {
            lecturaExcel = Excel.readExcel("excelreto.xlsx", "validacionHome");
        } catch (IOException E) {
            E.printStackTrace();
        }
        validar(exitoProductoPageObjects.getLblProductoCelular(), lecturaExcel.get(0).get("producto"));


    }
    @Step
    public void televisor() {
        clickear(exitoHomePageObjects.getBtnHome());
        espera.espera(120);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScrollHome());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblSrcoll1Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll2Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll4Home());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll5Home());
        clickear(exitoHomePageObjects.getBtnTelevisoresHome());
        espera.espera(60);
        clickear(exitoProductoPageObjects.getBtnProductoTelevisor());
    }
    @Step
    public void validarProductoTelevisor() {
        try {
            lecturaExcel = Excel.readExcel("excelreto.xlsx", "validacionHome");
        } catch (IOException E) {
            E.printStackTrace();
        }
        validar(exitoProductoPageObjects.getLblProductoTelevisor(), lecturaExcel.get(1).get("producto"));
        espera.espera(60);

    }
    @Step
    public void nevera() {
        clickear(exitoHomePageObjects.getBtnHome());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScrollHome());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblSrcoll1Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll2Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll4Home());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll5Home());
        espera.espera(60);
        clickear(exitoHomePageObjects.getBtnNeveraHome());
        espera.espera(60);
        clickear(exitoProductoPageObjects.getBtnProductoNevera());
    }
    @Step
    public void validarProductoNevera() {
        try {
            lecturaExcel = Excel.readExcel("excelreto.xlsx", "validacionHome");
        } catch (IOException E) {
            E.printStackTrace();
        }
        validar(exitoProductoPageObjects.getLblProductoNevera(), lecturaExcel.get(2).get("producto"));
        espera.espera(60);

    }
    @Step
    public void portatil() {
        clickear(exitoHomePageObjects.getBtnHome());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScrollHome());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblSrcoll1Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll2Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll4Home());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll5Home());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getBtnNeveraHome());
        clickear(exitoHomePageObjects.getBtnPortatilHome());
    }
    @Step
    public void validarProductoPortatil(){
        try{
            lecturaExcel= Excel.readExcel("excelreto.xlsx","validacionHome");
        }catch (IOException E){
            E.printStackTrace();
        }
        validar(exitoProductoPageObjects.getLblProductoPortil(),lecturaExcel.get(3).get("producto"));
        espera.espera(60);

    }
    @Step
    public void consola() {
        clickear(exitoHomePageObjects.getBtnHome());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScrollHome());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblSrcoll1Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll2Home());
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll4Home());
        espera.espera(60);
        scroll.scrollPorElemento(exitoHomePageObjects.getLblScroll5Home());
        clickear(exitoHomePageObjects.getBtnProductoConsolaHome());
    }

    @Step
    public void validarProductoConsola(){
        try{
            lecturaExcel= Excel.readExcel("excelreto.xlsx","validacionHome");
        }catch (IOException E){
            E.printStackTrace();
        }
        validar(exitoProductoPageObjects.getLblProductoConsola(),lecturaExcel.get(4).get("producto"));
    }
}
