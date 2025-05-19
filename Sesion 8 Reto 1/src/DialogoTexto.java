public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        System.out.println("🎙️ Escena actual: " + paquete.getEscenaActual());
        System.out.println("Rechazas la invitación y te quedas en casa y ves películas <3");
    }
}