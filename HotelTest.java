package practica_1;

import java.util.Vector;

public class HotelTest {
		
	public static void main(String[] args) {
			
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
			
			Vector<Habitacion> v2 = new Vector<Habitacion>();
			v2.add(H4);
			v2.add(H5);
			v2.add(H6);
			v2.add(H7);
			v2.add(H8);
			
			Vector<Habitacion> v3 = new Vector<Habitacion>();
			v3.add(H1);
			v3.add(H2);
			v3.add(H4);
			v3.add(H5);
			v3.add(H7);
			
			Vector<Habitacion> v4 = new Vector<Habitacion>();
			v4.add(H3);
			v4.add(H5);
			v4.add(H7);
			
			
			Hotel h1 = new Hotel("Babilonia", "c/ Campo de las flores 27", "www.Babilonia.com",
								 "524854562", 3, 4,extras,v1);
			
			Hotel h2 = new Hotel("Zeus", "c/ Mirasierra 12", "www.Zeushotel.es",
					 "454841518", 5, 5, extras, v2);
			
			Hotel h3 = new Hotel("Rich", "c/ Paseo de los artilleros 17", "www.Rich.com",
					 "854212354", 5, 5, extras, v3);
			
			Hotel h4 = new Hotel("Belladona", "c/ Caliza 38", "www.Belladona.com",
					 "586224878", 4, 3, extras, v4);
			
			Vector<Hotel>hoteles = new Vector<Hotel>();
			hoteles.add(h1);
			hoteles.add(h2);
			hoteles.add(h3);
			hoteles.add(h4);
			
			for(Habitacion h: h1.findHabitacion()) {
				h.getDatos();
			}
			
			
			
	}
}
