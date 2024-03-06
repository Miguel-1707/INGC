import java.awt.*;

class Gestores{
    Frame f;
    Panel p1, p2;
    Button b1, b2;
    Button teclado []; 

    Gestores(){
        f=new Frame("My Aplication");
        p1= new Panel();
        p2= new Panel();

        b1 = new Button("Siguiente");
        b2 = new Button ("Salir");
        teclado = new Button[10];
        p2.setLayout(new GridLayout(2, 5, 5, 5)); //Filas, columnas, gap horizontal, gap vertical

        for (int i=0; i<10; i++){
            teclado[i]=new Button(String.valueOf(i));
            p2.add(teclado[i]);
        }

        p1.add(b1);
        p1.add(b2);

        f.add(p1, BorderLayout.SOUTH);
        f.add(p2, BorderLayout.CENTER);

        
        f.setSize(600, 600);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        Gestores g= new Gestores();

    }
    
}