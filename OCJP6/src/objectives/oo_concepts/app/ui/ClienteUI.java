package objectives.oo_concepts.app.ui;

import objectives.oo_concepts.app.dao.ClienteDao;
import objectives.oo_concepts.app.model.Cliente;

public class ClienteUI{
	private ClienteDao clienteDao;
	public ClienteUI(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}
	
	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}
	public void grabar(Cliente c){
		clienteDao.grabar(c);
	}
}
