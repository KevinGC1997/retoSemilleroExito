package com.exito.www.steps;

import com.exito.www.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertEquals;

public class MetodosSeleniumSteps {
    public void esbrirEnter(By localizador, String texto){
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto, Keys.ENTER);
    }
    public String getTextoElemento(By localizador){
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }
    public void validar(By localizador,String texto){
        assertEquals(getTextoElemento(localizador),texto);
    }
    public void limpiarcampo(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).clear();
    }
    public void clickear(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).click();
    }
}
