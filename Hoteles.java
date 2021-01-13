package practica_1;

import java.util.Scanner;
import java.util.Vector;


//Clase para guardar los distintos hoteles
public class Hoteles {

	private Vector<Hotel> hoteles;
	
	public Hoteles() {
	}
	
	//Metodo para mostrar por pantalla todos los hoteles
	public void mostrarHoteles() {
		for(Hotel h: hoteles) {
			System.out.println(h.getDatos());
		}
	}
	
	//Metodo para seleccionar un hotel
	public Hotel eligeHotel() {
		Scanner sn = new Scanner(System.in);
		int n;
		int i = 0;
		for(Hotel h: hoteles) {
			System.out.println(Integer.toString(i+1) +" " + h.getDatos());
			i++;
		}
		System.out.println("Introduce el numero del hotel que deseas reservar: ");
		
		n = sn.nextInt();
		return hoteles.elementAt(n-1);
	}
	
	//Metodo para añadir hoteles a la clase
	public void añadirHotel(Hotel c) {
		if(hoteles == null)
			hoteles = new Vector<Hotel>();
		this.hoteles.add(c);
	}
	
	//Metodo de filtro de busqueda de hoteles
	public Vector<Hotel> filtrar() {
	
		Vector<Hotel> result = new Vector<Hotel>();
		Scanner sn = new Scanner(System.in);
		int op;
		boolean salir = false;
		
	    
	    while(!salir) {
	    	System.out.println("Filtro de busqueda: \n");
		    System.out.println("1. Buscar por estrellas.");
		    System.out.println("2. Buscar por nombre.");
		    System.out.println("3. Salir");
		    op = sn.nextInt();
		    switch (op) {
		        case 1:
		        	System.out.println("Introduce el numero de estrellas: ");
		        	
		        	Scanner sn3 = new Scanner(System.in);
		        	int estrellas;
		        	estrellas = sn3.nextInt();
		        	for(Hotel h: hoteles) {
		        		if(estrellas == h.getEstrellas()) {
		        			result.add(h);
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
		        			result.add(h);
		        			System.out.println(h.getDatos());
		        		}
		        	}
		           	break;
		        
		        case 3:
		        	salir = true;
		        	break;
		       default:
		    	   System.out.println("Introduce una opcion correcta");
		    	   op = sn.nextInt();
		    }
	    }
	    return result;
	}
}
