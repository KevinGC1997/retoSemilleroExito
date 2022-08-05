package com.exito.www.pageObjects;

import org.openqa.selenium.By;

public class ExitoHomePageObjects {


    private By txtBarraBusquedaExitoHome = By.id("downshift-0-input");
    private By lblScrollHome = By.xpath("//a[@href='https://www.exito.com/cyberlunes']");
    private By lblSrcoll1Home = By.xpath("//a[@href='/moda-y-accesorios/segundas-oportunidades']");
    private By lblScroll2Home = By.xpath("//a[@class='campaign_name_acceso_categoria_2']");
    private By lblScroll4Home = By.xpath("//a[@class='campaign_name_acceso_categoria_7']");
    private By lblScroll5Home = By.xpath("//a[@class='campaign_name_bloque_destacados_1']");
    private By btnCelularesHome = By.xpath("//a[@href='/595?map=productClusterIds&order=']");
    private By btnHome = By.xpath("//a[@class='vtex-store-components-3-x-logoLink']");
    private By btnTelevisoresHome = By.xpath("//a[@href='/4655?map=productClusterIds&order=']");
    private By btnNeveraHome =  By.xpath("//a[@href='/18703?map=productClusterIds']");
    private By btnPortatilHome = By.xpath("//a[@class='campaign_name_bloque2_destacados_3']");
    private By btnProductoConsolaHome = By.xpath("//a[@href='/consola-playstation-5-ps5-sony-101027522"+
            "-mp/p']");



    public By getTxtBarraBusquedaExitoHome() {
        return txtBarraBusquedaExitoHome;
    }

    public By getLblScrollHome() {
        return lblScrollHome;
    }

    public By getLblSrcoll1Home() {
        return lblSrcoll1Home;
    }

    public By getLblScroll2Home() {
        return lblScroll2Home;
    }

    public By getLblScroll4Home() {
        return lblScroll4Home;
    }

    public By getLblScroll5Home() {
        return lblScroll5Home;
    }

    public By getBtnCelularesHome() {
        return btnCelularesHome;
    }

    public By getBtnHome() {
        return btnHome;
    }

    public By getBtnTelevisoresHome() {
        return btnTelevisoresHome;
    }
    public By getBtnNeveraHome() {
        return btnNeveraHome;
    }
    public By getBtnPortatilHome() {
        return btnPortatilHome;
    }

    public By getBtnProductoConsolaHome() {
        return btnProductoConsolaHome;
    }
}
