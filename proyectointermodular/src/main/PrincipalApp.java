package main;

import javax.swing.SwingUtilities;

public class PrincipalApp {
	public static String nombreJugador;
	
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            ConexionMongoDB.InicializarBaseDatos();

            Login login = new Login();
            login.setVisible(true);

        });
    }
}