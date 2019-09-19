package ar.edu.unahur.obj2.hamburguesa;

public class HambruguesaDePollo extends Hamburguesa {

    public HambruguesaDePollo(int cantidadMedallones) {
        super(cantidadMedallones);
    }

    @Override
    public Double precio() {
        if (cantidadMedallones>= 4 || cantidadMedallones<=0){
            throw new RuntimeException("Cantidad medallones invalidos");
        }else { return Double.valueOf(150 + cantidadMedallones*50);
            }
    }
}
