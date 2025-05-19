public class CentralEmergencias {
    public static void main(String[] args) {

        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Valeria");
        Patrulla patrulla = new Patrulla("Patrulla", "José");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad Bomberos", "Gerónimo");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}