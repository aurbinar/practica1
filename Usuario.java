package practica_1;

import java.util.Scanner;

//Clase que asocia un cliente con un mail y una contraseña
public class Usuario implements Datos{
	
	private Cliente cliente;
	private String mail;
	private String contraseña;

	public Usuario() {
	}

	//constructor de un Usuario equivalente a un "registro"
	public void registro(){
		Scanner s = new Scanner(System.in);
		String nombre;
		String apellidos;
		String dni;
		
		System.out.println("Introduce tu Nombre: ");
		nombre = s.next();
		
		System.out.println("Introduce tus apellidos: ");
		apellidos = s.next();
		
		System.out.println("Introduce tu dni: ");
		dni = s.next();
		
		this.cliente = new Cliente(nombre, apellidos, dni);
		
		System.out.println("Introduce un correo electronico");
		this.mail = s.next();
		
		System.out.println("Introduce la contraseña: ");
		this.contraseña = s.next();
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}


	public String getMail() {
		return mail;
	}


	public String getContraseña() {
		return contraseña;
	}


	public String getDatos() {
		String s = "";
		cliente.getDatos();
		s = this.mail + "\n";
		return s;
	}
}
