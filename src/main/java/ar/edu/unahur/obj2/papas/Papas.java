package ar.edu.unahur.obj2.papas;

public abstract class Papas  {
    public boolean chica;
    public boolean mediana;
    public boolean grande;

    public Papas(boolean chica, boolean mediana, boolean grande) {
        this.chica = chica;
        this.mediana = mediana;
        this.grande = grande;
    }

    abstract public Double precio();

}
