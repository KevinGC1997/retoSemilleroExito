package com.exito.www.pageObjects;

import org.openqa.selenium.By;

public class ExitoProductoPageObjects {

    private By btnProductoLavadora = By.xpath("//a[@href='/lavadora-automatica-carga-superior"+
            "-premium-care-12-kg-ewiw12f6usvw-electrolux-123712959/p?pauta=t/p']");
    private By lblProductoLavador = By.xpath("(//span[contains(text(),'Lavadora automatica "+
            "carga superior Premium')])[2]");

    private By btnProductoCelular = By.xpath("//a[@href='/galaxy-m32-color-azul-samsung-sm"+
            "-m325flbjcoo-3036324/p']");
    private By lblProductoCelular = By.xpath("(//span[contains(text(),'Celular SAMSUNG Galaxy"+
            " M32 128 GB Azul')])[2]");
    private By btnProductoTelevisor = By.xpath("//a[@href='/tv-led-101-cm-40-fhd-smart-samsung"+
            "-40-pulgadas-smart-tv-un40t5290akxzl-3024337/p']");
    private By lblProductoTelevisor = By.xpath("(//span[contains(text(),'Televisor Led Samsung')])[2]");
    private By btnProductoNevera = By.xpath("//a[@href='/nevera-sin-escarcha-404-l-hima-157741/p']");
    private By lblProductoNevera = By.xpath("(//span[contains(text(),'Nevera HACEB No Frost 404,2 "+
            "Litros')])[2]");
    private By lblProductoPortil = By.xpath("(//span[contains(text(),'Computador LENOVO"+
            " IdeaPad 3')])[2]");
    private By lblProductoConsola = By.xpath("(//span[contains(text(),'Consola Sony Play')])[2]");

    public By getBtnProductoLavadora() {
        return btnProductoLavadora;
    }

    public By getLblProductoLavador() {
        return lblProductoLavador;
    }

    public By getBtnProductoCelular() {
        return btnProductoCelular;
    }

    public By getLblProductoCelular() {
        return lblProductoCelular;
    }

    public By getBtnProductoTelevisor() {
        return btnProductoTelevisor;
    }

    public By getLblProductoTelevisor() {
        return lblProductoTelevisor;
    }

    public By getBtnProductoNevera() {
        return btnProductoNevera;
    }

    public By getLblProductoNevera() {
        return lblProductoNevera;
    }

    public By getLblProductoPortil() {
        return lblProductoPortil;
    }

    public By getLblProductoConsola() {
        return lblProductoConsola;
    }
}
