import java.util.Scanner;
public class DecisionBinaria implements LogicaDecision {
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué harías?");
        System.out.println("A: Te arrepientes y mejor vas");
        System.out.println("B: Haces maratón de tu película favorita");
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}

