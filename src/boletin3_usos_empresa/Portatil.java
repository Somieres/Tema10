package boletin3_usos_empresa;

public class Portatil {

    public enum Modelo {PAVILION, OMEN, ENVY};
    private String numSerie;
    private final String MARCA="HP";
    private Modelo modelo;

    
    public Portatil(String numSerie, Modelo modelo) {
        this.numSerie = numSerie;
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "El portatil de la empresa tiene un numero de serie "+this.numSerie+", el modelo es "+ this.modelo+" y la marca es"+this.MARCA;
    }
}
