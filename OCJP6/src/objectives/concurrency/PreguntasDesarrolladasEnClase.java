package objectives.concurrency;

public class PreguntasDesarrolladasEnClase {
	public static void main(String[] args) {
	}
}

// Pregunga 3
class MyThread extends Thread {
	public void run() {
		m1();
	}

	MyThread(String threadName) {
		super(threadName);
	}

	public synchronized void m1() {
		System.out.print(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		b.start();
		a.run();
	}
}

// pregunta 5
class Test implements Runnable {
	public void run() {
		String str = "hello";
		synchronized (str) {
			try {
				System.out.print(Thread.currentThread().getName());
				Thread.sleep(500);
				System.out.print(Thread.currentThread().getName());
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		new Thread(new Test(), "A").start();
		new Thread(new Test(), "B").start();
	}
}

// pregunta 6
class TestThread extends Thread {
	private int I;
	static String s = new String("hi");

	TestThread(String s) {
		super(s);
	}

	public String getObj() {
		return s;
	}

	public void run() {
		try {
			synchronized (this.getObj()) {
				System.out.print(Thread.currentThread().getName());
				Thread.sleep(500);
				System.out.print(Thread.currentThread().getName());
			}

		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		TestThread t1 = new TestThread("A");
		TestThread t2 = new TestThread("B");
		t1.start();
		t2.start();
	}
}

// Pregunta 10
class TestThread10 extends Thread {
	static String s = new String("hi");

	public void run() {
		try {
			synchronized (s) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		TestThread10 t1 = new TestThread10("A");
		TestThread10 t2 = new TestThread10("B");
		t1.start();
		t2.start();
	}
}

// wait and notity
class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.start();
				b.wait(); // libera monitor
				System.out.println(".................");
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			this.notify();
		}
	}
}

// notifyAll
class Reader extends Thread {
	Calculator c;

	public Reader(Calculator calc) {
		c = calc;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting for calculation...");
				c.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + c.total);
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		calculator.start();
	}
}

class Calculator extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll(); // Usar notifyAll( ) Cuando muchos Threads pueden
			// estar esperando.
		}
	}
}

class ThreadO {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b = new ThreadB();
				b.wait(); // libera monitor
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + b.total);
		}
	}
}

// Pregunta 2
class MyThread2 extends Thread // Thread-0
{
	String sa;

	public MyThread2(String sa) {
		this.sa = sa;
	}

	public void run() {
		synchronized (sa) {
			while (!sa.equals("Done")) {
				try {
					sa.wait();
				} catch (InterruptedException ie) {
				}
			}
		}
		System.out.print(sa);
	}
}

class Pregunta2 {
	private static String sa = new String("Not Done"); // Main

	public static void main(String[] args) {
		Thread t1 = new MyThread(sa);
		t1.start();
		synchronized (sa) {
			sa = new String("Done");
			sa.notify();
		}

	}
}

// Pregunta 9
class TestThread9 extends Thread {
	public void restart() {
		startMe();
	}

	public void startMe() {
		synchronized (this) { // main
			this.notifyAll();
			System.out.println("Trying to notify");
		}
	}

	public void run() {
		try {
			synchronized (this) { // TestThread
				this.wait();
				System.out.println("Notified");
			}
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		TestThread9 t1 = new TestThread9();
		t1.start();
		t1.restart();
	}
}
