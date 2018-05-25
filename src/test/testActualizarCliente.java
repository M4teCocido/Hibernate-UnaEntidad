package test;

import negocio.ClienteABM;
import datos.Cliente;

public class testActualizarCliente {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClienteABM abm = new ClienteABM();
		
		long id = 1;
		
		Cliente c = abm.traerCliente(id);
		System.out.println("Cliente 'c' a modificar ----> " + c);
		c.setDni(31026186);
		abm.modificar(c);
		Cliente cModif = abm.traerCliente(31026186);
		
		System.out.println("Cliente 'c' modificado ----> " + cModif);
	}

}
