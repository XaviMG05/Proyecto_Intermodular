package main;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;


public class MainApp extends JFrame {

	
		//Contenedores y componentes
		public JPanel contentPane;
		public JTextField Respuesta1, Respuesta2, Respuesta3;
		public JButton btnGuardar;
		
		//Objetos Funcionalidad

		//Modelo por defecto que trabajan los JList
		DefaultListModel modelo = new DefaultListModel();
		private JTextField Respuesta4;
		private JTextField Pregunta;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MainApp frame = new MainApp();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public MainApp() {
			//setIconImage(new ImageIcon(getClass().getResource("/resources/icono.png")).getImage());
			setIconImage(Toolkit.getDefaultToolkit().getImage(MainApp.class.getResource("/resources/icono.png")));
			setTitle("Registro de Usuarios");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 560, 347);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(25, 25, 112));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			Respuesta1 = new JTextField();
			Respuesta1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			Respuesta1.setBounds(33, 236, 188, 20);
			contentPane.add(Respuesta1);
			Respuesta1.setColumns(10);
			
			Respuesta2 = new JTextField();
			Respuesta2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			Respuesta2.setBounds(321, 236, 188, 20);
			contentPane.add(Respuesta2);
			Respuesta2.setColumns(10);
			
			Respuesta3 = new JTextField();
			Respuesta3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			Respuesta3.setBounds(33, 277, 188, 20);
			contentPane.add(Respuesta3);
			Respuesta3.setColumns(10);
			
			Respuesta4 = new JTextField();
			Respuesta4.setBounds(321, 278, 188, 20);
			contentPane.add(Respuesta4);
			Respuesta4.setColumns(10);
			
			Pregunta = new JTextField();
			Pregunta.setBounds(99, 149, 346, 64);
			contentPane.add(Pregunta);
			Pregunta.setColumns(10);
			
			JButton Comodin_1 = new JButton("New button");
			Comodin_1.setBounds(475, 11, 62, 20);
			contentPane.add(Comodin_1);
			
			JButton Comodin_2 = new JButton("New button");
			Comodin_2.setBounds(403, 11, 62, 20);
			contentPane.add(Comodin_2);
			
			JButton Comodin_3 = new JButton("New button");
			Comodin_3.setBounds(331, 11, 62, 20);
			contentPane.add(Comodin_3);
			
			JButton Informacion = new JButton("New button");
			Informacion.setBounds(10, 10, 38, 20);
			contentPane.add(Informacion);
			
			JButton Salir = new JButton("New button");
			Salir.setBounds(67, 10, 38, 20);
			contentPane.add(Salir);
		}
	}
