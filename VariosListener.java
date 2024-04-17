import java.awt.*;
import java.awt.event.*;

class VariosListener implements ActionListener, ItemListener
{

     Frame f;
     MenuBar mb;
     Menu m1, m2, m3;
     MenuItem mi1,mi2, mi3;
     CheckboxMenuItem cbi;
     Choice colores;

    VariosListener(){
        f= new Frame("Titulo de la ventana");
        mb=new MenuBar();
        m1=new Menu("Archivo");
        m2=new Menu("Edicion");
        m3=new Menu("Vista");
        mi1=new MenuItem("Nuevo");
        mi2=new MenuItem("Buscar");
        mi3=new MenuItem("Zoom");
        cbi = new CheckboxMenuItem("Selecciona");
        colores = new Choice();
        colores.add("Negro");
        colores.add("Azul");
        colores.add("Amarillo");
        mb.add(m1);
        mb.add(m2); 
        m1.add(m3);
        m1.addSeparator();
        m1.add(mi1);
        m2.add(mi2);
        m2.add(cbi);
        m3.add(mi3);
        f.setMenuBar(mb);
        f.setLayout(new FlowLayout());
        f.add(colores);
        colores.addItemListener(this);
        cbi.addActionListener(this);
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent evento){
    System.out.println("Presiona un menuItem");
    }

public void itemStateChanged(ItemEvent)
}