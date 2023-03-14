public class Cuadrado {

    public static String getAreaCuadrado(final Double lado){
        Double area = lado * lado;
        return "El área del cuadrado es: ".concat(area.toString());
    }
}
