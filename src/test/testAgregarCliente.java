package test;

import java.util.GregorianCalendar;
import negocio.ClienteABM;

public class testAgregarCliente {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String apellido = "Rincon";
		String nombre = "Mariela";
		int documento = 33295950;
		GregorianCalendar fechaDeNacimiento = new GregorianCalendar(1987, 11, 18);
		ClienteABM abm = new ClienteABM();
		long ultimoCliente = abm.agregar(apellido, nombre, documento, fechaDeNacimiento);
		
		System.out.println("Cliente dado de alta con id: " + ultimoCliente);
	}

}
