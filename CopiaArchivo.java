import java.io.*; import java.util.*;
class CopiaArchivo{
    public static void main(String[] args) {
    int c; Scanner sc=new Scanner(System.in);
    String origen, destino;System.out.println("Nombre del archivo:"); origen=sc.nextLine();
    System.out.println("a donde:"); destino=sc.nextLine();
    try { File inputFile = new File(origen); File outputFile = new File(destino);

    FileInputStream fis = new FileInputStream(inputFile);
    FileOutputStream fos = new FileOutputStream(outputFile);
    while ((c = fis.read()) != -1) fos.write(c);
    fis.close(); fos.close();

    } catch (FileNotFoundException e) { System.err.println("FileStreamsTest: " + e);}
    catch (IOException e) {System.err.println("FileStreamsTest: " + e);}
    }   
}
