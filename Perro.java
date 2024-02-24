public class Perro extends SerVivo{
    String color;
    public Perro(char s,String r, String n,String c){
        super(s,r,n);
        color=c;
    }
    void ladrar(){
        System.out.println("Guau Guau");
    }
    void olfatear(){
        System.out.println("¡Snif! ¡Snif!");
    }

    void moverCola(){
        System.out.println("El perro esta moviendo la colas");
    }

    void comunicar(){
        ladrar();
        olfatear();
    }

}


