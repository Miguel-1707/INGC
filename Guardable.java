import java.io.*;
    public class Guardable //implements Serializable
    {
    int e; double d; String cad;
    public Guardable(int e,double d,String cad){
    this.e=e;
    this.d=d;
    this.cad=cad;
}
    public void muestra(){
        System.out.println("Entero: "+e);
        System.out.println("Flotante: "+d);
        System.out.println("Cadena: "+cad);
    } 
}
