import java.util.*;

public class MascotaVirtual {
    Gato g;
    //Perro p:
    //Cotorro c;

    public MascotaVirtual(int y, char s, String r, String n, String c){
        int tipoMascota=1;
        if(tipoMascota==1)g=new Gato(char s, String r, String n, String c);
    }
    public static void main(String args[]) {
        String n, c, r;
        char s;
        int t;
        System.out.println("Que quieres 1-Gato\n2-Perro\n3cotorro\4Salir2");
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        System.out.println("Sexo de tu mascota? ");
        s=sc.next().charAt(0);
        System.out.println("Raza de tu mascota?");
        r=sc.nextLine();
        System.out.println("Nombre?");
        n=sc.nextLine();
        System.out.println("Color?");
        c=sc.nextLine();
        new MascotaVirtual(s,r,n,c);
    }

}
