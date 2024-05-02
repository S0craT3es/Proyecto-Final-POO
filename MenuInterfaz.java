import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInterfaz extends JFrame {
    public MenuInterfaz() {
        // Configuración básica de la ventana
        setTitle("Menú de Videojuego");
        setSize(800, 600); // Tamaño suficiente para centrado
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setBackground(Color.WHITE); // Fondo blanco

        // Panel principal para centrado vertical y horizontal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.WHITE);

        // Subpanel para los botones y centrado vertical
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS)); // Para disposición vertical
        panelBotones.setOpaque(false); // Fondo blanco

        // Definir tamaño uniforme para botones
        Dimension dimensionBoton = new Dimension(200, 50); // Ancho, alto

        // Botones con tamaño uniforme
        JButton jugarButton = new JButton("Jugar");
        JButton scoreboardButton = new JButton("Scoreboard");
        JButton configuracionButton = new JButton("Configuración");
        JButton creditosButton = new JButton("Créditos");

        JButton[] botones = {jugarButton, scoreboardButton, configuracionButton, creditosButton};
        for (JButton boton : botones) {
            boton.setPreferredSize(dimensionBoton);
            boton.setMaximumSize(dimensionBoton);
            boton.setAlignmentX(Component.CENTER_ALIGNMENT); // Para centrar horizontalmente en el BoxLayout
            panelBotones.add(boton);
            panelBotones.add(Box.createVerticalStrut(20)); // Espaciado entre botones
        }

        // Agregar subpanel de botones al panel principal
        panelPrincipal.add(Box.createVerticalGlue(), BorderLayout.NORTH); // Espacio para centrar verticalmente
        panelPrincipal.add(panelBotones, BorderLayout.CENTER); // Para centrar en el centro del BorderLayout
        panelPrincipal.add(Box.createVerticalGlue(), BorderLayout.SOUTH); // Espaciador para centrado

        // Agregar el panel a la ventana
        add(panelPrincipal);

        // Manejadores de eventos para los botones
        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuInterfaz.this, "Iniciando juego...");
            }
        });

        scoreboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuInterfaz.this, "Mostrando scoreboard...");
            }
        });

        configuracionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuInterfaz.this, "Abriendo configuración...");
            }
        });

        creditosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuInterfaz.this, "Universidad Autonoma de Baja California\n Ingenieria en Software y Tecnologias Emergentes\n Steven Nicolae De La Cruz Estrada\n Jose Miguel Velazquez Angulo\n Edgar Yahel Rico Guzman");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuInterfaz().setVisible(true));
    }
}

