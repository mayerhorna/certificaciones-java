package objectives.concurrency;

import objectives.oo_concepts.app.dao.ClienteDaoHibernate;
import objectives.oo_concepts.app.model.Cliente;

//formas de crear hilos
//1era Forma: Extendiendo de Thread
class EnviarEmail extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

// 2 forma: Implementando Runnable
class RecibirEmail implements Runnable {
	public void run() {
		ejecutar();
	}

	private void ejecutar() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class ConcurrencyTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		EnviarEmail enviarEmail = new EnviarEmail();
		enviarEmail.setName("EnviarEmail");
		enviarEmail.start();
		ClienteDaoHibernate clienteDaoHibernate = new ClienteDaoHibernate();
		clienteDaoHibernate.grabar(new Cliente());
		RecibirEmail recibirEmail = new RecibirEmail();
		Thread threadRecibirEmail = new Thread(recibirEmail, "RecibirEmail");
		Thread threadRecibirEmail2 = new Thread(recibirEmail, "RecibirEmail2");
		Thread threadRecibirEmail3 = new Thread(recibirEmail, "RecibirEmail3");
		threadRecibirEmail.start();
		threadRecibirEmail2.start();
		threadRecibirEmail3.start();
		// 3 forma: De forma anomia
		Thread t1 = new Thread("Hilo Anonimo") {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		t1.start();
		Runnable t = new Runnable() {
			public void run() {
				System.out.println("en runnable::");
				System.out.println(Thread.currentThread().getName());
			}
		};
		t.run();

	}
}

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 100; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
			if ("Fred".equals(Thread.currentThread().getName())) {
				Thread.yield();
				/*
				 * try { Thread.sleep(5000); } catch (InterruptedException e) {
				 * e.printStackTrace(); }
				 */
			}
		}
	}
}

class ManyNames {
	public static void main(String[] args) {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.setPriority(Thread.MAX_PRIORITY);
		two.setPriority(Thread.NORM_PRIORITY);
		three.setPriority(Thread.MIN_PRIORITY);
		two.start();
		three.start();
		one.start();

	}
}

class CargarDatos extends Thread {
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println("en CargarDatos");
		}
	}

}

class JoinTest {
	public static void main(String[] args) {
		System.out.println("en main");
		CargarDatos cargarDatos = new CargarDatos();
		cargarDatos.start();

		try {
			cargarDatos.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("en main");
	}
}

class CalcularTotal implements Runnable {
	public void run() {
		synchronized ("") {
			try {
				System.out.print(Thread.currentThread().getName());
				Thread.sleep(500); // logica de negocio del cálculo.
				System.out.print(Thread.currentThread().getName());
			}// AA BB BB AA
			catch (InterruptedException e) {
			}
		}
	}
	public static void main(String[] args) {
		CalcularTotal cT1 = new CalcularTotal();
		CalcularTotal cT2 = new CalcularTotal();
		new Thread(cT1, "A").start(); // Proceso A
		new Thread(cT2, "B").start(); // Proceso B
	}
}
