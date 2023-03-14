import RectanguloManuel.Rectangulo;

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
                double squareArea = side * side;
                System.out.println("El área del cuadrado es: " + squareArea);
                break;

            case 2:
                Rectangulo.calculateRectangleArea();
                break;

            case 3:
                System.out.print("Ingresa el radio del círculo: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("El área del círculo es: " + circleArea);
                break;

            case 4:
                System.out.print("Ingresa la base del triángulo: ");
                double baseTri = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double heightTri = scanner.nextDouble();
                double triangleArea = (baseTri * heightTri) / 2;
                System.out.println("El área del triángulo es: " + triangleArea);
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }
        scanner.close();
    }
}