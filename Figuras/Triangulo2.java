package Figuras;

public class Triangulo2 extends Figuras{
    //Atributos
    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;


    //Getters and Setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
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


    //Colocar vacio las herencias
    public Triangulo2(String nombre_figura1, double radio, double pi, double lado, double lado1, double lado2, double lado3, double base, double altura) {
        super(nombre_figura1, radio, pi, lado);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }
    //Meotodos
    public double Area_triangulo2() {
        return ((this.base * this.altura)/2);
    }

    public double perimetro_triangulo2() {
        return (this.lado1 + this.lado2 + this.lado3);
    }

    public void imprimir(){
        System.out.println("El perimetro del circulo es: " + perimetro_triangulo2());
        System.out.println("El area del circulo es: " + Area_triangulo2());
    }
}
