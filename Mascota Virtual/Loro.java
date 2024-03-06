public class Loro extends SerVivo{
    String color;
   public Loro(char s,String r, String n,String c){
     super(s,r,n); 
     color=c;
   }
    void cantar(){
      System.out.println("La-LaLa-la-La");
    } 
   void hablar(){
     System.out.println("Hola, Hola, Hola");
   }
    void comunicar(){
      cantar();
      hablar();
  }
 }