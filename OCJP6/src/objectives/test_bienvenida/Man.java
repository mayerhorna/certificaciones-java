package objectives.test_bienvenida;

public class Man {
	String nombre;
	public static void main(String[] args) {
		Man p = null;
		p.run();
	}

	public void run() {
		System.out.print("running…");
	}
}

// Pregunta 2
class Pass {
	public static void main(String[] args) {
		int x = 5;
		Pass p = new Pass();
		p.doStuff(x);
		System.out.print(" main x = " + x);
	}

	void doStuff(int x) {
		System.out.print(" doStuff x = " + x++);
	}
}

// {Pregunta 3
class TestKing1 {
	public TestKing1() {
		System.out.print(1);
	}
}

class TestKing2 extends TestKing1 {
	public TestKing2() {
		super();
		System.out.print(2);
	}
}

class TestKing3 extends TestKing2 {
	public TestKing3() {
		super();
		System.out.print(3);
	}
}

class Numbers {
	public static void main(String[] args) {
		new TestKing3();
	}
}

// pregunta 4
class ClasePadre {
	ClasePadre() {
		super();
		System.out.println("inicio clase padre"); // 3 //7
	}
}

class InitMembersOfClass extends ClasePadre {

	InitMembersOfClass(int x) {
		System.out.println("1-arg const"); // 10
	}

	InitMembersOfClass() {
		super();
		System.out.println("no-arg const"); // 6
	}

	static { // 1
		System.out.println("1st static init");
	}

	{ // 4 //8
		System.out.println("1st instance init");
	}

	{ // 5 //9
		System.out.println("2nd instance init");
	}

	static { // 2
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		new InitMembersOfClass();
		new InitMembersOfClass(7);
	}
}

//pregunta 5
class Pass5 {	
	public int x;
	public static void main(String [] args){
		x  = 5;
		Pass5 p = new Pass5();
		p.doStuff(x);
		System.out.print(" main x = " + x );
}
void doStuff(int x){
	System.out.print(" doStuff x = " + x++);
}
}
