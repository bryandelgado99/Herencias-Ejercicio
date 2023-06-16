package Figuras;

public class Rectangulo_2 extends Figuras{

    private double base;
    private double altura;

    public Rectangulo_2(String nombre_figura1, double radio, double pi, double lado, double base, double altura) {
        super(nombre_figura1, radio, pi, lado);
        this.base= base;
        this.altura=altura;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaRectangulo_2(double base, double altura){
        return this.base*this.altura;
    }

    public double perimetroRectangulo_2(double base, double altura){
        return 2*(this.base+this.altura);
    }

    public void imprimirValoresRectangulo_2() {
        System.out.println("Area del Rectangulo 2: " + String.format("%.2f",areaRectangulo_2(radio, altura)));
        System.out.println("Perimetro Rectangulo 2: " + String.format("%.2f",perimetroRectangulo_2(radio, altura)));
    }
}
