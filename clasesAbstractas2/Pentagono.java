package clasesAbstractas2;
class Pentagono extends FiguraGeometrica {
    double lado;
    double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }
}