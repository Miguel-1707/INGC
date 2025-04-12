import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        super("Texto"); // Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear y configurar el panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        
        // Título
        JLabel titulo = new JLabel("Texto");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPrincipal.add(titulo, BorderLayout.NORTH);

        // Panel para los botones
        JPanel panelBotonesContainer = new JPanel();
        panelBotonesContainer.setLayout(new FlowLayout(FlowLayout.CENTER)); // Centrar los botones horizontalmente
        // Botones
        String[] nombresBotones = {"Perro", "Gato", "Peces", "Aves", "Reptiles"};
String[] rutasImagenes = {"Imagenes/perro.png", "Imagenes/gato.png", "Imagenes/pez.png", "Imagenes/ave.png", "Imagenes/reptil.png"};
for (int i = 0; i < nombresBotones.length; i++) {
    final int index = i; // Declarar una variable final dentro del bucle
    JButton boton = new JButton(nombresBotones[i]);
    // Redimensionar la imagen
    ImageIcon imagenOriginal = new ImageIcon(rutasImagenes[i]);
    Image img = imagenOriginal.getImage();
    Image imgRedimensionada = img.getScaledInstance(60, 70, Image.SCALE_SMOOTH); // Redimensionar la imagen al tamaño deseado
    ImageIcon imagenRedimensionada = new ImageIcon(imgRedimensionada);
    boton.setIcon(imagenRedimensionada);
    boton.setPreferredSize(new Dimension(150, 80)); // Establecer tamaño específico para los botones
    panelBotonesContainer.add(boton);
    // Agregar ActionListener a cada botón para abrir la ventana correspondiente
    boton.addActionListener(e -> abrirVentana(nombresBotones[index])); // Usar la variable final en la expresión lambda
        }

        // Agregar panel de botones al panel principal
        panelPrincipal.add(panelBotonesContainer, BorderLayout.CENTER); // Añadir panelBotones al centro

        // Agregar imagen al panel principal
        ImageIcon imagen = new ImageIcon("Imagenes/animales.png");
        JLabel etiquetaImagen = new JLabel(imagen);
        etiquetaImagen.setHorizontalAlignment(SwingConstants.CENTER);
        panelPrincipal.add(etiquetaImagen, BorderLayout.SOUTH);
        // Agregar el panel principal a la ventana
        getContentPane().add(panelPrincipal);

        // Configurar el tamaño de la ventana
        setSize(1200, 700); // Ancho x Alto
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        // Hacer la ventana visible
        setVisible(true);
    }

    // Método para abrir la ventana correspondiente al botón presionado
    private void abrirVentana(String tipoAnimal) {
        switch (tipoAnimal) {
            case "Perro":
                VentanaPerros ventanaPerros = new VentanaPerros();
                ventanaPerros.setVisible(true);
                break;
            case "Gato":
                VentanaGatos ventanaGatos = new VentanaGatos();
                ventanaGatos.setVisible(true);
                break;
            case "Peces":
                VentanaPeces ventanaPeces = new VentanaPeces();
                ventanaPeces.setVisible(true);
                break;
            case "Aves":
                VentanaAves ventanaAves = new VentanaAves();
                ventanaAves.setVisible(true);
                break;
            case "Reptiles":
                VentanaReptiles ventanaReptiles = new VentanaReptiles();
                ventanaReptiles.setVisible(true);
                break;
            default:
                System.out.println("Tipo de animal no válido");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VentanaPrincipal::new);
    }
}
