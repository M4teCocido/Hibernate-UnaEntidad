package test;

import dao.ClienteDao;
import datos.Cliente;

public class TestEliminarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDao dao = new ClienteDao();
		long id = 1;
		Cliente c = dao.traerCliente(id);
		dao.eliminar(c);
		
	}

}
