package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.hamburguesa.Hamburguesa;
import ar.edu.unahur.obj2.papas.Papas;

public class Menu {
    private Hamburguesa hamburguesa;
    private Papas papas;
    private int gaseosa = 40;
    private Double descuento = (hamburguesa.precio()+papas.precio())*0.2;

    public Menu(Hamburguesa hamburguesa, Papas papas) {
        this.hamburguesa = hamburguesa;
        this.papas = papas;
    }

    private Double costo(){
        return hamburguesa.precio()+ papas.precio() + gaseosa - descuento;
    }
}
