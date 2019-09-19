package ar.edu.unahur.obj2.papas;

public class conCheddar extends Papas {
    private Papas papas;

    public conCheddar(boolean chica, boolean mediana, boolean grande, Papas papas) {
        super(chica, mediana, grande);
        this.papas = papas;
    }

    @Override
    public Double precio() {
        return papas.precio()+30;
    }
}
