package test;

import java.util.ArrayList;
import java.util.List;
import dao.ClienteDao;
import datos.Cliente;

public class TestTraerTodosLosCLientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDao dao = new ClienteDao();
		List<Cliente> lstCliente = new ArrayList<Cliente>();
		lstCliente = dao.traerCliente();
		for(Cliente c : lstCliente) {
			System.out.println("DNI: " + c.getDni() + " Apellido: " + c.getApellido() + " Nombre: " + c.getNombre());
		}
	}

}
