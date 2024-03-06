import java.awt.*;

class MiGrafico {
    //Agregado de los  componentes gráficos
    Frame f;
    Button b;
    Label e;
    TextField tx;
    TextArea ta;
    CheckboxGroup cg;
    Checkbox cb, cb1;
    Choice ch;
    MenuBar mb;
    Menu m1,m2,m3;
    MenuItem mi1, mi2,mi3;
    CheckboxMenuItem cbi;


    MiGrafico(){
        //Creacion de los Componentes
        f =new Frame("Titulo de la Ventana");
        b = new Button("Presioname");
        e= new Label("El que presione reprueba");
        ta=new TextArea();
        cg=new CheckboxGroup();//Importante para agregarlo a un grupo //Para evitar que se seleccione mas de una opcion
        cb=new Checkbox("Femenino", cg, false); //Importante para crear cada componente del grupo
        cb1=new Checkbox("Masculino", cg, false);
        ch= new Choice(); 
        tx=new TextField(20);
        ch.add("Azul");
        ch.add("Rojo");
        ch.add("Amarillo");
        mb=new MenuBar();
        m1=new Menu("Archivo");
        m2=new Menu("Edicion");
        m3=new Menu("Vista");
        mi1=new MenuItem("Nuevo");
        mi2=new MenuItem("Buscar");
        mi3=new MenuItem("Zoom");
        cbi=new CheckboxMenuItem("Seleccionado");
        mb.add(m1);
        mb.add(m2); 
        m1.add(m3);
        m1.addSeparator();

        m1.add(mi1);
        m2.add(mi2);
        m2.add(cbi);

        m3.add(mi3);

        f.setLayout(new FlowLayout()); //IMPORTANTE para  que los componentes se distribuyan en el frame en FLOW

        //Agregados al frame
        f.add(b);
        f.add(ch);
        f.add(e);
        f.add(tx);
        f.add(ta);
        f.add(cb);
        f.add(cb1);
        f.setMenuBar(mb); //Importante para  mostrar el menú en la ventana
        

        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        MiGrafico mg=new MiGrafico();
    }
}
