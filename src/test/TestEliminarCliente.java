package test;

<<<<<<< HEAD
import dao.ClienteDao;
import datos.Cliente;

public class TestEliminarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDao dao = new ClienteDao();
		long id = 1;
		Cliente c = dao.traerCliente(id);
		dao.eliminar(c);
		
=======
import negocio.ClienteABM;
import org.hibernate.HibernateException;

public class TestEliminarCliente {

	public static void main(String[] args) throws HibernateException {
		ClienteABM abm = new ClienteABM();
		long id = 3;
		
		abm.eliminar(id);
		
		System.out.println("El cliente con el ID: " + id + " fue eliminado satisfactoriamente. Saludos!");
>>>>>>> 24f660ba5a1de797d65066505503b3f24002e99a
	}

}
