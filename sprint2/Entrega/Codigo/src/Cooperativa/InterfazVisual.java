package Cooperativa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Roles.Secretaria;

public class InterfazVisual {

	public static String ingresarDato() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String aux = " ";
		try {
			aux = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return aux;
	}

	public static void agregarCartonero(Cooperativa c) {
		System.out.println("Ingrese el nombre: ");
		String nombre = ingresarDato();
		System.out.println("Ingrese el apellido: ");
		String apellido = ingresarDato();
		System.out.println("Ingrese la direccion: ");
		String direccion = ingresarDato();
		System.out.println("Ingrese el dni: ");
		String dni = ingresarDato();
		System.out.println("Ingrese la capacidad de transporte: ");
		String ct = ingresarDato();
		int capacidadTransporte = Integer.parseInt(ct);
		c.agregarCartonero(nombre, apellido, direccion, dni, capacidadTransporte);

	}

	public static void eliminarCartonero(Cooperativa cooperativa) {
		String dni = ingresarDato();
		cooperativa.eliminarCartonero(dni);
	}

	public static void agregarMaterial(Cooperativa c) {
		System.out.println("Ingrese el nombre: ");
		String nombre = ingresarDato() ; 
		System.out.println("Ingrese el descripcion: ");
		String descripcion = ingresarDato() ; 
		System.out.println("Ingrese el Cantidad: ");
		String cantidad = ingresarDato();
		int cant = Integer.parseInt(cantidad);
		c.agregarMaterial(new Material(nombre, descripcion), cant);
	}

	public static void borrarMaterial(Cooperativa c) {
		String nombre = ingresarDato() ; 
		String descripcion = ingresarDato() ;
		c.borrarMaterial(new Material(nombre, descripcion));
	}

	public static void main(String[] args) {
		Cooperativa c = new Cooperativa();
		Secretaria s = new Secretaria("Maria") ; 
		s.menu(c);

	}

}
