package ar.edu.unahur.obj2.hamburguesa;

public class HamburguesaDeCarne extends Hamburguesa{
    public HamburguesaDeCarne(int cantidadMedallones) {
        super(cantidadMedallones);
    }

    @Override
    public Double precio() {if (cantidadMedallones>= 4 || cantidadMedallones<=0){
        throw new RuntimeException("Cantidad medallones invalidos");
    }else { return Double.valueOf(200 + cantidadMedallones*50);
    }
    }
}
