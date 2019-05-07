package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public class HamburguesaCarne extends Hamburguesa {

    @Override
    public BigDecimal costo() {
        return BigDecimal.valueOf(200 +  (getCantidadMedallonesExtras() * 50));
    }

    public HamburguesaCarne() {
    }

    public HamburguesaCarne(int cantidadMedallonesExtras) {
        super(cantidadMedallonesExtras);
    }
}
