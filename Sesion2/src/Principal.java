public class Principal {
    public static void main(String[] args) {

        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 750.0);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada.Entrada_Record entradaRecord = new Entrada.Entrada_Record("Candlelight", 150.0);
        System.out.println("\n--- Entrada usando Record ---");
        entradaRecord.mostrarInformacionrecord();
    }
}
