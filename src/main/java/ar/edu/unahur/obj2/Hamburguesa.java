package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public abstract class Hamburguesa {

    private int cantidadMedallonesExtras;

    public Hamburguesa() {
    }

    public Hamburguesa(int cantidadMedallonesExtras) {
        if (cantidadMedallonesExtras > 4 || cantidadMedallonesExtras < 0) {
            throw new RuntimeException("cantidad de medallones extras inválida");
        }
        this.cantidadMedallonesExtras = cantidadMedallonesExtras;
    }

    public abstract BigDecimal costo();

    public int getCantidadMedallonesExtras() {
        return cantidadMedallonesExtras;
    }


}
