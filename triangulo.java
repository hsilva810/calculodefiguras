import java.util.*;
import java.util.Scanner;

public class triangulo {
    public static void calcular(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        double baseTri = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double heightTri = scanner.nextDouble();
        double triangleArea = (baseTri * heightTri) / 2;
        System.out.println("El área del triángulo es: " + triangleArea);
    }
}
