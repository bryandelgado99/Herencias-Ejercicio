public class Triangulo1 extends Figuras {
    private double area_triangulo1;
    private double perimtero_triangulo1;
    private double base_triangulo;
    private double altura_triangulo;
    private int num_lados;

    //constructor

    public Triangulo1(String nombre_figura1, double radio, double pi, double lado, double area_triangulo1, double perimtero_triangulo1, double base_triangulo, double altura_triangulo, int num_lados) {
        super(nombre_figura1, radio, pi, lado);
        this.area_triangulo1 = area_triangulo1;
        this.perimtero_triangulo1 = perimtero_triangulo1;
        this.base_triangulo = base_triangulo;
        this.altura_triangulo = altura_triangulo;
        this.num_lados = num_lados;
    }

     //getters and setters
    public double getArea_triangulo1() {
        return area_triangulo1;
    }

    public void setArea_triangulo1(double area_triangulo1) {
        this.area_triangulo1 = area_triangulo1;
    }

    public double getPerimtero_triangulo1() {
        return perimtero_triangulo1;
    }

    public void setPerimtero_triangulo1(double perimtero_triangulo1) {
        this.perimtero_triangulo1 = perimtero_triangulo1;
    }

    public double getBase_triangulo() {
        return base_triangulo;
    }

    public void setBase_triangulo(double base_triangulo) {
        this.base_triangulo = base_triangulo;
    }

    public double getAltura_triangulo() {
        return altura_triangulo;
    }

    public void setAltura_triangulo(double altura_triangulo) {
        this.altura_triangulo = altura_triangulo;
    }

    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }

    //metodos
    private double areaTriangulo1(){
        area_triangulo1 = (base_triangulo * altura_triangulo)/2;
        return area_triangulo1;
    }

    private double perimetroTriangulo() {
        perimtero_triangulo1 = num_lados * lado;
        return perimtero_triangulo1;
    }

    public double getAreaTriangulo() {
        return area_triangulo1;
    }
    public double getPerimetroTriangulo() {
        return perimtero_triangulo1;
    }
}
