package objectives.fundamentals;

public class PracticaDesarrolladaEnClase {
	public static void main(String[] args) {

	}
}

// pregunta 9
class Test {
	int a; // 1
	int b; // 0

	public void f() {
		a = 0;
		b = 0;
		int[] c = { 0 }; // {1}
		g(b, c);
		System.out.println(a + "" + b + "" + c[0] + "");
	}

	public void g(int b, int[] c) {
		a = 1;
		b = 1;
		c[0] = 1;
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.f();

		System.gc();
		Runtime.getRuntime().gc();
	}
}

class Empleado {
	protected void finalize() throws Throwable {
		System.out.println("limpiando objeto");
	}
}

class GCTEsT {
	public static void main(String[] args) {
		Empleado p = new Empleado();
		p = null;
		System.gc();
	}
}

// pregunta 7
class SuperTest {
	protected void finalize() {
		System.out.println("Super test");
	}
}

class Test7 extends SuperTest {
	String s = "abc";

	public static void main(String[] args) {
		Test7 t = new Test7();// 2
		t.finalize();
		System.out.println(t);
		t.finalize();
	}
}
