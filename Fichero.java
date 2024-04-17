import java.io.*;
class Fichero {
public static void main( String args[] ) {
    if( args.length > 0 ){
    File f = new File( args[0] );
    System.out.println( "Nombre: "+f.getName() ); System.out.println( "Camino: "+f.getPath() );
        if( f.exists() ) {
        System.out.println( "Fichero existente " );
        System.out.println( (f.canRead() ? " y se puede Leer" : "No se puede leer" ) );
        System.out.println( (f.canWrite() ? " y se puede Escribir" : "No se puede escribir" ) );
    System.out.println( "La longitud del fichero son "+ f.length()+" bytes" );
} else System.out.println( "El fichero no existe." );
} else System.out.println( "Debe indicar un fichero." );
}
}
