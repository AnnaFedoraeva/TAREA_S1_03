package n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.DrbgParameters.Capability;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		FileInputStream doc = new FileInputStream("C:\\Users\\anna1\\Documents\\IT ACADEMY\\countries.txt");
		FileOutputStream docPoints = new FileOutputStream("C:\\Users\\anna1\\Documents\\IT ACADEMY\\classificacio.txt");
		Map<String, String> map = new HashMap<>();
		Map<String, Integer> mapPoints = new HashMap<>();
		BufferedReader txt = new BufferedReader(new InputStreamReader(doc, "utf-8"));
		BufferedWriter txtPoints = new BufferedWriter(new OutputStreamWriter(docPoints, "utf-8"));
		String line;
		// añadimos los datos del fichero countries.txt en HashMap map
		while (((line = txt.readLine()) != null) && (!line.isEmpty())) {
			String[] parts = line.split(" ");
			String key = parts[0];
			String value = parts[1];
			map.put(key, value);
		}
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
		// añadimos los datos de HashMap mapPoints al fichero classificacio.txt
		for (Map.Entry<String, Integer> entry : mapPoints.entrySet()) {
			txtPoints.write(entry.getKey() + ": " + entry.getValue());
			txtPoints.newLine();

		}

		txtPoints.close();
	}
}
