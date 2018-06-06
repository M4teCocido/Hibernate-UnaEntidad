package test;

import dao.ClienteDao;
import datos.Cliente;

public class TestTraerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDao dao = new ClienteDao();
		long idCliente = 2;
		Cliente c = dao.traerCliente(idCliente);
		System.out.println(c.toString());
	}

}
