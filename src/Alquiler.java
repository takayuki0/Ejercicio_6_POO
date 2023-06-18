public class Alquiler {

    private Persona cliente;
    private String fechaInicialAlquiler;
    private String fechaFinalAlquiler;
    private String posicionAmarre;

    private Barco barco;

    public Alquiler(Persona cliente, String fechaInicialAlquiler, String fechaFinalAlquiler, String posicionAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaInicialAlquiler = fechaInicialAlquiler;
        this.fechaFinalAlquiler = fechaFinalAlquiler;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public String getFechaInicialAlquiler() {
        return fechaInicialAlquiler;
    }

    public void setFechaInicialAlquiler(String fechaInicialAlquiler) {
        this.fechaInicialAlquiler = fechaInicialAlquiler;
    }

    public String getFechaFinalAlquiler() {
        return fechaFinalAlquiler;
    }

    public void setFechaFinalAlquiler(String fechaFinalAlquiler) {
        this.fechaFinalAlquiler = fechaFinalAlquiler;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int calcularDiasAlquiler() {
        String fechaInicial[] = fechaInicialAlquiler.split("/");
        int diaInicio = Integer.parseInt(fechaInicial[0]);
        int mesInicio = Integer.parseInt(fechaInicial[1]);
        int anioInicio = Integer.parseInt(fechaInicial[2]);

        String fechaFinal[] = fechaFinalAlquiler.split("/");
        int diaFinal = Integer.parseInt(fechaFinal[0]);
        int mesFinal = Integer.parseInt(fechaFinal[1]);
        int anioFinal = Integer.parseInt(fechaFinal[2]);

        boolean anioBisiesto = false;
        if (anioInicio % 4 == 0) {
            anioBisiesto = true;
        }

        int diasAlquilerTotal = 0;
        int meses[] = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasAlquiler = 0;
        for (int i = mesInicio; i < meses.length; i++) {
            if (i < mesFinal) {
                diasAlquiler = diasAlquiler + meses[i];
            } else {
                break;
            }
        }
        if (anioBisiesto && mesInicio == 1 || anioBisiesto && mesInicio == 2) {
            diasAlquilerTotal = diasAlquiler + diaFinal - diaInicio + 2;
            return diasAlquilerTotal;
        } else {
            diasAlquilerTotal = diasAlquiler + diaFinal - diaInicio + 1;
            return diasAlquilerTotal;
        }
    }

    public void calcularAlquilerTotal() {
        double alquilerTotal = calcularDiasAlquiler() * barco.moduloBarco();
        System.out.println("El Alquiler total por " + calcularDiasAlquiler() +
                " días para la embarcación es de €: " + alquilerTotal +
                "\n_____________________________________________________________________");
    }



    @Override
    public String toString() {
        return "Alquiler:" +
                "\nCliente: " + cliente +
                "\nFecha Inicial Alquiler: " + fechaInicialAlquiler +
                "\nFecha Final Alquiler: " + fechaFinalAlquiler +
                "\nPosicion Amarre: " + posicionAmarre +
                "\nBarco: " + barco +
                "\n_____________________________________________________________________";
    }
}
