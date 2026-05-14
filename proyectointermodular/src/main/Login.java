package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {

	// COMPONENTES
	private JPanel contentPane;
	private JTextField txtNombre;
	private JButton btnConfirmar;
	
	public Login() {
		// CONFIGURACIÓN VENTANA
		setTitle("Registro");
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		// PANEL PRINCIPAL
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(10, 10, 70));

		setContentPane(contentPane);

		// TÍTULO
		JLabel lblTitulo = new JLabel("REGISTRO");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 40));
		lblTitulo.setBounds(370, 80, 300, 50);

		contentPane.add(lblTitulo);

		// LABEL NOMBRE
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNombre.setBounds(270, 280, 120, 30);

		contentPane.add(lblNombre);

		// CAJA TEXTO
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		txtNombre.setBounds(400, 275, 250, 40);

		contentPane.add(txtNombre);

		// BOTÓN CONFIRMAR
		btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.setFont(new Font("Arial", Font.BOLD, 22));
		btnConfirmar.setBounds(370, 400, 230, 55);

		contentPane.add(btnConfirmar);

		// EVENTO BOTÓN
		btnConfirmar.addActionListener(e -> {

			String nombreJugador = txtNombre.getText();

			// VALIDAR
			if(nombreJugador.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese un nombre");
			} else {

				// GUARDAR NOMBRE
				PrincipalApp.nombreJugador = nombreJugador;

				// ABRIR MENÚ PRINCIPAL
				MenuPrincipal menu = new MenuPrincipal();
				menu.setVisible(true);

				// CERRAR LOGIN
				dispose();
			}
		});
	}
}