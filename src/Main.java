public class Main {
    public static void main(String[] args) {

        Persona personaUno = new Persona("Capitán", "Harlock", "Y2574584H");
        Barco arcadia = new YateDeLujo("HF895484G", 10, "1978", 9999.5, 1000);
        Alquiler alquilerUno = new Alquiler(personaUno, "21/01/2023", "10/04/2023", "De Punta", arcadia);
        System.out.println(alquilerUno);
        alquilerUno.calcularAlquilerTotal();

        Persona personaDos = new Persona("Jack", "Sparrow", "E2659413F");
        Barco perlaNegra = new Velero("B4821675P", 5, "1948", 3);
        Alquiler alquilerDos = new Alquiler(personaDos, "21/02/2024", "14/06/2024", "De Costado", perlaNegra);
        System.out.println(alquilerDos);
        alquilerDos.calcularAlquilerTotal();

        Persona personaTres = new Persona("Gabriel", "Osorio", "Y6894116H");
        Barco corbeta = new Barco("L6952354P", 3, "1990");
        Barco fragata = new EmbarcacionDeportiva("J6953215U", 8, "2005", 95.5);
        Alquiler alquilerTres = new Alquiler(personaTres, "16/03/2023", "13/06/2023", "De Costado", corbeta);
        Alquiler alquilerCuatro = new Alquiler(personaTres, "21/08/2023", "12/11/2023", "De Punta", fragata);
        System.out.println(alquilerTres);
        alquilerTres.calcularAlquilerTotal();
        System.out.println(alquilerCuatro);
        alquilerCuatro.calcularAlquilerTotal();

    }
}