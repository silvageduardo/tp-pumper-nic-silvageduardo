package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public class HamburguesaConQuesoAzul extends Hamburguesa {

    private Hamburguesa hamburguesa;

    public HamburguesaConQuesoAzul(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public BigDecimal costo() {
        return hamburguesa.costo().add(BigDecimal.valueOf(20));
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }
}
