import java.util.*;

class UsoStatic{
    public static void main (String args[]){
        float v1 = 0, v2=0;
        Scanner io = new Scanner(System.in);
        System.out.println("Calculo de x^y \nvalor de la base:");
        v1=io.nextFloat();
        System.out.println("Potencia");
        v2=io.nextFloat();
        System.out.println(v1+"^"+v2+"="+Math.pow(v1,v2));
    }
}