package n1exercici1;

public class Month {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Month(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre del mes: " + nombre + ";";
	}
	

}
