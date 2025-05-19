public class TransicionSimple implements TransicionHistoria {
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("B")) {
            System.out.println("La pasaste mejor en tu casa");
        } else {
            System.out.println("Llovió y no la pasaste bien :(");
        }
    }
}