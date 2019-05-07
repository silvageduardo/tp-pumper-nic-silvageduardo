package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public class HamburguesaPollo extends Hamburguesa {

    public HamburguesaPollo() {
    }

    public HamburguesaPollo(int cantidadMedallonesExtras) {
        super(cantidadMedallonesExtras);
    }

    @Override
    public BigDecimal costo() {
        return BigDecimal.valueOf(150 +  (getCantidadMedallonesExtras() * 50));
    }
}
