import java.util.*;
public class MascotaVirtual{
   MascotaVirtual mascota;
   Gato g;
   Perro p;
   Loro l;
   
public MascotaVirtual(int t,char s,String r, String n,String c){  
      if (t == 1) {
         Gato g = new Gato(s, r, n, c);
         g.cicloVida();
   } else if (t == 2) {
         Perro p = new Perro(s, r, n, c);
         p.cicloVida();
   } else if (t == 3) {
         Loro l = new Loro(s, r, n, c);
         l.cicloVida();
   } else {
         System.out.println("Bye!");
   } 
   }

   public static void main(String args[]){
      String n, c,r;
      char s;
      int t;   
      System.out.println("Que quieres:\n1-Gato\n2-Perro\n3-Cotorro\n4-Salir2");
      Scanner sc=new Scanner(System.in);  
      t=sc.nextInt();
      if(t<4){
      System.out.println("Sexo de tu mascota? ");
      s=sc.next().charAt(0);sc.nextLine();  
      System.out.println("Raza ?");
      r=sc.nextLine();
      System.out.println("Nombre ?");
      n=sc.nextLine();
      System.out.println("Color ?");
      c=sc.nextLine();
      new MascotaVirtual(t,s,r,n,c);
      }else System.out.println("Bye!");
   }

}