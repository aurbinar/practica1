package practica_1;

import java.util.Vector;

public class Hotel {
	
	private String nombreHotel;
	private String direccionHotel;
	private String webHotel;
	private String telefono;
	private int estrellas;
	private int numeroHabitaciones;
	private Vector<String> extras;
	private Vector<Habitacion>habitaciones;
	
	public Hotel(String nombreHotel, String direccionHotel, String webHotel, String telefono,
				int estrellas, int numeroHabitaciones, Vector<String> extras, 
				Vector<Habitacion>habitaciones) {
		this.nombreHotel = nombreHotel;
		this.direccionHotel = direccionHotel;
		this.webHotel = webHotel;
		this.telefono = telefono;
		this.estrellas = estrellas;
		this.numeroHabitaciones = numeroHabitaciones;
		this.extras = extras;
		this.habitaciones = habitaciones;
	}
	
	public String getDatos() {
		String s = "";
		for(int i = 0; i<this.estrellas;i++) {
			s = s + "*";
		}
		return this.nombreHotel + "   " + s +" estrellas \n\n" + this.webHotel + "\n" + this.direccionHotel + 
			   "\n" + this.telefono + "\n" + this.numeroHabitaciones + " habitaciones libres.\n";
	}
	
	public int getPrecio(Habitacion c, int dias) {
		return c.getPrecio() * dias;	
	}
	
	public String getNombreHotel() {
		return nombreHotel;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public String habitacionesDisponibles() {
		String s = "Habitaciones disponibles: \n";
		for(Habitacion h: habitaciones) {
			if(!h.isReservada())
				s+= h.getDatos() + "\n";
		}
		s+="\n";
		return s;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public Vector<Habitacion> getHabitaciones() {
		return this.habitaciones;
	}
	
	public String getDatosHabitacion() {
		String s = "";
		for(Habitacion h : this.habitaciones) {
			s += "\n\n" + h.getDatos();
		}
		s += "\n";
		return s;
	}
	
	
	
	
	
	
}
