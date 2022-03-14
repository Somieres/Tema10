package ejerciciosClase;

public class Taxi extends Vehiculo{

    protected int licencia;

    public Taxi() {
    }


    public Taxi(String matricula, String modelo, int licencia) {
        super(matricula, modelo);
        this.licencia = licencia;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    /**
     * llamo a la clase super, para que importe el String de la clase padre y sobrescribo la clase con los datos
     * de taxi
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "El numero de licencia del taxi es " +
                +this.licencia;
    }
}