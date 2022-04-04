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
        return "" +
                "Tiene un PORTATIL de empresa modelo es "+ this.modelo+".";
    }
}
