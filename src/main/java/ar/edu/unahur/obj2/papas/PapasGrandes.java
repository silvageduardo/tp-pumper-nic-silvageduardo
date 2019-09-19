package ar.edu.unahur.obj2.papas;

public class PapasGrandes extends Papas {
    private Papas papas;

    public PapasGrandes(boolean chica, boolean mediana, boolean grande, Papas papas) {
        super(chica, mediana, grande);
        this.papas = papas;
    }

    @Override
    public Double precio() {
        if(papas.mediana){
            return Double.valueOf(15);
        }else {
            throw new RuntimeException("el tamaño de las papas es incorrecto");
        }
    }
}
