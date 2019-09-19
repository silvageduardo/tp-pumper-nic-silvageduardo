package ar.edu.unahur.obj2.hamburguesa;

public class conMollejas extends Hamburguesa {
    private Hamburguesa hamburguesa;

    public conMollejas(int cantidadMedallones, Hamburguesa hamburguesa) {
        super(cantidadMedallones);
        this.hamburguesa = hamburguesa;
    }

    @Override
    public Double precio() {
        return hamburguesa.precio()+80;
    }
}
