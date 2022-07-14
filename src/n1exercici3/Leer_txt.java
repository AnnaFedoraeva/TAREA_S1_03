package n1exercici3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Leer_txt {

	public static Map<String, String> leer(String archivoCountries) throws IOException {
		FileInputStream doc = new FileInputStream(archivoCountries);
		Map<String, String> map = new HashMap<>();
		BufferedReader txt = new BufferedReader(new InputStreamReader(doc, "utf-8"));
		String line;
		// añadimos los datos del fichero countries.txt en HashMap map
		while (((line = txt.readLine()) != null) && (!line.isEmpty())) {
			String[] parts = line.split(" ");
			String key = parts[0];
			String value = parts[1];
			map.put(key, value);
		}
		return map;
	}
	
	
	
}
