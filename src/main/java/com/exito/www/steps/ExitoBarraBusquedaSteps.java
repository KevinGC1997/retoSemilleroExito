package com.exito.www.steps;

import com.exito.www.pageObjects.ExitoHomePageObjects;
import com.exito.www.util.Excel;
import net.thucydides.core.annotations.Step;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExitoBarraBusquedaSteps extends MetodosSeleniumSteps{
    ExitoHomePageObjects exitoHomePageObjects = new ExitoHomePageObjects();
    private static ArrayList<Map<String,String>> lecturaExcel =new ArrayList<Map<String,String>>();

    @Step
    public void BarraDeBusquedaExito(){

        try{
            lecturaExcel = Excel.readExcel("excelreto.xlsx","Busqueda");
        }catch(IOException E){
            E.printStackTrace();
        }
        for (int i = 0; i<lecturaExcel.size();i++){
            esbrirEnter(exitoHomePageObjects.getTxtBarraBusquedaExitoHome(),lecturaExcel.get(i).get("termino"));
            limpiarcampo(exitoHomePageObjects.getTxtBarraBusquedaExitoHome());
        }
    }
}
