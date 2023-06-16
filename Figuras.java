public class Figuras {

    //Atributos
    String nombre_figura1;
    double radio;
    double Pi = 3.1416;
    double lado;

    //Constructor

    public Figuras(String nombre_figura1, double radio, double pi, double lado) {
        this.nombre_figura1 = nombre_figura1;
        this.radio = radio;
        Pi = pi;
        this.lado = lado;
    }

    //Métodos

    public String getNombre_figura1() {
        return nombre_figura1;
    }

    public void setNombre_figura1(String nombre_figura1) {
        this.nombre_figura1 = nombre_figura1;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double pi) {
        Pi = pi;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
