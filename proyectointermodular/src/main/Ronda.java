package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ronda extends JFrame {
	// COMPONENTES
    private JPanel contentPane;
    private JLabel titulo;
    private JButton btnVolver;
    private JLabel ronda1;
    private JLabel ronda2;
    private JLabel ronda3;
    private JLabel ronda4;
    private JLabel ronda5;
    private JLabel ronda6;
    private JLabel ronda7;
    private JLabel ronda8;
    private JLabel ronda9;
    private JLabel ronda10;
    private JLabel ronda11;
    private JLabel ronda12;
    private JLabel ronda13;
    private JLabel ronda14;
    private JLabel ronda15;
    
    
    public Ronda(Juego juego) {
        setTitle("Rondas");
        setSize(400, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(20, 20, 60));
        setContentPane(contentPane);

        // TITULO
        titulo = new JLabel("PROGRESO");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setBounds(120, 10, 200, 30);
        contentPane.add(titulo);

        // RONDAS
        ronda1 = new JLabel("Ronda 1");
        ronda1.setForeground(Color.WHITE);
        ronda1.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda1.setBounds(120, 60, 150, 25);
        if (juego.indicePregunta == 0) {
            ronda1.setForeground(Color.YELLOW);
            ronda1.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda1);

        ronda2 = new JLabel("Ronda 2");
        ronda2.setForeground(Color.WHITE);
        ronda2.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda2.setBounds(120, 88, 150, 25);
        if (juego.indicePregunta == 1) {
            ronda2.setForeground(Color.YELLOW);
            ronda2.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda2);

        ronda3 = new JLabel("Ronda 3");
        ronda3.setForeground(Color.WHITE);
        ronda3.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda3.setBounds(120, 116, 150, 25);
        if (juego.indicePregunta == 2) {
            ronda3.setForeground(Color.YELLOW);
            ronda3.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda3);

        ronda4 = new JLabel("Ronda 4");
        ronda4.setForeground(Color.WHITE);
        ronda4.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda4.setBounds(120, 144, 150, 25);
        if (juego.indicePregunta == 3) {
            ronda4.setForeground(Color.YELLOW);
            ronda4.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda4);

        ronda5 = new JLabel("Ronda 5");
        ronda5.setForeground(Color.WHITE);
        ronda5.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda5.setBounds(120, 172, 150, 25);
        if (juego.indicePregunta == 4) {
            ronda5.setForeground(Color.YELLOW);
            ronda5.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda5);

        ronda6 = new JLabel("Ronda 6");
        ronda6.setForeground(Color.WHITE);
        ronda6.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda6.setBounds(120, 200, 150, 25);
        if (juego.indicePregunta == 5) {
            ronda6.setForeground(Color.YELLOW);
            ronda6.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda6);

        ronda7 = new JLabel("Ronda 7");
        ronda7.setForeground(Color.WHITE);
        ronda7.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda7.setBounds(120, 228, 150, 25);
        if (juego.indicePregunta == 6) {
            ronda7.setForeground(Color.YELLOW);
            ronda7.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda7);

        ronda8 = new JLabel("Ronda 8");
        ronda8.setForeground(Color.WHITE);
        ronda8.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda8.setBounds(120, 256, 150, 25);
        if (juego.indicePregunta == 7) {
            ronda8.setForeground(Color.YELLOW);
            ronda8.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda8);

        ronda9 = new JLabel("Ronda 9");
        ronda9.setForeground(Color.WHITE);
        ronda9.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda9.setBounds(120, 284, 150, 25);
        if (juego.indicePregunta == 8) {
            ronda9.setForeground(Color.YELLOW);
            ronda9.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda9);

        ronda10 = new JLabel("Ronda 10");
        ronda10.setForeground(Color.WHITE);
        ronda10.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda10.setBounds(120, 312, 150, 25);
        if (juego.indicePregunta == 9) {
            ronda10.setForeground(Color.YELLOW);
            ronda10.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda10);

        ronda11 = new JLabel("Ronda 11");
        ronda11.setForeground(Color.WHITE);
        ronda11.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda11.setBounds(120, 340, 150, 25);
        if (juego.indicePregunta == 10) {
            ronda11.setForeground(Color.YELLOW);
            ronda11.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda11);

        ronda12 = new JLabel("Ronda 12");
        ronda12.setForeground(Color.WHITE);
        ronda12.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda12.setBounds(120, 368, 150, 25);
        if (juego.indicePregunta == 11) {
            ronda12.setForeground(Color.YELLOW);
            ronda12.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda12);

        ronda13 = new JLabel("Ronda 13");
        ronda13.setForeground(Color.WHITE);
        ronda13.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda13.setBounds(120, 396, 150, 25);
        if (juego.indicePregunta == 12) {
            ronda13.setForeground(Color.YELLOW);
            ronda13.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda13);

        ronda14 = new JLabel("Ronda 14");
        ronda14.setForeground(Color.WHITE);
        ronda14.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda14.setBounds(120, 424, 150, 25);
        if (juego.indicePregunta == 13) {
            ronda14.setForeground(Color.YELLOW);
            ronda14.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda14);

        ronda15 = new JLabel("Ronda 15");
        ronda15.setForeground(Color.WHITE);
        ronda15.setFont(new Font("Arial", Font.PLAIN, 16));
        ronda15.setBounds(120, 452, 150, 25);
        if (juego.indicePregunta == 14) {
            ronda15.setForeground(Color.YELLOW);
            ronda15.setFont(new Font("Arial", Font.BOLD, 18));
        }
        contentPane.add(ronda15);

        // BOTON VOLVER
        btnVolver = new JButton("VOLVER");
        btnVolver.setBounds(120, 520, 150, 40);

        btnVolver.addActionListener(e -> {
            dispose();
            juego.setVisible(true);
        });

        contentPane.add(btnVolver);
    }
}