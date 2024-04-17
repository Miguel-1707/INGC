import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener{
    Frame f;
    TextField tf;
    Panel p1, p2;
    Button b1;
    Button teclado [];
    String[] nombreBotones = {
        "√", "x²", "%", "/", "7","8","9","*", "4","5","6","-","1","2","3","+", "+/-","0",".","C" 
    };
    

    Calculator(){
        f=new Frame("My Calculator");
        tf= new TextField(60);
        p1= new Panel();
        p2= new Panel();

        b1= new Button("=");
        teclado = new Button[20];
        teclado[20].addActionListener(this); //Escucha al boton

        p1.setLayout(new GridLayout(5, 4, 5, 5));

        for (int i=0; i<20; i++){
            teclado[i]=new Button(nombreBotones[i]);
            p1.add(teclado[i]);
            teclado[i].setBackground(Color.PINK);
        }
        teclado[19].setBackground(Color.RED);

        p2.add(tf);
        f.add(p2, BorderLayout.NORTH);
        f.add(p1,BorderLayout.CENTER);
        f.add(b1, BorderLayout.SOUTH);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.BLUE);

        p2.setBackground(Color.yellow);
        p1.setBackground(Color.yellow);


        f.setSize(600, 400);
        f.setResizable(false);
        f.setVisible(true);
    }
    public void actionPermormed(ActionEvent evento){
        System.out.println("Presionaste un boton");
    }

    public static void main(String[] args) {
        Calculator c= new Calculator();

    }
}