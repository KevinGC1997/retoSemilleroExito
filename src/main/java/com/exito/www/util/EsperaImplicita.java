package com.exito.www.util;

import com.exito.www.driver.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

public class EsperaImplicita {
    public void espera (int seg){
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(seg, TimeUnit.SECONDS);
    }

}
