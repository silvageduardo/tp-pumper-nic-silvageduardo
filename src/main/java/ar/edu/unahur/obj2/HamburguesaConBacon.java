package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public class HamburguesaConBacon extends Hamburguesa {

    private Hamburguesa hamburguesa;

    public HamburguesaConBacon(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public BigDecimal costo() {
        return hamburguesa.costo().add(BigDecimal.valueOf(50));
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }
}
