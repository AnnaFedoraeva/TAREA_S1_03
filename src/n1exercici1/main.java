package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Crea una classe anomenada Month amb un atribut "name" (que emmagatzemar� el nom del mes de l'any). 
//Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepci� de l'objecte amb atribut "Agost". 
//Despr�s, efectua la inserci� en el lloc que correspon a aquest mes i demostra que l�ArrayList mant� l'ordre correcte.
//Converteix l�ArrayList de l�exercici anterior en un HashSet i assegura�t que no permet duplicats.
//Recorre la llista amb un for i amb un iterador.

public class main {

	public static void main(String[] args) {

		ArrayList<Month> meses = new ArrayList<>();

		Month enero = new Month("enero");
		Month febrero = new Month("febrero");
		Month marzo = new Month("marzo");
		Month abril = new Month("abril");
		Month mayo = new Month("mayo");
		Month junio = new Month("junio");
		Month julio = new Month("julio");
		Month septiembre = new Month("septimebre");
		Month octubre = new Month("octubre");
		Month noviembre = new Month("noviembre");
		Month diciembre = new Month("diciembre");

		meses.add(enero);
		meses.add(febrero);
		meses.add(marzo);
		meses.add(abril);
		meses.add(mayo);
		meses.add(junio);
		meses.add(julio);
		meses.add(septiembre);
		meses.add(octubre);
		meses.add(noviembre);
		meses.add(diciembre);

		Month agosto = new Month("agosto");

		meses.add(7, agosto);

		System.out.println("El mes agosto esta en la posici�n correcta: " + meses.toString());

		HashSet<Month> hashSet = new HashSet<Month>(meses);

		hashSet.add(agosto);
		hashSet.add(agosto);
		hashSet.add(agosto);
		
		int contador = 0;
		
		//usamos for-each para recorrer hashSet y confirmar que el objeto agosto no esta duplicado (contador==1)
		for(Month mes: hashSet) {
			if (mes.equals(agosto)) {
				contador++;
			}
		}
		System.out.println("El mes de agosto aparece en la lista solo una vez: " + contador);
		
		//recorremos la lista con un iterador

		Iterator<Month> mesesIt = hashSet.iterator();

		while (mesesIt.hasNext()) {
			System.out.println(mesesIt.next());
		}

	}

}
