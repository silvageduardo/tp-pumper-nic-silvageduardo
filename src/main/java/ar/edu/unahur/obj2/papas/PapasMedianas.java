package ar.edu.unahur.obj2.papas;

public class PapasMedianas extends Papas {
    private Papas papas;

    public PapasMedianas(boolean chica, boolean mediana, boolean grande, Papas papas) {
        super(chica, mediana, grande);
        this.papas = papas;
    }

    @Override
    public Double precio() {
        if (papas.grande){
            return Double.valueOf(20);
        }else {
            throw new RuntimeException("el tamaño de las papas es incorrecto");
        }
    }
}
