package RectanguloManuel;

import java.util.Scanner;

public class Rectangulo {
    public static void calculateRectangleArea () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double height = scanner.nextDouble();
        double rectangleArea = base * height;
        System.out.println("El área del rectángulo es: " + rectangleArea);
    }
}
