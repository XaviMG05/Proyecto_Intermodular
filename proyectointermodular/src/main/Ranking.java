package main;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Puntuacion;

public class Ranking extends JFrame {
	// COMPONENTES
    private JPanel contentPane;
    private JTable tablaRanking;
    private DefaultTableModel modeloTabla;
    private JLabel lblTitulo;
    private JButton btnCerrar;
    
    public Ranking() {

        // VENTANA
        setTitle("Ranking");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        // PANEL
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(15, 15, 70));

        setContentPane(contentPane);

        // TITULO
        lblTitulo = new JLabel("RANKING");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 32));
        lblTitulo.setBounds(250, 20, 250, 40);

        contentPane.add(lblTitulo);

        // TABLA
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("POSICIÓN");
        modeloTabla.addColumn("JUGADOR");
        modeloTabla.addColumn("ACIERTOS");

        tablaRanking = new JTable(modeloTabla);
        tablaRanking.setRowHeight(30);
        tablaRanking.setFont(new Font("Arial", Font.PLAIN, 16));
        tablaRanking.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        JScrollPane scrollPane = new JScrollPane(tablaRanking);
        scrollPane.setBounds(80, 90, 520, 280);

        contentPane.add(scrollPane);

        // BOTON CERRAR
        btnCerrar = new JButton("CERRAR");
        btnCerrar.setBounds(260, 400, 150, 40);
        btnCerrar.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(btnCerrar);
        btnCerrar.addActionListener(e -> {
        	dispose();
        });

        // CARGAR DATOS
        cargarRanking();
    }

    public void cargarRanking() {
        ArrayList<Puntuacion> lista = ConexionMongoDB.obtenerRanking();
        modeloTabla.setRowCount(0);
        int posicion = 1;
        for (Puntuacion p : lista) {
            modeloTabla.addRow(new Object[] {
                posicion,
                p.getJugador(),
                p.getPreguntasAcertadas()
            });
            posicion++;
        }
    }
}