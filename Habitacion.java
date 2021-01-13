package practica_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Vector;

public class Habitacion {

		private int numeroHabitacion;
		private int numeroCamas;
		private boolean terraza;
		private boolean jacuzzi;
		private boolean suit;
		private LocalDate fechaEntrada;
		private Vector<String>diasReserva;
		
		
		public Habitacion(int numeroHabitacion, int numeroCamas, boolean terraza,
						  boolean jacuzzi, boolean suit) {
			this.numeroHabitacion = numeroHabitacion;
			this.numeroCamas = numeroCamas;
			this.terraza = terraza;
			this.jacuzzi = jacuzzi;
			this.suit = suit;

		}
		
		public Habitacion() {	
		}

		//metodo para introducir la fecha de entrada a la hora de reservar una habitacion
		public LocalDate setFechaEntrada() {
			System.out.println("Introduce el dia que desea reservar la Habitacion (dd/mm/yyyy): ");
			Scanner f = new Scanner(System.in);
			String fecha;
			fecha = f.next();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formato de la fecha
			LocalDate fechaCreada = LocalDate.parse(fecha, formato);
			
			if(fechaCreada.getDayOfYear()<LocalDate.now().getDayOfYear()) {
				System.out.println("Introduce una fecha valida");
				setFechaEntrada();
			}
			else 
				this.fechaEntrada = fechaCreada;
			
			return fechaEntrada;
			
		}
		
		//metodo para comprobar que la habitacion no esta reservada para cierta fecha
		//las fechas aparecen en un vector como dias del año,
		public void diasReservada() {
			boolean f = false;
			if(this.diasReserva == null) 
				this.diasReserva = new Vector<String>();
			
			int dias;
			dias = setFechaEntrada().getDayOfYear();
			
			System.out.println("Introduce el numero de dias que desea reservar la habitacion");
			Scanner n = new Scanner(System.in);
			int num;
			num = n.nextInt();

			for(String s: getDiasReserva()){
				if((Integer.parseInt(s)>=dias && Integer.parseInt(s)<=(dias+num))) {
					System.out.println("La fecha seleccionada ya ha sido reservada");
					f = true;
					break;
				}	
			}
			
			if(f)
				diasReservada();
			
			else {
				for(int i = 0;i<num;i++) {
					this.diasReserva.add(Integer.toString(dias));
					dias++;
				}
			}
		}
		
		public void printDiasReserva() {
			for(String s: this.diasReserva) {
				System.out.print(s + ", ");
			}
		}
		
		public Vector<String> getDiasReserva() {
			Vector<String> result = new Vector<String>();			
			for(String s: this.diasReserva) {
				result.add(s);
			}
			return result;
		}
		
		public LocalDate getFechaEntrada() {
			return fechaEntrada;
		}
		
		public boolean isTerraza() {
			return this.terraza;
		}

		public boolean isJacuzzi() {
			return this.jacuzzi;
		}

		public boolean isSuit() {
			return this.suit;
		}

		public int getNumeroHabitacion() {
			return this.numeroHabitacion;
		}

		//metodo para obtener el precio de la habitacion por dia
		public int getPrecio() {
			int precio = 0;
			for(int i = 0; i<numeroCamas; i++) {
				precio += 20; 
			}
			if(terraza) 
				precio += 10;
			if(jacuzzi) 
				precio += 15;
			precio += (suit)? 30 : 0;
			return precio;
		}
		
		//metodo get de la clase
		public void getDatos() {
			
			if(suit)
				System.out.println("Suit ");
			System.out.println("Habitacion " + Integer.toString(this.numeroHabitacion) + ".\n" 
			+ Integer.toString(this.numeroCamas) + "  Camas.");
			if(terraza) System.out.println("Con terraza");
			if(jacuzzi) System.out.println("Con jacuzzi");
			System.out.println();
		
		}

		public int getNumeroCamas() {
			return numeroCamas;
		}
}
