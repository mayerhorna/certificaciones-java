package objectives.oo_concepts.app;

import objectives.oo_concepts.app.dao.ClienteDaoHibernate;
import objectives.oo_concepts.app.model.Cliente;
import objectives.oo_concepts.app.ui.ClienteUI;

public class Main {
	public static void main(String[] args) {
		ClienteUI clienteUI = new ClienteUI(new ClienteDaoHibernate());
		//clienteUI.setClienteDao(new ClienteDaoHibernate());
		Cliente c = new Cliente();
		c.setNombre("J PEREz" );
		clienteUI.grabar(c);
	}
}
