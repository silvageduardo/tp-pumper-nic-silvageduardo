package ar.edu.unahur.obj2.hamburguesa;

public class conQuezoAzul extends Hamburguesa {
    private Hamburguesa hamburguesa;

    public conQuezoAzul(int cantidadMedallones, Hamburguesa hamburguesa) {
        super(cantidadMedallones);
        this.hamburguesa = hamburguesa;
    }

    @Override
    public Double precio() {
        return hamburguesa.precio()+20;
    }
}
