package objectives.oo_concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

interface IPersona {
	public void caminar();
}

class Persona implements IPersona {
	public void caminar() {
		System.out.println("caminando");
	}
}

class Cliente extends Persona {
	public void cobrar() {
		System.out.println("cobrando");
	}

	public String toString() {
		return "cliente..";
	}
}

public class OOConcepts {
	public static void main(String[] args) {
		IPersona o = new Cliente();
		o.caminar();
		String toString = o.toString();
		System.out.println(toString);
	}
}

// Sobreescritura
class Empresa {
	Integer obtenerRuc(Object str, Integer i) throws ArithmeticException {
		System.out.println("obteniendo ruc de empresa");
		return 3;
	}
}

class SubEmpresa extends Empresa {
	public void obtenerRuc(Long cadena, Integer a) throws Exception {
		System.out.println("obteniendo ruc de empresa");
	}
}

class TestSobreescritura {
	public static void main(String[] args) {
		SubEmpresa sE = new SubEmpresa();

		// sE.ob
		// sE.obte
		int x = 9 / 0;
		Integer.parseInt("aaa");
		File f = new File("aa");
		try {
			f.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// Invocacion de metodos sobrecargados
class EasyOver {
	static void go(long x) {
		System.out.print("long ");
	}

	static void go(int x) {
		System.out.print("int ");
	}

	static void go(double x) {
		System.out.print("double ");
	}

	public static void main(String[] args) {
		byte b = 5;
		short s = 5;
		long l = 5;
		float f = 5.0f;
		go(b);// int
		go(s);// int
		go(l);// long
		go(f);// double
	}
}

class AddBoxing {
	static void go(Integer x) {
		System.out.println("Integer");
	}

	static void go(long x) {
		System.out.println("long");
	}

	public static void main(String[] args) {
		int i = 5;
		go(i); // which go() will be invoked?
	}
}

class AddVarargs {
	static void go(int x, int y) {
		System.out.println("int,int");
	}

	static void go(byte... x) {
		System.out.println("byte... ");
	}

	public static void main(String[] args) {
		byte b = 5;
		go(b, b); // which go() will be invoked?
	}
}

class BoxOrVararg {
	static void go(Byte x, Byte y) {
		System.out.println("Byte, Byte");
	}

	// primitivo>Wrapper>Var-Args
	static void go(byte... x) {
		System.out.println("byte... ");
	}

	public static void main(String[] args) {
		byte b = 5;
		go(b, b); // which go() will be invoked?
	}
}

//constructores
class SuperPais{
	public SuperPais(String id) {
		super();
	}
	public void obtenerid(){
		
	}
}
class Pais extends SuperPais{
	String nombre;
	Pais() {
		super("2");
		//super.obtoString();
		System.out.println("constructor pais");
		//super();
     	//	this("---"); //no pueden estar ambos (super() y this())
		//this.nombre = "---";
	}
	/*Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	Pais(String nombre, Long id) {
		super();
		this.nombre = nombre;
	}*/
	public void obtenerCodigoPais(){
		//this("---"); //Error
	}
}

class TestConstructores{
	public static void main(String[] args) {
		Pais p = new Pais();
		System.out.println(p.nombre);
		
	}
}

//Upcasting y DownCasting
class Animal{}
class Caballo extends Animal{
	public void saltar(){
		System.out.println("saltando");
	}
}
class UpCastingAndDownCasting{
	public static void main(String[] args) {
		Animal animal = (Animal)new Caballo();
		Animal animal2 = new Caballo();
		
		Animal animal3 = new Caballo();
		Caballo caballo = (Caballo)animal3;
		caballo.saltar();
		System.out.println("fin de main");
		//servlet:
		//request.setAttribute("user", new UserBean());
		//jsp:
		//UserBean userBean = (UserBean)request.getAttribute("user");
		//(List<User>)queryForObject("SELECT * FORM USER");
		
	}
}

