package practica_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class test {

	public static void main(String[] args) {
		
		String s = "Pista de padel";
		Vector<String>extras = new Vector<String>() ;
		extras.add(s);
		Habitacion H1 = new Habitacion(23, 5, true, true, false, false);
		Habitacion H2 = new Habitacion(79, 3, true, false, false, false);
		Habitacion H3 = new Habitacion(32, 2, false, true, false, false);
		Habitacion H4 = new Habitacion(67, 3, true, true, true, false);		
		Habitacion H5 = new Habitacion(82, 4, false, false, false, false);
		Habitacion H6 = new Habitacion(5, 3, true, true, true, true);
		Habitacion H7 = new Habitacion(11, 2, false, false, false, false);
		Habitacion H8 = new Habitacion(51, 4, true, true, true, true);
		
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
		
		Scanner sn = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int op;
        
        while (!salir) {
 
            System.out.println("1. Ver hoteles disponibles");
            System.out.println("2. Buscar hotel");
            System.out.println("3. Reservar hotel");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Hoteles:\n");
                        for(Hotel h : hoteles) {
                        	System.out.println(h.getDatos() + "\n\n\n");
                        }
                        break;
                    case 2:
                        System.out.println("Filtro de busqueda: \n");
                        System.out.println("1. Buscar por estrellas.");
                        System.out.println("2. Buscar por nombre.");
                        op = sn2.nextInt();
                        switch (op) {
	                        case 1:
	                        	System.out.println("Introduce el numero de estrellas: ");
	                        	
	                        	Scanner sn3 = new Scanner(System.in);
	                        	int estrellas;
	                        	estrellas = sn3.nextInt();
	                        	for(Hotel h: hoteles) {
	                        		if(estrellas == h.getEstrellas()) {
	                        			System.out.println(h.getDatos());
	                        		}
	                        	}
	                           	break;
	                        
		                    case 2: 
		                    	System.out.println("Introduce el nombre del hotel: ");
	                        	
	                        	Scanner sn4 = new Scanner(System.in);
	                        	String nombre;
	                        	nombre = sn4.next();
	                        	for(Hotel h: hoteles) {
	                        		if(nombre == h.getNombreHotel()) {
	                        			System.out.println(h.getDatos());
	                        		}
	                        	}
	                           	break;
                        }
                        break;
                    case 3:
                        System.out.println("En que hotel desea hacer la reserva: ");
                        System.out.println("Hoteles:\n");
                        int i = 1;
                        for(Hotel h : hoteles) {         	
                        	System.out.println(Integer.toString(i) + ". " + h.getDatos() + "\n\n\n");
                        	i++;
                        }	                      
                        op = sn2.nextInt();
                          switch (op) {
	                        case 1: 
	                        	System.out.println(h1.getDatos());
	                        	System.out.println(h1.getDatosHabitacion());
	                           	break;
	                        
		                    case 2: 
		                    	System.out.println(h2.getDatos());
	                        	System.out.println(h2.getDatosHabitacion());	
	                        	break;
                    	
				            case 3: 
				            	System.out.println(h3.getDatos());
	                        	System.out.println(h3.getDatosHabitacion());
	                        	break;
				            case 4: 
				            	System.out.println(h4.getDatos());
	                        	System.out.println(h4.getDatosHabitacion());
	                        	break;
	                        }
        			case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
				
}
