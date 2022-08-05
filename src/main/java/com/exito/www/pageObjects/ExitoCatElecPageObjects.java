package com.exito.www.pageObjects;

import org.openqa.selenium.By;

public class ExitoCatElecPageObjects {

    private By btnElectrodomesticoHome = By.xpath("//a[@href='/electrodomesticos']");
    private By lblScroll3Electrodomesticos = By.xpath("//a[@href='/nevera-sin-escarcha-515"+
            "-l-gris-447747/p']");
    private By btnLavadoraElectrodomestico = By.xpath("(//a[@class='campaign_exito'])[3]");


    public By getBtnElectrodomesticoHome() {
        return btnElectrodomesticoHome;
    }

    public By getLblScroll3Electrodomesticos() {
        return lblScroll3Electrodomesticos;
    }

    public By getBtnLavadoraElectrodomestico() {
        return btnLavadoraElectrodomestico;
    }
}
