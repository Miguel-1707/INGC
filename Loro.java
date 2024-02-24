public class Loro extends SerVivo{
    String color;
    public Loro(char s,String r, String n,String c){
        super(s,r,n);
        color=c;
    }
    void Gritar(){
        System.out.println("Garrrir- Garrrir");
    }
    void Hablar(){
        System.out.println("¡Snif! ¡Snif!");
    }

    void bailar(){
        System.out.println("El loro esta bailando");
    }

    void comunicar(){
        Hablar();
        Gritar();
        bailar();
    }

}
