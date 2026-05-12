package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;

public class MenuPrincipal extends JFrame {

    // COMPONENTES
    private JPanel contentPane;

    public MenuPrincipal() {

        // CONFIGURACIÓN VENTANA
        setTitle("Concursillo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        // PANEL PRINCIPAL
        contentPane = new JPanel();
        contentPane.setBackground(new Color(20, 20, 60));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);

        setContentPane(contentPane);

        // TÍTULO
        JLabel lblTitulo = new JLabel("EL CONCURSILLO");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 32));
        lblTitulo.setBounds(250, 20, 350, 40);

        contentPane.add(lblTitulo);
        
        // LOGO
        agregarLogo();

        // JUGADOR
        JLabel jugador = new JLabel("Jugador: " + PrincipalApp.nombreJugador);
        jugador.setForeground(Color.WHITE);
        jugador.setFont(new Font("Arial", Font.PLAIN, 16));
        jugador.setBounds(40, 20, 250, 20);

        contentPane.add(jugador);

        // BOTONES
        JButton btnJugar = new JButton("EMPEZAR PARTIDA");
        btnJugar.setBounds(250, 251, 300, 50);
        btnJugar.setFont(new Font("Arial", Font.BOLD, 18));

        contentPane.add(btnJugar);

        JButton btnRanking = new JButton("RANKING");
        btnRanking.setBounds(250, 312, 300, 50);
        btnRanking.setFont(new Font("Arial", Font.BOLD, 18));

        contentPane.add(btnRanking);

        JButton btnSalir = new JButton("SALIR");
        btnSalir.setBounds(250, 373, 300, 50);
        btnSalir.setFont(new Font("Arial", Font.BOLD, 18));
        btnSalir.setBackground(new Color(200, 60, 60));
        btnSalir.setForeground(Color.WHITE);

        contentPane.add(btnSalir);
        
        JButton btnInf = new JButton("i");
        btnInf.setBounds(730, 427, 44, 23);
        contentPane.add(btnInf);

        // EVENTOS
        btnJugar.addActionListener(e -> {
            Juego juego = new Juego();
            juego.setVisible(true);
            dispose();
        });

        btnRanking.addActionListener(e -> {
            Ranking ranking = new Ranking();
            ranking.setVisible(true);
        });

        btnSalir.addActionListener(e -> System.exit(0));
        
        btnInf.addActionListener(e -> {
        	JOptionPane.showMessageDialog(null, "\"El Concursillo\" es un programa que simula un concurso interactivo en el que el usuario se enfrentará a diversos tipos de preguntas.\n"
        			+ "Para responder a estas preguntas tendrás que elegir entre 4 opciones donde solo hay una correcta.\n "
        			+ "El usuario dispone de diferentes herramientas de un solo uso para contestar preguntas cuya respuesta no sepas en este juego contamos con 3: \r\n"
        			+ "\r\n"
        			+ "Skip: Te permite saltarte una pregunta contándotela como buena\r\n"
        			+ "\r\n"
        			+ "50/50: Descarta la mitad de las opciones en este caso como siempre son 4 respuestas, elimina 2 de ellas. Por lo cual aumenta tus posibilidades de acertar\r\n"
        			+ "\r\n"
        			+ "Pista: Te da la primera letra de la respuesta correcta");
        });
    }

    // INTRODUCIR LOGO
    private void agregarLogo() {
    	
        // Ruta directa
        ImageIcon iconoOriginal = new ImageIcon("src/Concursillo.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        JLabel lblLogo = new JLabel(new ImageIcon(imagenEscalada));
        lblLogo.setBounds(283, 71, 218, 169);
        contentPane.add(lblLogo);
    }
}