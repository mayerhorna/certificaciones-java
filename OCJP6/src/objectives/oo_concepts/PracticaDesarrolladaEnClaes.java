package objectives.oo_concepts;

public class PracticaDesarrolladaEnClaes {
	public static void main(String[] args) {

	}
}

// Pregunta 24
class Mammal {
	String name = " furry  ";

	String makeNoise() {
		return " generic noise ";
	}
}

class Zebra extends Mammal {
	String name = " stripes";

	String makeNoise() {
		return "  bray ";
	}
}

class ZooKeeper {
	public static void main(String[] args) {
		new ZooKeeper().go();
	}

	void go() {
		Mammal m = new Zebra();
		System.out.println(((Zebra) m).name + m.makeNoise());
	}
}

// Pregunta 13
interface I {
	int i = 0;
}

class A implements I {
	int i = I.i + 1;
}

class B extends A {
	int i = I.i + 2;

	static void printAll(A obj) {
		System.out.print(obj.i);
	}

	public static void main(String[] args) {
		B b = new B();
		A a = new B();
		I i = new B();
		printAll(b);
		printAll(a);
		printAll(i);
	}
}

// Pregunta 6
class Base {
	private void aMethod(int iBase) {
		System.out.println("Base");
	}
}

class Over extends Base {
	public static void main(String[] argv) {
		Base o = new Over();
		int iBase = 0;
		o.aMethod(iBase);
	}

	public void aMethod(int iOver) {
		System.out.println("Over");
	}
}

// Pregunta 8
class A8 {
	Integer print() {
		System.out.println("A");
		return 0;
	}
}

class B8 extends A8 {
	int print() {
		super.print();
		System.out.println("B");
		return 0;
	}

	public static void main(String[] args) {
		A obj = new B();
		obj.print();
	}
}

// Pregunta 19
class Clidder {
	private final void flipper() {
		System.out.println("clidder");
	}
}

class Clidlet extends Clidder {
	public final void flipper() {
		System.out.println("clidlet");
	}

	public static void main(String[] args) {
		new Clidlet().flipper();
	}
}

// pregunta 15
class Parent {
	static void get1() {
		System.out.print("Parent get1");
	}

	void get2() {
		System.out.print("Parent get2");
	}

	public void get() {
		get1();
		get2();
	}
}

class Child15 extends Parent {
	static void get1() {
		System.out.print("Child get1");
	}

	void get2() {
		System.out.print("Child get2");
	}

	public static void main(String[] args) {
		(new Child15()).get();
	}
}

// pregunta 23
class Alpha {
	static String s = "  ";

	protected Alpha() {
		s += "  alpha  ";
	}
}

class SubAlpha extends Alpha {
	private SubAlpha() {
		s += "  sub ";
	}
}

class SubSubAlpha extends Alpha {
	private SubSubAlpha() {
		s += " subsub ";
	}

	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}

// pregunta 25
class SuperTest {
	SuperTest() {
	}

	int f() {
		return 0;
	}
}

class Test extends SuperTest {
	int i;

	int f() {
		return i;
	}

	Test(int i) {
		super();
		this.i = i;
	}

	public static void main(String[] args) {
		SuperTest t = new Test(5);
		System.out.println(t.f());
	}
}

// pregunta 26

class SuperTest26 {
	int f() {
		return 0;
	}
}

class Test26 extends SuperTest26 {
	int i;

	protected int f() {
		return i;
	}

	Test26(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		SuperTest26 t = new Test26(5);
		System.out.println(t.f());
	}
}

// Pregunta 2
interface Inter2 {
}

class Base2 implements Inter2 {
}

class Derived2 extends Base2 {
}

class Test2 {
	public static void main(String[] args) {
		Base2 b = new Derived2();
		Derived2 d = new Derived2();
		Inter2 i = (Base2) b;// 1
		i = (Base2) d;// 2
		Derived2 bd = (Derived2) b;// 3
		b = (Base2) i;// 4
		System.out.println("fin de main");
	}
}

// pregunta 5
class A5 {
}

class B5 extends A5 {
}

class C5 extends A5 {
}

class Test5 {
	public static void main(String[] args) {
		A5 x = new B5();
		B5 y = new B5();
		C5 z = new C5();
		// insert code
		y = (B5)x;   
	}
}

//pregunta 17
class X { void do1 () {   }   }
class Y extends X { void do2 () {   }    }
class Chrome {
       public static void main ( String [  ] args ) {
                X    x1  =  new  X ();
                X    x2  =  new  Y ();
                Y    y1  =  new  Y ();
                ( (Y)x2 ).do2() ;
                System.out.println("fin de main");
                
                boolean String = true;
}     }
