public class Circulo3 extends Figuras{

    //Atributos de clase Circulo3
    private double area_circulo;
    private double perimetro_circulo;

    //Constructor
    public Circulo3(String nombre_figura1, double radio, double pi, double lado) {
        super(nombre_figura1, radio, pi, lado);
    }

    //Setter and Getter
    public double getArea_circulo() {
        return area_circulo;
    }

    public void setArea_circulo(double area_circulo) {
        this.area_circulo = area_circulo;
    }

    public double getPerimetro_circulo() {
        return perimetro_circulo;
    }

    public void setPerimetro_circulo(double perimetro_circulo) {
        this.perimetro_circulo = perimetro_circulo;
    }

    //Methods
    private double perimetro(){
        perimetro_circulo = (2*getPi()*radio);
        return perimetro_circulo;
    }

    private double area(){
        area_circulo = (getPi()*Math.pow(radio, 2));
        return area_circulo;
    }

    public void imprimirDatos(){
        System.out.println("El perimetro del circulo es: " + perimetro());
        System.out.println("El area del circulo es: " + area());
    }
}
