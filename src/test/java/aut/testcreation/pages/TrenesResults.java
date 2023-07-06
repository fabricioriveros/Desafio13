package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesResults extends SeleniumWrapper {
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");
    //By btnResultado = By.cssSelector("body > div:nth-child(1) > main:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(4) > span:nth-child(1)");
    By btnResultado = By.xpath("(//div[@class=\"TransportPrice__TripCardPriceWrapper-sc-e3wayj-3 hwKeFo\"])[1]");

    public TrenesResults(WebDriver driver) {
        super(driver);
    }

    //Metodos
    public void MasBarato(){
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnMasBarato));
    }
    public void SeleccionarResultado() throws InterruptedException{
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnResultado));
    }
}
