package fisica;
public class Nodo {
    Nodo siguiente;
    double magnitud;
    double angulo;
    public Nodo(double magnitud, double angulo) {
        this.siguiente = null;
        this.magnitud = magnitud;
        this.angulo = angulo;
    }
}