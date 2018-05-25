package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import datos.Cliente;
import dao.ClienteDao;

public class ClienteABM {
	
	ClienteDao dao = new ClienteDao();
	
	public Cliente traerCliente(long idCliente) throws Exception {
		Cliente c = dao.traerCliente(idCliente);
		if(c == null) throw new Exception("No existe un cliente con id: " + idCliente);
		return c;
	}
	
	public Cliente traerCliente(int dni) throws Exception {
		Cliente c = dao.traerCliente(dni);
		if(c == null) throw new Exception("No existe un cliente con dni: " + dni);
		return c;
	}
	
	public int agregar(String apellido, String nombre, int dni, GregorianCalendar fechaDeNacimiento) throws Exception {
		if(dao.traerCliente(dni) != null) throw new Exception("Ya existe un cliente con DNI: " + dni);
		Cliente c =  new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(c);
	}
	
	public void modificar(Cliente c) throws Exception {
		if(dao.traerCliente(c.getDni()) != null) throw new Exception("Ya existe un cliente con DNI: " + c.getDni());
		//if(dao.traerCliente(c.getIdCliente()) != null) throw new Exception("Ya existe un cliente con ID: " + c.getIdCliente());
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente) {
		Cliente c = dao.traerCliente(idCliente);
		dao.eliminar(c);
	}
	
	public List<Cliente> traerCliente(){
		return dao.traerCliente();
	}
	
	
}
