public class rectangulo1 extends Figuras{

    //ATRIBUTOS
    private double base;
    private double altura;

    public rectangulo1(String nombre_figura1, double radio, double pi, double lado, double base, double altura) {
        super(nombre_figura1, radio, pi, lado);
        this.base= base;
        this.altura=altura;
    }

    //METODOS
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

    public double areaRectangulo1(double base, double altura){
        return this.base*this.altura;
    }

    public double perimetroRectangulo1(double base, double altura){
        return 2*(this.base+this.altura);
    }

    public void imprimirValoresRectangulo1() {
        System.out.println("Area del Rectangulo 1: " + String.format("%.2f",areaRectangulo1(radio, altura)));
        System.out.println("Perimetro Rectangulo 1: " + String.format("%.2f",perimetroRectangulo1(radio, altura)));
    }
}
