package ar.edu.unahur.obj2.hamburguesa;

public abstract class Hamburguesa {
    public int cantidadMedallones;
    private boolean lechuga;
    private boolean tomate;



    public Hamburguesa(int cantidadMedallones) {
        this.cantidadMedallones = cantidadMedallones;
    }

    abstract public Double precio();




}
