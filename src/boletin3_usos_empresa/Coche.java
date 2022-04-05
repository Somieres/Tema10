package boletin3_usos_empresa;

public class Coche {
    /**
     * Atributos
     */
    public enum Marca{AUDI, MERCEDES, TESLA, BMW}
    public enum ModeloCoche{BERLINA, SPORT, SUPREME}
    private String matricula;
    private Marca marca;
    private ModeloCoche modelo;

    /**
     * Metodos constructores
     */
    public Coche() {
    }

    public Coche(String matricula, Marca marca, ModeloCoche modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Metodos getters y setters
     * @return
     */
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

    /**
     * Sobreescribimos el metodo toString para agregarle los datos del vehiculo
     * @return
     */
    @Override
    public String toString() {
        return "Coche empresa matricula "+this.matricula+", la marca es "+this.marca+" y el modelo" +
                "es "+ this.modelo+".";
    }
}
