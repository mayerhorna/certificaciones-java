package objectives.flow_control;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

enum Baraja {
	CORAZON, DIAMANTE, TREBOL, ESPADA
}

public class FlowControlTest {
	public static void main(String[] args) {
		boolean b = true;
		int x = 3;
		Boolean bW = new Boolean("true");
		if (false)
			;
		System.out.println("imprime");
		;
		;
		;

		// SWITCH
		System.out.println("switch:::");
		long l = 2L;
		char c = 'c';
		int i = 10;
		final int o = 3;
		Baraja enumB = Baraja.CORAZON;
		Integer inte = new Integer("99");
		switch (inte) {
		case o: {
			int p = 3;
			System.out.println("3");
			break;
		}
		case 5: {
			int p = 9;
			System.out.println("5");
			break;
		}
		default:
		case 7:
			System.out.println("7");
			break;
		}
		// loops
		System.out.println("loops::");
		System.out.println("for:");
		for (int j = 1; j <= 3; j++) {
			System.out.println("en for");
			// continue;
			// break;
			// System.exit(0);
		}
		// System.out.println(j);
		System.out.println("foreach:");
		String[] nombres = { "hugo", "paco", "luis" };
		ArrayList<String> nombres2 = new ArrayList<String>();
		nombres2.add("Paco");
		nombres2.add("Luis");
		for (String nombre : nombres2) {
			System.out.println(nombre);
		}

		System.out.println("labeled statements::");
		Integer i90 = 30;
		int i91 = new Integer("9");
		for1: for (int x1 = 0; x1 < 2; x1++) {
			System.out.println("x1");
			for2: for (int y1 = 0; y1 < 2; y1++) {
				System.out.println("y1");
				for3: for (int z1 = 0; z1 < 2; z1++) {
					System.out.println("z1");
					if (true) {
						break for1;
					}
				}

			}
		}

		System.out.println("excpetions::");
		try {
			Integer.parseInt("3asdfdsa");
		} catch (NumberFormatException ex) {
			System.out.println("no es un numero");
		}
		// int x8 = 9/0;
		crearFichero();

		ClienteDao clienteDao = new ClienteDao();
		// try{
		clienteDao.guardar();
		// }catch(RuntimeException ex){
		// System.out.println(ex);
		// }

		System.out.println("fin de main");

	}

	private static void crearFichero() {
		/*
		 * File fichero = new File("C:/ee.txt"); try { fichero.createNewFile(); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		if (true) {

		}

	}

	private static Boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}
}

class Cliente {
	private Long id;
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

class ClienteDaoJdbc {
	public void guardarCliente(Cliente cliente) {
		System.out.println("grabando cliente ");
		// cliente.setId(1L);
	}
}

class AssertionTest {
	public static void main(String[] args) {
		// Assertions
		System.out.println("Assertions:");

		ClienteDaoJdbc clienteDao = new ClienteDaoJdbc();
		Cliente cliente = new Cliente();
		cliente.setNombre("Maria");
		clienteDao.guardarCliente(cliente);
		// if(cliente.getId()==null){
		// System.out.println("error en el grabado");
		// }
		assert cliente.getId() != null : "Fallo guardarCliente, corrige tu codigo, nombre:"
				+ cliente.getNombre(); // cuando es false se produce un
										// AssertionError
		boolean bool = false;
		System.out.println("fin del programa");
	}
}

class AssertTest {
	private void methodA(int i) {
		boolean b = true;
		assert b = false : methodB();
		System.out.println(i);
	}

	private String methodB() {
		return "The value must not be negative";
	}

	public static void main(String[] args) {
		AssertTest test = new AssertTest();
		test.methodA(-10);
	}
}


