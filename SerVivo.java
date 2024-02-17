public abstract class SerVivo{
    String nombre, raza;
    int edad,energia,animo,salud,hambre;
    //animo: 5-feliz (81-100), 4-contento (61-80), 3-tristeycansado (41-60),2-enojado (21-40),1-Depresion (0-20).
    char sexo;

    public SerVivo(char s, String r, String n, String c){
        nombre=n;
        raza=r;
        edad=0;
        sexo=s;
    }

    void comer(int porcion){
        System.out.println("Todo ser vivo necesita alimentarse");
        energia+=porcion*25;
        animo+=20;
    }
    void descansar(int tiempo){
        System.out.println("Descansando:zzzz.");
        energia+=tiempo*10;
        animo+=20;
    }
    void jugar(){
        System.out.println("Jugando....2");
        energia-=10;
        animo+=10;
    }
    void banarlo(){
        System.out.println("Limpiando...=Limpio");
        animo+=20;
    }
    abstract void comunicar();
}