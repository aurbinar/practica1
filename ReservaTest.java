package practica_1;

import java.util.Vector;

public class ReservaTest {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Alberto", "Urbina", "51703479P");
		
		String s = "Pista de padel";
		Vector<String>extras = new Vector<String>() ;
		extras.add(s);
		Habitacion H1 = new Habitacion(23, 5, true, true, false);
		Habitacion H2 = new Habitacion(79, 3, true, false, false);
		Habitacion H3 = new Habitacion(32, 2, false, true, false);
		Habitacion H4 = new Habitacion(67, 3, true, true, true);		
		Habitacion H5 = new Habitacion(82, 4, false, false, false);
		Habitacion H6 = new Habitacion(5, 3, true, true, true);
		Habitacion H7 = new Habitacion(11, 2, false, false, false);
		Habitacion H8 = new Habitacion(51, 4, true, true, true);
		
		Vector<Habitacion> v1 = new Vector<Habitacion>();
		v1.add(H1);
		v1.add(H2);
		v1.add(H3);
		v1.add(H6);
		
		Hotel h1 = new Hotel("Babilonia", "c/ Campo de las flores 27", "www.Babilonia.com",
				 "524854562", 3, 4,extras,v1);
		
		Usuario u = new Usuario();
		u.registro();
		
		Reserva r = new Reserva(h1,u);
		r.reservaHabitacion().getDatos();
	}

}
