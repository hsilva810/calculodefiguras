public class Cilindro {

    private double radio;
    private double altura;

    public Cilindro(){}

    public Cilindro(double radio,double altura){
        this.radio=radio;
        this.altura=altura;
    }

    public double calcularVolumen(){
        return Math.PI*(radio*radio)*altura;
    }
}
