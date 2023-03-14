import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Áreas");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        System.out.println("4. Triángulo");

        System.out.print("Elige una opción (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Ingresa el lado del cuadrado: ");
                double side = scanner.nextDouble();

                break;

            case 2:
                System.out.print("Ingresa la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura del rectángulo: ");
                double height = scanner.nextDouble();

                break;

            case 3:
                System.out.print("Ingresa el radio del círculo: ");
                double radius = scanner.nextDouble();
                System.out.println(Circulo.calcularArea(radius));
                break;

            case 4:
                System.out.print("Ingresa la base del triángulo: ");
                double baseTri = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double heightTri = scanner.nextDouble();

                break;
            case 5:
                System.out.print("Ingresa la altura del cilindro: ");
                double altura = scanner.nextDouble();
                System.out.print("Ingresa el radio de la base del cilindro: ");
                double radio = scanner.nextDouble();
                System.out.println("El area del cilindro es: " + ((2 * 3.1416 * radio * altura) + (2 * 3.1416 * radio * radio)));
            default:
                System.out.println("Opción inválida.");
                break;
        }
        scanner.close();
    }
}