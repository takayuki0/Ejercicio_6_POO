public class YateDeLujo extends Barco {

    private double potenciaCV;
    private int numCamarotes;

    public YateDeLujo(String matriculaBarco, double esloraEnMts, String anioFabricacion, double potenciaCV, int numCamarotes) {
        super(matriculaBarco, esloraEnMts, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public double moduloBarco() {
        return super.moduloBarco() + potenciaCV + numCamarotes;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatriculaBarco() +
                "\nEslora: " + getEsloraEnMts() + "mts " +
                "\nAño de Fabricacion: " + getAnioFabricacion() +
                "\nPotencia en CV: " + potenciaCV +
                "\nCamarotes: " + numCamarotes;
    }
}
