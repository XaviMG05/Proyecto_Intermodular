package main;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import modelo.Pregunta;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.*;
public class ConexionMongoDB {

	public static void InicializarBaseDatos() {
        // Direccion de la BBDD en MongoDB
        String uri = "mongodb+srv://gonzalezlopezpablojorge_db_user:Admin.2026@concursillo.6tlfmeb.mongodb.net/?appName=Concursillo";

        // Conexion
        try  {       	
        	MongoClient mongoClient = MongoClients.create(uri);
            
        	// Base de datos y coleccion
            MongoDatabase database = mongoClient.getDatabase("Concursillo");
            MongoCollection<Document> collectionPreguntas = database.getCollection("preguntas");
            
            
            insertarPreguntas(collectionPreguntas);

            // Leer jugadores
            FindIterable<Document> preguntas = collectionPreguntas.find();
            for (Document pregunta : preguntas) {
                System.out.println(pregunta.getString("pregunta"));
            }
            System.out.println("--------------------- Preguntas mostradas--------------------- ");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    
    public static ArrayList<Pregunta> obtenerPreguntas() { // Método que obtiene todas las preguntas almacenadas en la base de datos y las devuelve en una lista
        ArrayList<Pregunta> listaPreguntas = new ArrayList<>(); // Lista donde se almacenarán los objetos Pregunta creados desde MongoDB
        String uri = "mongodb+srv://gonzalezlopezpablojorge_db_user:Admin.2026@concursillo.6tlfmeb.mongodb.net/?appName=Concursillo";

        try {
            MongoClient mongoClient = MongoClients.create(uri); // Se establece conexión con MongoDB
            MongoDatabase database = mongoClient.getDatabase("Concursillo"); // Se selecciona la base de datos
            MongoCollection<Document> collectionPreguntas = database.getCollection("preguntas"); // Se accede a la colección de preguntas
            FindIterable<Document> preguntas = collectionPreguntas.find(); // Se obtienen todos los documentos de la colección

            for (Document doc : preguntas) { // Se recorre cada documento recuperado de MongoDB
                String pregunta = doc.getString("pregunta"); // Se obtiene el texto de la pregunta
                ArrayList<String> opciones = new ArrayList<>((List<String>) doc.get("opciones")); // Se convierten las opciones a ArrayList
                String respuesta = doc.getString("respuesta"); // Se obtiene la respuesta correcta
                Pregunta p = new Pregunta(pregunta, opciones, respuesta); // Se crea el objeto Pregunta con los datos obtenidos
                listaPreguntas.add(p); // Se añade la pregunta a la lista final
            }

        } catch (Exception e) { // Captura cualquier error durante la conexión o lectura de datos
            e.printStackTrace(); // Imprime el error para depuración
        }

        return listaPreguntas; // Devuelve la lista completa de preguntas
    }
    
    public static void guardarPuntuacion(String jugador, int preguntasAcertadas) {
        String uri = "mongodb+srv://gonzalezlopezpablojorge_db_user:Admin.2026@concursillo.6tlfmeb.mongodb.net/?appName=Concursillo";
        try (MongoClient mongoClient = MongoClients.create(uri)) { // Se crea la conexión a MongoDB y se cierra automáticamente al finalizar el bloque try
            MongoDatabase database = mongoClient.getDatabase("Concursillo");
            MongoCollection<Document> ranking = database.getCollection("ranking"); // Se accede a la colección "ranking"
            
            Document filtro = new Document("jugador", jugador); // Filtro para buscar si ya existe un jugador con ese nombre
            Document actualizacion = new Document("$set", new Document("preguntas_acertadas", preguntasAcertadas)); // Define la actualización de la puntuación usando operador $set
            ranking.updateOne(filtro, actualizacion, new com.mongodb.client.model.UpdateOptions().upsert(true)); // Si el jugador existe lo actualiza, si no existe lo crea (upsert)
            System.out.println("Puntuación guardada");
        } catch(Exception e) { // Captura cualquier error durante la conexión o actualización
            e.printStackTrace(); // Imprime el error para depuración
        }
    }
    public static ArrayList<Puntuacion> obtenerRanking() { // Método que obtiene el ranking de jugadores desde MongoDB ordenado por puntuación
        ArrayList<Puntuacion> lista = new ArrayList<>(); // Lista donde se almacenarán los objetos Puntuacion

        String uri = "mongodb+srv://gonzalezlopezpablojorge_db_user:Admin.2026@concursillo.6tlfmeb.mongodb.net/?appName=Concursillo";

        try (MongoClient mongoClient = MongoClients.create(uri)) { // Conexión a MongoDB
            MongoDatabase database = mongoClient.getDatabase("Concursillo"); // Selección de la base de datos
            MongoCollection<Document> ranking = database.getCollection("ranking"); // Acceso a la colección ranking

            FindIterable<Document> resultados = ranking.find().sort(new Document("preguntas_acertadas", -1)); // Obtiene todos los documentos ordenados de mayor a menor puntuación

            for (Document doc : resultados) { // Recorre cada documento del ranking
                Puntuacion p = new Puntuacion( // Crea un objeto Puntuacion con los datos del documento
                    doc.getString("jugador"),
                    doc.getInteger("preguntas_acertadas")
                );
                lista.add(p); // Añade la puntuación a la lista final
            }

        } catch (Exception e) { // Captura cualquier error en la consulta o conexión
            e.printStackTrace(); // Imprime el error para depuración
        }

        return lista;
    }
}