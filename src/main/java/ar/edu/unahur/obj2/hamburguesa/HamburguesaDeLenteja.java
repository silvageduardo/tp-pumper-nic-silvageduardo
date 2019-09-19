package ar.edu.unahur.obj2.hamburguesa;

public class HamburguesaDeLenteja extends Hamburguesa {


    public HamburguesaDeLenteja(int cantidadMedallones) {
        super(cantidadMedallones);
    }

    @Override
    public Double precio() {
        if (cantidadMedallones>= 4 || cantidadMedallones<=0){
            throw new RuntimeException("Cantidad medallones invalidos");
        }else { return Double.valueOf(220 + cantidadMedallones*50);
        }
    }
}
