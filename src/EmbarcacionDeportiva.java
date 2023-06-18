public class EmbarcacionDeportiva extends Barco {
    private double potenciaCV;

    public EmbarcacionDeportiva(String matriculaBarco, double esloraEnMts, String anioFabricacion, double potenciaCV) {
        super(matriculaBarco, esloraEnMts, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
    public double getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    public double moduloBarco() {
        return super.moduloBarco() + potenciaCV;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatriculaBarco() +
                "\nEslora: " + getEsloraEnMts() + "mts " +
                "\nAño de Fabricacion: " + getAnioFabricacion() +
                "\nPotencia en CV: " + potenciaCV;
    }
}
