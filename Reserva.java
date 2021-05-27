package practica_1;

import java.util.Scanner;
import java.util.Vector;

//Clase que gestiona las distintas reservas que asocia un Hotel, una Habitacion y un usuario
public class Reserva implements Datos{
	
	private Hotel hotel;
	private Usuario usuario;
	private Habitacion habitacion;
	
	
	public Reserva(Hotel hotel, Usuario usuario, Habitacion habitacion) {
		this.hotel = hotel;
		this.usuario = usuario;
		this.habitacion = habitacion;
	}
	
	public Reserva(Hotel hotel, Usuario usuario) {
		this.hotel = hotel;
		this.usuario = usuario;
	}
	
	public Reserva() {	
	}
	
	public void habitaciones() {
		for(Habitacion h: hotel.findHabitacion()) {
			h.getDatos();		
		}
	}
	
	//metodo para reservar una habitacion de un hotel
	public Reserva reservaHabitacion() {
		int i = 1;
		
		Vector<Habitacion> habitaciones = new Vector<Habitacion>();
		for(Habitacion h: hotel.findHabitacion()) {
			habitaciones.add(h);
		}
		
		for(Habitacion h: habitaciones) {		
			System.out.println(Integer.toString(i) + ". ");
			h.getDatos();
			System.out.println();
			i++;
		}
		
		System.out.println("Introduce el número de la habitacion que desea reservar\n");
		int n;
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		
		//Gestion de errores
		while(n<1 || n>habitaciones.size()) {
			System.out.println("Introduce una opcion valida");
			n = sn.nextInt();
		}
			
		Habitacion h = new Habitacion();
		h = habitaciones.elementAt(n-1);
		h.diasReservada();
		Reserva r = new Reserva(this.hotel, this.usuario, h);
			
		r.getDatos();
		return r;
	}
	
	//Metodo para obtener los datos de la reserva
	public String getDatos() {
		String s ="";
		s = "Reserva realizada en el hotel " + this.hotel.getNombreHotel() + " en la habitacion " +
						   this.habitacion.getNumeroHabitacion() + " a nombre de "; this.usuario.getDatos();
	    s+="\n";
	   return s;
	}
	
	
}
