package ar.edu.unahur.obj2.papas;

public class PapasChicas extends Papas {
    private Papas papas;

    public PapasChicas(boolean chica, boolean mediana, boolean grande, Papas papas) {
        super(chica, mediana, grande);
        this.papas = papas;
    }

    @Override
    public Double precio() {
        if(papas.chica){
            return Double.valueOf(10);
        }else {
            throw new RuntimeException("el tamaño de las papas es incorrecto");
        }
    }
}
