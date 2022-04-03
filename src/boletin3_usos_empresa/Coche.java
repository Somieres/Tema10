package boletin3_usos_empresa;

public class Coche {

    public enum Marca{AUDI, MERCEDES, TESLA, BMW}
    public enum ModeloCoche{BERLINA, SPORT, SUPREME}
    private String matricula;
    private Marca marca;
    private ModeloCoche modelo;

    public Coche() {
    }

    public Coche(String matricula, Marca marca, ModeloCoche modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ModeloCoche getModelo() {
        return modelo;
    }

    public void setModelo(ModeloCoche modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return " Su coche de empresa tiene matricula "+this.matricula+", la marca es "+this.marca+" y el modelo" +
                "es "+ this.modelo+".";
    }
}
