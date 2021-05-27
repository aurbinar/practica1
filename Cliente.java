package practica_1;

//clase que guarda los datos de un cliente.
public class Cliente implements Datos{
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
	
	public String getDatos() {
		String s= "";
		s = this.dni + "\t" + this.apellidos + ", " + this.nombre;
		s+="\n";
		return s;
	}
}
