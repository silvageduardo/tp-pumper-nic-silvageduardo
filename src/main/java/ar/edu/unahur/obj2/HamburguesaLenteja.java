package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public class HamburguesaLenteja extends Hamburguesa {

    public HamburguesaLenteja() {
        super();
    }

    public HamburguesaLenteja(int cantidadMedallonesExtras) {
        super(cantidadMedallonesExtras);
    }

    @Override
    public BigDecimal costo() {
        return BigDecimal.valueOf(220 +  (getCantidadMedallonesExtras() * 50));
    }
}
