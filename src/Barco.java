public class Barco {

    private String matriculaBarco;
    private double esloraEnMts;
    private String anioFabricacion;

    public Barco(String matriculaBarco, double esloraEnMts, String anioFabricacion) {
        this.matriculaBarco = matriculaBarco;
        this.esloraEnMts = esloraEnMts;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatriculaBarco() {
        return matriculaBarco;
    }

    public void setMatriculaBarco(String matriculaBarco) {
        this.matriculaBarco = matriculaBarco;
    }

    public double getEsloraEnMts() {
        return esloraEnMts;
    }

    public void setEsloraEnMts(double esloraEnMts) {
        this.esloraEnMts = esloraEnMts;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double moduloBarco() {
        return esloraEnMts * 10 * 300;
    }

    @Override
    public String toString() {
        return "Matricula: " + matriculaBarco +
                "\nEslora: " + esloraEnMts + "mts " +
                "\nAño de Fabricacion: " + anioFabricacion;
    }
}
