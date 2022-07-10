package objectives.practicas;

public class Practica1Desarrollo {
	public static void main(String[] args) {
	}
}

// Pregunta 6
class Test {
	public class InnerTest {
		void f() {
			System.out.println("Inner super");
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		Test.InnerTest test = t.new InnerTest();
		test.f();
	}
}

// pregunta 7
class TestInner {
	private static int i = 10;

	private void f() {
		System.out.println(i);
	}

	TestInner() {
		System.out.print("Outer");
	}

	static class MyInner {
		MyInner() {
			System.out.print("Inner");
		}

		void g() {
			f();
		}
	}

	public static void main(String[] args) {
		new TestInner.MyInner();
	}
}

// pregunta 10
class A {
}

class B extends A {
}

class C extends A {
}

class Test10 {
	public static void main(String[] args) {
		B y = new B();
		A x = new A();
		C z = new C();
		y = (B) x;
	}
}

// pregunta 11
class Base {
	void aMethod(int iBase) {
		System.out.println("Base");
	}
}

class Over extends Base {
	public static void main(String[] argv) {
		Base o = new Over();
		int iBase = 0;
		o.aMethod(iBase);
	}

	protected void aMethod(int iOver) {
		System.out.println("Over");
	}
}

// pregunta 12
class A12 {
	A12() {
		System.out.print("A");
	}
}

class B12 extends A12 {
	B12() {
		// super();
		this(4); // delega la responsabilidad de crear el objeto a otro
		// constructor
		System.out.print("B");
	}

	B12(int i) {
		System.out.print("C");
	}
}

class C12 {
	public static void main(String[] args) {
		B12 b = new B12();
	}
}

// pregunta 13
class A13 {
	static void f() {
		System.out.print("Inside A");
	}
}

class B13 extends A13 {
	static void f() {
		System.out.print("Inside B");
	}
}

class C13 extends B13 {
	static void f() {
		System.out.print("Inside C");
	}
}

class D13 {
	public static void main(String[] args) {
		C13 c = new C13();
		c.f();
		B13 b = c;
		b.f();
		A13 a = (B13) c;
		a.f();

	}
}

// pregunta 15
class A15 {
	A15(int j) {
		super();
		System.out.print("A");
	}
}

class B15 extends A15 {
	B15() {
		super(4);
		System.out.print("B");
	}

	B15(int i) {
		super();
		System.out.print("C");
	}
}

class C15 {
	C15() {
		super();
	}

	public static void main(String[] a) {
		B15 b = new B15();
	}
}
