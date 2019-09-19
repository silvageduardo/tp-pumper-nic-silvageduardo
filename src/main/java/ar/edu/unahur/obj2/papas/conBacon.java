package ar.edu.unahur.obj2.papas;

public class conBacon extends Papas {
    private Papas papas;

    public conBacon(boolean chica, boolean mediana, boolean grande, Papas papas) {
        super(chica, mediana, grande);
        this.papas = papas;
    }

    @Override
    public Double precio() {
        return papas.precio()+45;
    }
}
