package practica_1;

public class Habitacion {

		private int numeroHabitacion;
		private int numeroCamas;
		private boolean terraza;
		private boolean jacuzzi;
		private boolean suit;
		private boolean reservada;
		
		public Habitacion(int numeroHabitacion, int numeroCamas, boolean terraza,
						  boolean jacuzzi, boolean suit, boolean reservada) {
			this.numeroHabitacion = numeroHabitacion;
			this.numeroCamas = numeroCamas;
			this.terraza = terraza;
			this.jacuzzi = jacuzzi;
			this.suit = suit;
			this.reservada = reservada;
		}
		
		public int getNumeroHabitacion() {
			return this.numeroHabitacion;
		}

		public boolean isReservada() {
			return true;
		}

		public int getPrecio() {
			int precio = 0;
			for(int i = 0; i<numeroCamas; i++) {
				precio += 20; 
			}
			if(terraza) 
				precio += 10;
			if(jacuzzi) 
				precio += 15;
			if(suit)
				precio += 30;
			return precio;
		}
		
		public String getDatos() {
			String s = "";
			if(suit)
				s += "Suit ";
			else
			s += "Habitacion ";
			s += Integer.toString(this.numeroHabitacion) + ".\n" + Integer.toString(this.numeroCamas) + "  Camas.\n";
			if(terraza) s+="Con terraza\n";
			if(jacuzzi) s+="Con jacuzzi\n";
			s+=Integer.toString(getPrecio()) + " por noche\n";
		
			return s;
			
		}
}
