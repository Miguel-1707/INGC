public class Gato extends SerVivo {
    String color;
    public Gato(char s, String r, String n, String c){
        super(s,r,n);
        color=c;
    }
    void maullar(){
        System.out.println("Miauu, miuauuuuu");
    }
    void ronronear(){
        System.out.println("GrrrrrGrrrrrrr");
    }
    void comunicar(){
        maullar();
        ronronear();
    }
}
