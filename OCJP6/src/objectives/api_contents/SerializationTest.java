package objectives.api_contents;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// caso 1
class Collar implements Serializable{
	String largo;	
	public Collar(String largo){
		this.largo = largo;
	}
} 

class Animal implements Serializable{
	String grupo = "grupo inicial";
	public Animal() {
		System.out.println("constructor Animal");
	}
} 
class T{
	private static final long serialVersionUID = 1L;
}
class Cat extends Animal {
	private static final long serialVersionUID = 1L;
	String nombre;
	transient String descripcion;
	transient int d;
	static String strStatic;
	Collar c;
	public Cat() {
		System.out.println("Cat");
	}
} // 1

class SerializeCat {
	public static void main(String[] args) {
		Cat c = new Cat(); // 2
		c.nombre = "Michifu";
		c.descripcion = "es un gato feo";
		c.d = 232;
		c.c = new Collar("30cm");
		c.grupo = "mamiferos";
		c.strStatic = "estatico";
		//serializacion
		/*
		try {
			FileOutputStream fs = new FileOutputStream("testSer.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c); // 3 //serializa
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		//deserealizacion
		try {
			c.grupo = "cambiado mamiferos";
			c.strStatic = "cambiado estatico";
			FileInputStream fis = new FileInputStream("testSer.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject(); // 4 deserealiza
			System.out.println("nombre: " + c.nombre);
			System.out.println("descripcion: " + c.descripcion);
			System.out.println("d: " + c.d);
			System.out.println("collar: " + c.c.largo);
			System.out.println("gato-grupo: " + c.grupo);
			System.out.println("gato-static: " + c.strStatic);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class SerializationTest {
	public static void main(String[] args) {

	}
}
