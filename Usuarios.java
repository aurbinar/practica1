package practica_1;

import java.util.Scanner;
import java.util.Vector;

//Clase para guardar los datos de todos los Usuarios
public class Usuarios {
	
	private static Vector<Usuario>usuarios;
	
	
	public Usuarios() {
	}
	//Metodo para acceder a las reservas de habitaciones
	public static Usuario LogIn() {
		System.out.println("\t\tLog In");
		Scanner sn = new Scanner(System.in);
		String mail;
		boolean acceso = false;
		System.out.println("Introduce tu email:");
		mail = sn.next();
		
		System.out.println("Introduce la contraseña:");
		String contraseña;
		contraseña = sn.next();
		Usuario result = new Usuario();
		
		if(usuarios == null)
			usuarios = new Vector<Usuario>();
		
		for(Usuario u: usuarios) {
			if(mail.equals(u.getMail()) && contraseña.equals(u.getContraseña())) {
				acceso = true;
				result = u;
				break;
			}
		}
		if(acceso) {
			System.out.println("Bienvenido " + result.getCliente().getNombre());
			return result;
		}
		else {
			System.out.println("El mail o la contraseña son incorrectos.\n"
								+ "1. LogIn \n2.Registrarse");
			Scanner opcion = new Scanner(System.in);
			int op;
			op = opcion.nextInt();
			do {
				if(op == 1)
					LogIn();
				else if(op == 2) {
					registrarse();
					break;
				}
				else {
					System.out.println("Introduce una opcion valida");
					op = opcion.nextInt();
				}
			}while(op != 1 || op != 2);
		}
		return null;
	}
	
	//Metodo para registrarse comparando con otros usuarios para que no haya Usuarios iguales
	public static void registrarse() {
		Usuario c = new Usuario();
		c.registro();
		
		if(usuarios == null)
			usuarios = new Vector<Usuario>();
		
		for(Usuario r: usuarios) {
			if(c.getMail().equals(r.getMail()) || c.getCliente().getDni().equals(r.getCliente().getDni())) {
				System.out.println("Estos datos ya estan asociados a otro cliente");
				Usuarios.registrarse();
			}
		}
		usuarios.add(c);
		Usuarios.LogIn();
		}
	

}
