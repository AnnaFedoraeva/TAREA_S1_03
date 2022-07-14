package n1exercici3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

public class Crear_txt {
	public static  BufferedWriter crear (String archivoPoints, Map<String, Integer> mapPoints) throws IOException {

	FileOutputStream docPoints = new FileOutputStream(archivoPoints);
	BufferedWriter txtPoints = new BufferedWriter(new OutputStreamWriter(docPoints, "utf-8"));
	for (Map.Entry<String, Integer> entry : mapPoints.entrySet()) {
		txtPoints.write(entry.getKey() + ": " + entry.getValue());
		txtPoints.newLine();

	}

	txtPoints.close();
	return txtPoints;
}
	
	

}
