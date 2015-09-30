package fisica;
public class Lista {
    private Nodo primero, ultimo;
    private int tamano;
    double sigmaFX, sigmaFY, direccion;
    double resultanteFx, resultanteFy, resultante;
    double componenteFx, componenteFy;
    String magnitud, direc;
    double m, d;
    public double getM() {
        return m;
    }
    public void setM(double m) {
        this.m = m;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    public String getDirecString() {
        return direc;
    }
    public void setDirecString(String direc) {
        this.direc = direc;
    }
    public String getMagniString() {
        return magnitud;
    }
    public void setMagniString(String magnitud) {
        this.magnitud = magnitud;
    }
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
    public double getDireccionTotal(){
        direccion = Math.toDegrees(Math.atan(getSumaFy() / getSumaFx()));
        return direccion;
    }
}