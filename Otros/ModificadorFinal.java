//Modificador Final

class ModificadorFinal {
    int a;
    int M;
    ModificadorFinal(){
        M=200;
        a=500;
        System.out.println("Objeto creado");
    }
    public void modifica(int ext){
        M+=ext;
        a*=ext;
    }
    public static void main(String args[]){
        ModificadorFinal objeto =new ModificadorFinal();
        ModificadorFinal obj2 =new ModificadorFinal();
        objeto.modifica(25);
        System.out.println("obj2.a= "+obj2.a+"objeto.a"+objeto.a);
    }
}
