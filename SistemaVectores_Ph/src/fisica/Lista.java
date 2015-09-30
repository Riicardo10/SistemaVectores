package fisica;
public class Lista {
    Nodo primero;
    private Nodo ultimo;
    private int tamano;
    double sigmaFX, sigmaFY;
    double direccion;
    double resultanteFx, resultanteFy, resultante;
    double componenteFx, componenteFy;
    public Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
        this.sigmaFX = 0.0;
        this.sigmaFY = 0.0;
    }
    public Lista insertarVector(double vector, double angulo){
        if(siVacio()){
            Nodo nuevo = new Nodo(vector, angulo);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = null;
        }
        else{
            Nodo nuevo = new Nodo(vector, angulo);
            nuevo.siguiente = null;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this;
    }
    public boolean siVacio(){
        return (this.primero == null);
    }
    public double calculoFX(double vector, double angulo){
        componenteFx = vector * (Math.cos(angulo * 2.0 * Math.PI / 360));
        sigmaFX += componenteFx;
        return componenteFx;
    }
    public double calculoFY(double vector, double angulo){
        componenteFy = vector * (Math.sin(angulo * 2.0 * Math.PI / 360));
        sigmaFY += componenteFy;
        return componenteFy;
    }    
    public double getSumaFx(){
        return sigmaFX;
    }
    public double getSumaFy(){
        return sigmaFY;
    }
    public int getTamanio(){
        return tamano;
    }
    public double calcularResultante(){
        resultanteFx = Math.pow(sigmaFX, 2);
        resultanteFy = Math.pow(sigmaFY, 2);
        resultante = Math.sqrt(resultanteFx + resultanteFy);
        return resultante;
    }
    public double getDireccion(){
        direccion = Math.toDegrees(Math.atan(getSumaFy() / getSumaFx()));
        return direccion;
    }
}