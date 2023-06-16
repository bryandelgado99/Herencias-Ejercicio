package Figuras;

public class circulo1 extends Figuras {
    //variables
    double area;
    double peri;
    double radio;
    double pi;
    double diametro;
    //constructor
    public circulo1(String nombre_figura1, double radio, double pi, double lado,double area,double peri,double diametro) {
        super(nombre_figura1, radio, pi, lado);
        this.area=area;
        this.radio=radio;
        this.peri=peri;
        this.pi=pi;
        this.diametro=diametro;
    }
    //getter y setter
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPeri() {
        return peri;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double getPi() {
        return pi;
    }


    public void setPi(double pi) {
        this.pi = pi;
    }
    //formular del circulo
    public double area(){
        this.area=this.pi*(radio*radio);
        return 0;
    }
    public double peri(){
        this.peri=this.pi*diametro;
        return 0;
    }
    //Imprimir datos de area y perimetro
    public void imprimirCarea(){
        System.out.println("El area del circulo es:"+area);
    }
    public void imprimirCperi(){
        System.out.println("El perimetro del circulo es:"+peri);
    }
}
