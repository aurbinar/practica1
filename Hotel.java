package practica_1;

import java.util.Scanner;
import java.util.Vector;

//clase que guarda los datos de un Hotel
public class Hotel implements Datos{
	
	private String nombreHotel;
	private String direccionHotel;
	private String webHotel;
	private String telefono;
	private int estrellas;
	private int numeroHabitaciones;
	private Vector<String> extras;
	private Vector<Habitacion>habitaciones;
	
	//Constructor de la clase
	public Hotel(String nombreHotel, String direccionHotel, String webHotel, String telefono,
				int estrellas, int numeroHabitaciones, Vector<String> extras, 
				Vector<Habitacion>habitaciones) {
		this.nombreHotel = nombreHotel;
		this.direccionHotel = direccionHotel;
		this.webHotel = webHotel;
		this.telefono = telefono;
		this.estrellas = estrellas;
		this.numeroHabitaciones = numeroHabitaciones;
		this.extras = new Vector<String>();
		this.habitaciones = habitaciones;
	}
	
	//metodo get de la clase
	public String getDatos() {
		String s = "";
		for(int i = 0; i<this.estrellas;i++) {
			s = s + "*";
		}
		return this.nombreHotel + "   " + s +" estrellas \n\n" + this.webHotel + "\n" + this.direccionHotel + 
			   "\n" + this.telefono + "\n" + this.numeroHabitaciones + " habitaciones libres.\n";
	}
	
	//metodo para obtener el precio total de la habitacion
	public int getPrecio(Habitacion c, int dias) {
		return c.getPrecio() * dias;	
	}
	
	public String getNombreHotel() {
		return nombreHotel;
	}

	public int getEstrellas() {
		return estrellas;
	}

	//Metodo para mostrar por pantalla el vector habitaciones
	public void habitacionesDisponibles() {
		System.out.println("Habitaciones disponibles: ");
		for(Habitacion h: habitaciones) {
				h.getDatos() ;
		}
		
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public Vector<Habitacion> getHabitaciones() {
		Vector<Habitacion> h = new Vector<Habitacion>();
		for(Habitacion i: this.habitaciones) {
			h.add(i);
		}
		return h;
	}
	
	public void getDatosHabitacion() {
		for(Habitacion h : this.habitaciones) {
				h.getDatos();
				System.out.println(Integer.toString(h.getPrecio()) + "€ por noche.\n");
		}
	}
	
	//Metodo para filtrar las habitaciones de un hotel
	public Vector<Habitacion> findHabitacion() {
		
		Scanner sn = new Scanner(System.in);
		int op;
		Vector<Habitacion> result = new Vector<Habitacion>();
		for(Habitacion h: this.habitaciones) {
			result.add(h);
		}
		
		boolean salir = false;
		
		while(!salir) {
			
			System.out.println("1. Filtrar por personas");
			System.out.println("2. Filtrar por extras de la habitacion");
			System.out.println("3. Salir");
			op = sn.nextInt();
			
			switch(op){
			
			case 1:	
				System.out.println("¿Para cuantas personas es la habitacion? ");
				Scanner sn2 = new Scanner(System.in);
				int i;
				i = sn2.nextInt();
				for(Habitacion h: habitaciones) {
					if(h.getNumeroCamas() != i)
						result.removeElement(h);
					
				}
				System.out.println("Habitaciones para " + i + " personas:\n");
				for(Habitacion h: result) {
					h.getDatos();
				}
				break;
				
			case 2: 
				System.out.println("¿Como quieres la habitacion?");
				System.out.println("¿Con terraza?(S/n)");
				Scanner sn3 = new Scanner(System.in);
				String c;
				c = sn3.next();
				
					for(Habitacion h: habitaciones) {
						if(c.equals("S")) {
							if(!h.isTerraza())
								result.removeElement(h);
						}
						else if(c.equals("n")) {
							if(h.isTerraza())
								result.removeElement(h);
						}
						
					}
	
				System.out.println("¿Con jacuzzi?(S/n)");
				c = sn3.next();
				
				for(Habitacion h: habitaciones) {
					if(c.equals("S")) {
						if(!h.isJacuzzi())
							result.removeElement(h);
					}
					else if(c.equals("n")) {
						if(h.isJacuzzi())
							result.removeElement(h);
					}
				}
				
				for(Habitacion h: result) {
					h.getDatos();
				}
				break;
			
			case 3:
				salir = true;
				break;
				
			}
		}
		return result;
	}	

}
