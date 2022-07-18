package n1exercici3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

//Donat el fitxer countrties.txt (revisa l'apartat recursos) que cont� pa�sos i capitals. 
//El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>. 
//El programa demana el nom de l�usuari/�ria, i despr�s ha de mostrar un pa�s de forma aleat�ria, guardat en el HashMap. 
//Es tracta de qu� l�usuari/�ria ha d�escriure el nom de la capital del pa�s en q�esti�. Si l�encerta se li suma un punt. 
//Aquesta acci� es repeteix 10 vegades. Un cop demanades les capitals de 10 pa�sos de forma aleat�ria, llavors s�ha de guardar en un fitxer anomenat classificacio.txt, el nom de l�usuari/�ria i la seva puntuaci�.

public class Countries {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Map<String, String> map = Leer_txt.leer("C:\\Users\\anna1\\Documents\\IT ACADEMY\\countries.txt");

		Map<String, Integer> mapPoints = new HashMap<>();
		// a�adimos los datos de consola en HashMap que contiene puntos y nombres
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce tu nombre:");
			String nombre = sc.nextLine();
			Object[] keySet = map.keySet().toArray();
			Object aleatorio = keySet[new Random().nextInt(keySet.length)];
			System.out.println("Introduce la capital de: " + aleatorio);
			String capital = sc.nextLine();
			// en el caso de String de mas de una palabra sustituimos espacio por "_" para
			// que coincida con el formato de los datos del fichero
			capital = capital.replace(" ", "_");
			int points = 0;
			if (map.get(aleatorio).equalsIgnoreCase(capital)) {
				points++;
			}
			mapPoints.put(nombre, points);
		}

		BufferedWriter archivoCreado = Crear_txt.crear("C:\\Users\\anna1\\Documents\\IT ACADEMY\\classificacio.txt",
				mapPoints);

		System.out.println(archivoCreado);
	}

}
