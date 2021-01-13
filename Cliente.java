package practica_1;

//clase que guarda los datos de un cliente.
public class Cliente {
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Cliente(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}
	
	public void getDatos() {
		System.out.println(this.dni + "\t" + this.apellidos + ", " + this.nombre);
	}
}
