package objectives.declarations_initialization_and_scoping;
import static java.lang.Math.*;
import java.io.Serializable;
import java.text.MessageFormat;

import javax.swing.JButton;

import objectives.declarations_initialization_and_scoping.MensajeEmail.ValidarMensajeEmail;

class Persona implements Serializable {
	private String name;
	private boolean active;

	Persona() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}

abstract class Ente implements Caminando {
	private String v;

	public Ente() {
		v = "ente";
	}

	public void caminar() {
		System.out.println("caminando: " + v);
	}

	public abstract void corriendo();

	public void cobrando() {
		System.out.println("cobrando como padre");
	};

	public void saltando() {
		System.out.println("saltando");
	}
}

interface Caminando {
	String URL = "http:///....";

	void saltando();
}

class Person extends Ente {
	public void corriendo() {
		System.out.println("corriendo como Persona");
	}

	public void saltando() {
		System.out.println("saltando");
	}
}

class Customer extends Ente {
	public void corriendo() {
		System.out.println("corriendo como Cliente");
	}

	public void cobrando() {
		System.out.println("corriendo como Cliente");
	}

}

public class DeclarationInitilizationAnScopingTest {
	public static void main(String[] args) {
		Caminando p = new Customer();
		p.saltando();
	}
}

// Covariante:
class Mensaje {
	String defaultMsg = "Hola";
}

class SubMensaje extends Mensaje {
	String defaultMsg = "Sub Hola";
}

class PruebaMensaje {
	public native String concatenar();

	public static void main(String[] args) {
		PruebaMensaje pM = new PruebaMensaje();
		String c = pM.concatenar();
		// Mensaje m = (Mensaje)mensaje;
		// System.out.println(msg.defaultMsg);
		// System.loadLibrary("md.dll");
		// byte b = 128;
	}
}

// Shadowing
class Share {
	String url;

	public Share() {
	}

	public Share(String url) {
		this.url = url;
	}
}

class PruebaShadowing {
	public static void main(String[] args) {
		Share share = new Share("3e");
		System.out.println(share.url);
	}
}

// Arrays
class ArrayTest {
	public static void main(String[] args) {
		int arreglo[] = new int[3];
		int[] arreglo2 = new int[3];
		Object[] objetos = new Object[3];
		int arreglo3[] = new int[] { 3, 4, 6, 7, 8 };
		int arreglo4[] = { 3, 4, 6, 7, 8 };
		String config[] = new String[] { "aa.xml", "dao.xml" };
		String config2[] = { "aa.xml", "dao.xml" };

		int arreglo3D[][][] = new int[3][2][2];
		int arreglo3D_V2[][][] = { { { 1, 2 }, { 4, 5 } }, {} };

		System.out.println(arreglo3D_V2[0][1][1]);
	}
}

// VAR-ARGS:
class VarArgsTest {
	public static void main(String[] args) {
		int[] numeros = { 5, 5 };
		double sumarTodo = sumar(4, numeros);
		System.out.println(sumarTodo);
		String mensaje = MessageFormat.format("Hola {0} {1} que tal", 8,
				"Perez");
		System.out.println(mensaje);
	}

	public static double sumar(int o, int... x) {
		double suma = 0.0;
		for (double d : x) {
			suma += d;
		}
		return suma;
	}
}

// Ambito de las variables:
class ScopeTest {
	public static void main(String[] args) {

		if (true) {
			if (true) {
				String mensaje = "hola";
				System.out.println(mensaje);
			}
		}
	}
}

// ENUMS:
enum Numeros {
	CERO, UNO, DOS, TRES
};

enum ReportType {
	BARRAS, PIE, DISPERSION
};

class TestEnum {
	public static void main(String[] args) {
		Numeros numero = Numeros.TRES;
		generarReporte(ReportType.BARRAS);
		System.out.println(numero);
	}

	public static void generarReporte(ReportType rp) {
		switch (rp) {
		case BARRAS:
		case DISPERSION:
		case PIE:
		}
	}
}

enum TamanioCafe {
	GRANDE(10){
		public String obtenerCalidad() {
			return "A";
		}
	}, MEDIANO(8, 3){
		public String obtenerCalidad() {
			return "B";
		}
	}, CHICO(5){
		public String obtenerCalidad() {
			return "C";
		}
	};
	private int onzas;
	
	TamanioCafe(int onzas) {
		this.onzas = onzas;
	}
	TamanioCafe(int onzas, int s) {
		this.onzas = onzas;
	}
	public abstract String obtenerCalidad();
	public int getOnzas() {
		return this.onzas;
	}
	/*
	 * public String obtenerCalidad(){ return "A"; }
	 */
}

class Cafe {
	TamanioCafe tc;
	public static void main(String... args) {
		Cafe c1 = new Cafe();
		Cafe c2 = new Cafe();
		c1.tc = TamanioCafe.GRANDE;
		c2.tc = TamanioCafe.CHICO;
		System.out.println("Tamaño de café 1(c1): " + c1.tc);
		System.out.println("Tamaño de café 2(c2): " + c2.tc);
		System.out.println("Onzas 1(c1): " + c1.tc.obtenerCalidad());
		System.out.println("Onzas 2(c2): " + c2.tc.obtenerCalidad());
		
		for(TamanioCafe c : TamanioCafe.values()){
			System.out.println(c + " = " + c.getOnzas());
			}
	}
}

// Clase interna (pendiente)
class MensajeEmail{
	private String formato= "@@";
	// REgular inner class
	class ValidarMensajeEmail{
		private String formato= "##";
		public void imprimirMensaje(){
			System.out.println("mensaje..." + MensajeEmail.this.formato);
		}
	}
	// Local Method Inner Class
	public void validandoFormato(){
		final int x = 2;
		class ValidadorFormato{
			public void mostrar(){
				System.out.println(x);
			}
		}

		ValidadorFormato vF = new ValidadorFormato();
		vF.mostrar();
	}
	
	// nested inner class
	static class VerificarBuzonEntrada{
		private String formato= "##";
		public void imprimirMensaje(){
			// System.out.println("mensaje..." + MensajeEmail.this.formato);
			System.out.println("..VerificarBuzonEntrada.." );
		}
	}
}

interface Corriendo{
	public void run();
}

class PruebaInnerClasses{
	public static void main(String[] args) {
		MensajeEmail mE = new MensajeEmail();
		ValidarMensajeEmail vME = mE.new ValidarMensajeEmail();
	// vME.imprimirMensaje();
		// mE.validandoFormato();
		
		MensajeEmail.VerificarBuzonEntrada vBE 
						= new MensajeEmail.VerificarBuzonEntrada();
		vBE.imprimirMensaje();
	}
}

// Annonymous Inner Class
class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
	
	public void pop2() {
		System.out.println("popcorn");
	}
}
class Food {
	Popcorn p = new Popcorn(){		
		public void pop() {
			System.out.println("popcorn");
			metodoNuevo();
		}
		private void metodoNuevo(){
			
		}
	};
}

class TestFood{
	public static void main(String[] args) {
		Food f = new Food();
		f.p.pop();
	}
}

class Formulario{
	public void mostrarForm(){
		JButton button = new JButton("Guardar");
		
		
	}
}



