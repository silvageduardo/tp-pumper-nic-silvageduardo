package ar.edu.unahur.obj2.papas;

public class conSalsaBarbacoa extends Papas {
    private Papas papas;

    public conSalsaBarbacoa(boolean chica, boolean mediana, boolean grande, Papas papas) {
        super(chica, mediana, grande);
        this.papas = papas;
    }

    @Override
    public Double precio() {
        return papas.precio()+20;
    }
}
