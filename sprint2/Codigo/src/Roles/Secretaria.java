package Roles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Cooperativa.Cooperativa;

public class Secretaria extends Rol {

	public Secretaria(String nombre) {
		super(nombre);
	}

	
	//ES UN MODELO; NO NOS MATES GUILLE gracias. 
	
	public void Menu(Cooperativa c) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		String reader = " ";
		try {
			reader = br.readLine();
		} catch (IOException e) {
			e.printStackTrace(); //No deberia hacer nada, si no le escriben un numero. 
		} 
		int x = Integer.parseInt(reader) ;  
		switch (x) {
			
		case 1 : c.menu(1) ;  
		case 2 : c.menu(2) ; 
		case 3 : 
		break ; 
		
		}
		
	}

}
