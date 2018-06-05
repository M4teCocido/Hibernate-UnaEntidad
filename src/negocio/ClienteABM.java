package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

import org.hibernate.HibernateException;

public class ClienteABM {

	ClienteDao dao = new ClienteDao();
	
	public Cliente traerCliente(long idCliente) throws HibernateException {
		Cliente c = dao.traerCliente(idCliente);
		if(c == null) throw new HibernateException ("No existe un cliente con ID: " + idCliente + ". Saludos!");
		return c;
	}
	
	public Cliente traerCliente(int dni) throws HibernateException {
		Cliente c = dao.traerCliente(dni);
		if(c == null) throw new HibernateException("No existe un cliente con DNI: " + dni + ". Saludos!");
		return c;
	}
	
	public int agregar(String apellido, String nombre, int dni, GregorianCalendar fechaDeNacimiento)throws HibernateException {
		if(dao.traerCliente(dni) != null) throw new HibernateException("El cliente con dni: " + dni + " ya esta ingresado.");
		Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(c);
	}
	
<<<<<<< HEAD
	public void modificar(Cliente c) throws Exception {
		Cliente cAux = dao.traerCliente(c.getDni());
		if(cAux != null && cAux.getIdCliente() != c.getIdCliente()) throw new Exception("Ya existe un cliente con DNI: " + c.getDni());
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente)throws Exception {
		Cliente c = dao.traerCliente(idCliente);
		if(c == null)throw new Exception("El cliente que quiere eliminar no existe. ID: " + idCliente);
=======
	public void modificar(Cliente c) throws HibernateException {
		if(dao.traerCliente(c.getDni()) != null) throw new HibernateException("Ya existe un cliente con el dni: " + c.getDni());
		//if(dao.traerCliente(c.getIdCliente()) != null) throw new HibernateException("Ya existe un cliente con el ID: " + c.getIdCliente());
		//implementar antes de actualizar que no exista un cliente con el mismo dni a modificar y con el mismo id, tirar he
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente) throws HibernateException{
		Cliente c = dao.traerCliente(idCliente);
		if(c == null) throw new HibernateException("El cliente con ID: " + idCliente + " no existe. Saludos!");
>>>>>>> 24f660ba5a1de797d65066505503b3f24002e99a
		dao.eliminar(c);
	}
	
	public List<Cliente> traerCliente(){
		return dao.traerCliente();
	}
	
}
