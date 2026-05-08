
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;


import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConexionMongoDB {

	public static void main(String[] args) {
        // Direccion de la BBDD en MongoDB
        String uri = "mongodb+srv://jsricop:Practica3enRayaBBDDyProg@futbol3raya.jnutj7r.mongodb.net/";

        // Conexion
        try  {       	
        	MongoClient mongoClient = MongoClients.create(uri);
            
        	// Base de datos y coleccion
            MongoDatabase database = mongoClient.getDatabase("Concursillo");
            MongoCollection<Document> collectionPreguntas = database.getCollection("preguntas");
            
            
            reiniciarColecciones(collectionPreguntas);
            insertarPreguntas(collectionPreguntas);

            // Leer jugadores
            FindIterable<Document> jugadores = collectionPreguntas.find();
            for (Document jugador : jugadores) {
                System.out.println(jugador.getString("nombre"));
            }
            System.out.println("--------------------- Preguntas mostradas--------------------- ");
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	// Metodo para limpiar las colecciones
    public static void reiniciarColecciones(MongoCollection<Document> collectionPreguntas) {
    	collectionPreguntas.deleteMany(new Document()); // Elimina todas las preguntas
   
    }
     
    //Metodo para insertar preguntas
    public static void insertarPreguntas(MongoCollection<Document> collectionPreguntas) {
 	collectionPreguntas.insertMany(Arrays.asList(

        new Document("pregunta", "¿Cuál es el planeta más grande del sistema solar?")
            .append("opciones", Arrays.asList("Marte", "Júpiter", "Saturno", "Venus"))
            .append("respuesta", "Júpiter"),

        new Document("pregunta", "¿Quién pintó la Mona Lisa?")
            .append("opciones", Arrays.asList("Van Gogh", "Picasso", "Leonardo da Vinci", "Dalí"))
            .append("respuesta", "Leonardo da Vinci"),

        new Document("pregunta", "¿Cuál es la capital de Australia?")
            .append("opciones", Arrays.asList("Sídney", "Melbourne", "Canberra", "Perth"))
            .append("respuesta", "Canberra"),

        new Document("pregunta", "¿En qué continente está Egipto?")
            .append("opciones", Arrays.asList("Asia", "Europa", "África", "Oceanía"))
            .append("respuesta", "África"),

        new Document("pregunta", "¿Cuál es el océano más grande del mundo?")
            .append("opciones", Arrays.asList("Atlántico", "Índico", "Ártico", "Pacífico"))
            .append("respuesta", "Pacífico"),

        new Document("pregunta", "¿Quién escribió Don Quijote de la Mancha?")
            .append("opciones", Arrays.asList("Cervantes", "Lope de Vega", "García Lorca", "Quevedo"))
            .append("respuesta", "Cervantes"),

        new Document("pregunta", "¿Cuál es el símbolo químico del oro?")
            .append("opciones", Arrays.asList("Ag", "Au", "Fe", "O"))
            .append("respuesta", "Au"),

        new Document("pregunta", "¿Cuántos lados tiene un hexágono?")
            .append("opciones", Arrays.asList("5", "6", "7", "8"))
            .append("respuesta", "6"),

        new Document("pregunta", "¿Qué país ganó el Mundial de 2010?")
            .append("opciones", Arrays.asList("Brasil", "Alemania", "España", "Italia"))
            .append("respuesta", "España"),

        new Document("pregunta", "¿Cuál es el idioma más hablado del mundo?")
            .append("opciones", Arrays.asList("Inglés", "Español", "Chino mandarín", "Hindi"))
            .append("respuesta", "Chino mandarín"),

        new Document("pregunta", "¿Qué gas necesitan las plantas para la fotosíntesis?")
            .append("opciones", Arrays.asList("Oxígeno", "Nitrógeno", "CO2", "Helio"))
            .append("respuesta", "CO2"),

        new Document("pregunta", "¿Cuál es la montaña más alta del mundo?")
            .append("opciones", Arrays.asList("K2", "Everest", "Mont Blanc", "Aconcagua"))
            .append("respuesta", "Everest"),

        new Document("pregunta", "¿Quién fue el primer hombre en la Luna?")
            .append("opciones", Arrays.asList("Armstrong", "Gagarin", "Aldrin", "Collins"))
            .append("respuesta", "Armstrong"),

        new Document("pregunta", "¿Cuál es el río más largo del mundo?")
            .append("opciones", Arrays.asList("Amazonas", "Nilo", "Danubio", "Misisipi"))
            .append("respuesta", "Nilo"),

        new Document("pregunta", "¿Qué instrumento mide la temperatura?")
            .append("opciones", Arrays.asList("Barómetro", "Termómetro", "Higrómetro", "Altímetro"))
            .append("respuesta", "Termómetro"),

        new Document("pregunta", "¿Cuál es el país más grande del mundo?")
            .append("opciones", Arrays.asList("China", "EEUU", "Canadá", "Rusia"))
            .append("respuesta", "Rusia"),

        new Document("pregunta", "¿Quién formuló la teoría de la relatividad?")
            .append("opciones", Arrays.asList("Newton", "Einstein", "Tesla", "Galileo"))
            .append("respuesta", "Einstein"),

        new Document("pregunta", "¿Cuál es el hueso más largo del cuerpo humano?")
            .append("opciones", Arrays.asList("Tibia", "Fémur", "Húmero", "Radio"))
            .append("respuesta", "Fémur"),

        new Document("pregunta", "¿En qué país está la Torre Eiffel?")
            .append("opciones", Arrays.asList("Italia", "Francia", "Alemania", "España"))
            .append("respuesta", "Francia"),

        new Document("pregunta", "¿Cuál es el planeta rojo?")
            .append("opciones", Arrays.asList("Venus", "Marte", "Mercurio", "Neptuno"))
            .append("respuesta", "Marte"),

        new Document("pregunta", "¿Cuál es la moneda de Japón?")
	        .append("opciones", Arrays.asList("Yuan", "Won", "Yen", "Dólar"))
	        .append("respuesta", "Yen"),

        new Document("pregunta", "¿Qué órgano bombea la sangre?")
            .append("opciones", Arrays.asList("Pulmón", "Hígado", "Corazón", "Riñón"))
            .append("respuesta", "Corazón"),

        new Document("pregunta", "¿Quién escribió Romeo y Julieta?")
            .append("opciones", Arrays.asList("Shakespeare", "Cervantes", "Dickens", "Tolstoi"))
            .append("respuesta", "Shakespeare"),

        new Document("pregunta", "¿Cuál es el país de la pizza?")
            .append("opciones", Arrays.asList("España", "Italia", "Francia", "Grecia"))
            .append("respuesta", "Italia"),

        new Document("pregunta", "¿Cuántos continentes hay?")
            .append("opciones", Arrays.asList("5", "6", "7", "8"))
            .append("respuesta", "7"),

        new Document("pregunta", "¿Qué animal es el rey de la selva?")
            .append("opciones", Arrays.asList("Tigre", "León", "Elefante", "Jaguar"))
            .append("respuesta", "León"),

        new Document("pregunta", "¿Cuál es el elemento O en la tabla periódica?")
            .append("opciones", Arrays.asList("Oro", "Oxígeno", "Osmio", "Oxalato"))
            .append("respuesta", "Oxígeno"),

        new Document("pregunta", "¿Qué país tiene forma de bota?")
            .append("opciones", Arrays.asList("Italia", "Chile", "Grecia", "Portugal"))
            .append("respuesta", "Italia"),

        new Document("pregunta", "¿Cuál es la capital de Canadá?")
            .append("opciones", Arrays.asList("Toronto", "Vancouver", "Ottawa", "Montreal"))
            .append("respuesta", "Ottawa"),

        new Document("pregunta", "¿Qué deporte juega Rafael Nadal?")
            .append("opciones", Arrays.asList("Fútbol", "Tenis", "Golf", "Baloncesto"))
            .append("respuesta", "Tenis")

    ));

    System.out.println("30 preguntas insertadas correctamente");
}
}


