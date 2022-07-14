package n1exercici3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Countries {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Map<String, String> map = Leer_txt.leer("C:\\Users\\anna1\\Documents\\IT ACADEMY\\countries.txt");
		Map<String, Integer> mapPoints = new HashMap<>();
		// añadimos los datos de consola en HashMap que contiene puntos y nombres
		for (int i = 1; i <= 2; i++) {
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
	}

}
