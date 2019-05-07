package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class HamburguesaTest {

    @Test
    public void testPolloBase() {
        Hamburguesa hamburguesaPollo = new HamburguesaPollo();
        Assert.assertEquals(hamburguesaPollo.costo(), BigDecimal.valueOf(150));
    }

    @Test
    public void testCarneBase() {
        Hamburguesa hamburguesaCarne = new HamburguesaCarne();
        Assert.assertEquals(hamburguesaCarne.costo(), BigDecimal.valueOf(200));
    }

    @Test
    public void testLentejaDoble() {
        Hamburguesa hamburguesaLenteja = new HamburguesaLenteja(1);
        Assert.assertEquals(hamburguesaLenteja.costo(), BigDecimal.valueOf(270));
    }

    @Test
    public void testPolloDoble() {
        Hamburguesa hamburguesaPollo = new HamburguesaPollo(1);
        Assert.assertEquals(hamburguesaPollo.costo(), BigDecimal.valueOf(200));
    }

    @Test
    public void testCarneDoble() {
        Hamburguesa hamburguesaCarne = new HamburguesaCarne(1);
        Assert.assertEquals(hamburguesaCarne.costo(), BigDecimal.valueOf(250));
    }

    @Test
    public void testCarneDobleConQuesoAzul() {
        Hamburguesa hamburguesaCarne = new HamburguesaCarne(1);
        Hamburguesa quesoAzul = new HamburguesaConQuesoAzul(hamburguesaCarne);

        Assert.assertEquals(quesoAzul.costo(), BigDecimal.valueOf(270));
    }

    @Test
    public void testCarneDobleConQuesoAzulYBacon() {
        Hamburguesa hamburguesaCarne = new HamburguesaCarne(1);
        Hamburguesa quesoAzul = new HamburguesaConQuesoAzul(hamburguesaCarne);
        HamburguesaConBacon quesoBacon = new HamburguesaConBacon(quesoAzul);

         Hamburguesa carneBacon = new HamburguesaConBacon(hamburguesaCarne);

        Assert.assertEquals(quesoBacon.costo(), BigDecimal.valueOf(320));
        Assert.assertEquals(carneBacon.costo(), BigDecimal.valueOf(300));

    }

}