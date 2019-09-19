package ar.edu.unahur.obj2.hamburguesa;

public class conBacon extends Hamburguesa {
    private Hamburguesa hamburguesa;

    public conBacon(int cantidadMedallones, Hamburguesa hamburguesa) {
        super(cantidadMedallones);
        this.hamburguesa = hamburguesa;
    }

    @Override
    public Double precio() {
        return hamburguesa.precio()+ 50;
    }
}
