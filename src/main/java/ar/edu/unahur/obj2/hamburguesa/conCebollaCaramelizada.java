package ar.edu.unahur.obj2.hamburguesa;

public class conCebollaCaramelizada extends Hamburguesa {
    private Hamburguesa hamburguesa;

    public conCebollaCaramelizada(int cantidadMedallones, Hamburguesa hamburguesa) {
        super(cantidadMedallones);
        this.hamburguesa = hamburguesa;
    }

    @Override
    public Double precio() {
        return hamburguesa.precio()+60;
    }
}
