package objectives.oo_concepts.app.dao;

import objectives.oo_concepts.app.model.Cliente;

public class ClienteDaoHibernate implements ClienteDao{
	public void grabar(Cliente c){
		System.out.println("grabando cliente x Hibernate");
		//Prepar
		System.out.println(Thread.currentThread().getName());
	}
}
