import java.io.*; import java.util.*;
public class PruebaGObj{
    public static void main(String args[]){
        Scanner lector=new Scanner(System.in);
        FileInputStream fis=null; FileOutputStream fos=null;
        ObjectInputStream ois=null; ObjectOutputStream oos=null;
        Guardable tmp=null; //Clase serializable
        int e=0; double d=0.0; String cad=null;
        try{ fos=new FileOutputStream("objetos.dat"); oos=new ObjectOutputStream(fos);
        for(int i=0;i<5;i++){ //datos para llenar el objeto
        System.out.print("Insertar un Entero: ");e=lector.nextInt();
        System.out.print("Insertar un Flotante: ");d=lector.nextFloat();
        System.out.print("Insertar una Cadena: ");cad=lector.next();
        tmp=new Guardable(e,d,cad);
        oos.writeObject(tmp); //guarda el objeto en el archivo
        } fos.close();
        //prueba leer los objetos guardados
        fis=new FileInputStream("objetos.dat");
        ois=new ObjectInputStream(fis);
        for(int i=0;i<5;i++){
        tmp=(Guardable) ois.readObject();
        tmp.muestra();
    }
        }catch(IOException E){
        System.out.println("Error al leer/escribir en el archivo");
        }
        catch(ClassNotFoundException E){
        System.out.println("El tipo de clase al que pertenece el objeto es desconocido");
    }
    }
}