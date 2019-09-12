package ar.edu.unahur.obj2;

public class Hamburguesa {
    private int cantidadMedallones;

    public Hamburguesa(int cantidadMedallones) {
        this.cantidadMedallones = cantidadMedallones;
    }

    public void validarHamburguesa(int cantidadMedallones){
        if(cantidadMedallones>= 4 || cantidadMedallones<0){
            throw new RuntimeException("Cantidad medallones invalidos");
        }
    }


}
