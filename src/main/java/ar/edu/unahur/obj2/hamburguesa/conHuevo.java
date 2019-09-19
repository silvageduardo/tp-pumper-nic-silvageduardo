package ar.edu.unahur.obj2.hamburguesa;

public class conHuevo extends Hamburguesa {
    private Hamburguesa hamburguesa;

    public conHuevo(int cantidadMedallones, Hamburguesa hamburguesa) {
        super(cantidadMedallones);
        this.hamburguesa = hamburguesa;
    }

    @Override
    public Double precio() {
        return hamburguesa.precio()+10;
    }
}
