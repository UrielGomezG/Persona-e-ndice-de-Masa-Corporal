import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese tu altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese tu peso: ");
        double peso = scanner.nextDouble();

        Persona persona = new Persona(nombre, altura, peso);
        double imc = persona.calcularIMC();

        String classificacion = persona.mostrarIMC();

        System.out.println("El imc es: " + imc +" y tienes "+ classificacion);
    }
}
