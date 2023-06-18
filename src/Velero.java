public class Velero extends Barco {

    private int numMastiles;

    public Velero(String matriculaBarco, double esloraEnMts, String anioFabricacion, int numMastiles) {
        super(matriculaBarco, esloraEnMts, anioFabricacion);
        this.numMastiles = numMastiles;
    }
    public int getNumMastiles() {
        return numMastiles;
    }
    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    public double moduloBarco() {
        return super.moduloBarco() + numMastiles;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatriculaBarco() +
                "\nEslora: " + getEsloraEnMts() + "mts " +
                "\nAño de Fabricacion: " + getAnioFabricacion() +
                "\nNúmero de Mástiles: " + numMastiles;
    }
}
