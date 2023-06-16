public class circulo2 extends Figuras{

        private float diametro;
        private float circunferencia;
        private float area;

    public circulo2(String nombre_figura1, double radio, double pi, double lado, float diametro, float circunferencia, float area) {
        super(nombre_figura1, radio, pi, lado);
        this.area=area;
        this.circunferencia=circunferencia;
        this.diametro=diametro;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;


    }
    public void imprimirA() {
        System.out.println("El área del círculo es: " + area);
    }
    public void imprimirc() {
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }
    public void imprimird() {
        System.out.println("El diámetro del círculo es: " + diametro);
    }
}
