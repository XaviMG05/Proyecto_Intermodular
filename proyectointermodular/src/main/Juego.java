package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

import modelo.Pregunta;
import comodines.*;

public class Juego extends JFrame {
	
	// Contenedores y componentes
	public JPanel contentPane;
	public JButton Respuesta1;
	public JButton Respuesta2;
	public JButton Respuesta3;
	public JButton Respuesta4;
	public JLabel Pregunta;
	public JButton btnGuardar;
	public Comodin5050 comodin5050 = new Comodin5050();
	public ComodinPista comodinPista = new ComodinPista();
	public ComodinSkip comodinSkip = new ComodinSkip();
	public ArrayList<Pregunta> listaPreguntas;
	public int indicePregunta = 0;

	
	public Juego() {
		// Configuración ventana
		setTitle("Concursillo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);

		setLocationRelativeTo(null);

		// Panel principal
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 20, 60));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);

		//TITULO
		JLabel lblTitulo = new JLabel("EL CONCURSILLO");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
		lblTitulo.setBounds(257, 9, 258, 30);
		contentPane.add(lblTitulo);
		
		//NOMBRE
		JLabel jugador = new JLabel("Jugador: " + PrincipalApp.nombreJugador);
		jugador.setForeground(Color.WHITE);
		jugador.setBounds(120, 15, 250, 20);

		contentPane.add(jugador);
		
		//PREGUNTA
		Pregunta = new JLabel();
		Pregunta.setForeground(new Color(255, 255, 255));
		Pregunta.setBounds(170, 100, 450, 70);
		Pregunta.setFont(new Font("Arial", Font.BOLD, 18));
		Pregunta.setHorizontalAlignment(JLabel.CENTER);
		Pregunta.setBackground(new Color(240, 240, 240));
		contentPane.add(Pregunta);

		//RESPUESTA 1
		Respuesta1 = new JButton();
		Respuesta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Respuesta1.setBounds(70, 230, 300, 40);
		contentPane.add(Respuesta1);

		//RESPUESTA 2
		Respuesta2 = new JButton();
		Respuesta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Respuesta2.setBounds(440, 230, 300, 40);
		contentPane.add(Respuesta2);

		//RESPUESTA 3
		Respuesta3 = new JButton();
		Respuesta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Respuesta3.setBounds(70, 310, 300, 40);
		contentPane.add(Respuesta3);

		// RESPUESTA 4
		Respuesta4 = new JButton();
		Respuesta4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Respuesta4.setBounds(440, 310, 300, 40);
		contentPane.add(Respuesta4);

		//BOTONES COMODINES
		JButton Comodin_1 = new JButton("50%");
		Comodin_1.setBounds(675, 9, 65, 30);
		Comodin_1.setFocusPainted(false);
		contentPane.add(Comodin_1);
		
		JButton Comodin_2 = new JButton("Pista");
		Comodin_2.setBounds(600, 9, 65, 30);
		Comodin_2.setFocusPainted(false);
		contentPane.add(Comodin_2);
		
		JButton Comodin_3 = new JButton("Skip");
		Comodin_3.setBounds(525, 9, 65, 30);
		Comodin_3.setFocusPainted(false);
		contentPane.add(Comodin_3);

		//BOTON SALIR
		JButton Salir = new JButton("X");
		Salir.setBounds(57, 9, 45, 30);
		Salir.setBackground(new Color(200, 60, 60));
		Salir.setForeground(Color.WHITE);
		Salir.setFocusPainted(false);
		contentPane.add(Salir);

		// EVENTO BOTON SALIR
		Salir.addActionListener(e -> {
			System.exit(0);
		});

		//AÑADIDO: CARGA DESDE MONGODB
		listaPreguntas = ConexionMongoDB.obtenerPreguntas();

		if (listaPreguntas != null && !listaPreguntas.isEmpty()) {
			mostrarPregunta();
		}

		//AÑADIDO: EVENTOS BOTONES
		Respuesta1.addActionListener(e -> comprobarRespuesta(Respuesta1.getText()));
		Respuesta2.addActionListener(e -> comprobarRespuesta(Respuesta2.getText()));
		Respuesta3.addActionListener(e -> comprobarRespuesta(Respuesta3.getText()));
		Respuesta4.addActionListener(e -> comprobarRespuesta(Respuesta4.getText()));
		
		//COMODINES
		Comodin_1.addActionListener(e -> {
		    comodin5050.usarComodin(this);

		    Comodin_1.setEnabled(false);
		    Comodin_1.setBackground(Color.DARK_GRAY);
		    Comodin_1.setForeground(Color.LIGHT_GRAY);
		});

		Comodin_2.addActionListener(e -> {
		    comodinPista.usarComodin(this);

		    Comodin_2.setEnabled(false);
		    Comodin_2.setBackground(Color.DARK_GRAY);
		    Comodin_2.setForeground(Color.LIGHT_GRAY);
		});

		Comodin_3.addActionListener(e -> {
		    comodinSkip.usarComodin(this);

		    Comodin_3.setEnabled(false);
		    Comodin_3.setBackground(Color.DARK_GRAY);
		    Comodin_3.setForeground(Color.LIGHT_GRAY);
		});
	}
		
	public void mostrarPregunta() {
		// VOLVER A MOSTRAR BOTONES
		Respuesta1.setEnabled(true);
		Respuesta2.setEnabled(true);
		Respuesta3.setEnabled(true);
		Respuesta4.setEnabled(true);

		Pregunta p = listaPreguntas.get(indicePregunta);

		Pregunta.setText(p.getPregunta());

		Respuesta1.setText(p.getOpciones().get(0));
		Respuesta2.setText(p.getOpciones().get(1));
		Respuesta3.setText(p.getOpciones().get(2));
		Respuesta4.setText(p.getOpciones().get(3));
	}
		
	public void comprobarRespuesta(String respuestaUsuario) {

		Pregunta p = listaPreguntas.get(indicePregunta);
		if(respuestaUsuario.equals(p.getRespuesta())) {
			System.out.println("CORRECTA");
		} else {
			System.out.println("INCORRECTA");
		}

		indicePregunta++;

		if(indicePregunta < listaPreguntas.size()) {
			mostrarPregunta();
		} else {

			Pregunta.setText("FIN DEL JUEGO");
			
			Respuesta1.setVisible(false);
			Respuesta2.setVisible(false);
			Respuesta3.setVisible(false);
			Respuesta4.setVisible(false);
		}
	}
}