package objectives.declarations_initialization_and_scoping;

public class PracticaDesarrolladaEnClase {
	public static void main(String[] args) {
	}
}

// Pregunta 24
class MyClass {
	static int x;

	public static void main(String[] args) {
		x = 5;
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		MyClass m3 = new MyClass();
		m1.x = 10;
		m2.x = 20;
		m3.x = 30;
		System.out.println(m1.x);
		System.out.println(m2.x);
		System.out.println(m3.x);
	}
}

// Pregunta 2:
class Test {
	public static void main(String[] args) {
		String s1 = new String("123");
		StringBuffer s2 = new StringBuffer("456");
		Integer i = add(s1, s2);
		System.out.println(i);
	}

	private static int add(Object... values) {
		int i = 0;
		for (Object s : values) {
			i += Integer.parseInt(s.toString());
		}
		return i;
	}
}

// Pregunta 4
class A {
	int x = 5;
}

class B extends A {
	int x = 6;
}

class CovariantTest {
	public A getObject() {
		return new A();
	}

	public static void main(String[] args) {
		CovariantTest c1 = new SubCovariantTest();
		System.out.println(c1.getObject().x);
	}
}

class SubCovariantTest extends CovariantTest {
	public B getObject() {
		return new B();
	}
}

// Pregunta 10
class Pregunta10 {
	public static void main(String[] args) {
		int[] myArray6[] = new int[2][];
	}
}

// ;pregunta 1
enum Operator {
	PLUSONE {
		int operate(int x) {
			return ++x;
		}
	},
	MINUSONE {
		int operate(int x) {
			return --x;
		}
	},
	ABS {
		int operate(int x) {
			return Math.abs(x);
		}

	};
	abstract int operate(int x);
}

class EnumTest1 {
	public static void main(String[] args) {
		int x = -10;
		for (Operator o : Operator.values()) {
			System.out.println(o + "of" + x + " = " + o.operate(x));
		}
	}
}

// pregunta 8

enum Fish {
	GOLDFISH, ANGELFISH, GUPPY;
}

class EnumTest2 {
	public static void main(String[] args) {
		Fish f = Fish.valueOf("GUPPY");
		if (f == Fish.GUPPY)
			System.out.println("Are equal");
		if (f.equals(Fish.GUPPY))
			System.out.println("Are equal");
	}
}

// Pregunta 5
class Test5 {
	public abstract class InnerTest {
		abstract void f();
	}

	public static void main(String[] args) {
		Test5 t = new Test5();
		Test5.InnerTest test = t.new InnerTest() {
			public void f() {
				System.out.println("Inner f");
			}
		};
		test.f();
	}
}

// Pregunta 6
class TestInner {
	private static int i = 10;

	private static void f() {
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

// Pregunta 13
class MyOuter {
	private class MyInner {
		private float f() {
			return 1.3f;
		}
	}

	MyInner getInner() {
		return new MyInner();
	}

	float getValue() {
		return getInner().f();
	}
}

class Test13 {
	public static void main(String[] args) {
		MyOuter outer = new MyOuter();
		System.out.println(outer.getValue());
	}
}

// pregunta 15
class Test15 {
	void f() {
		System.out.println("Outer");
	}

	public class InnerTest {
		InnerTest() {
			System.out.println("Inner constructor");
		}

		void f() {
			System.out.println("Inner f");
		}
	}

	public static void main(String[] args) {
		final Test15 t = new Test15();
		Test15.InnerTest test = t.new InnerTest() {
			public void f() {
				t.f();
				System.out.println("Sub Inner f");
			}
		};
		test.f();
	}
}
