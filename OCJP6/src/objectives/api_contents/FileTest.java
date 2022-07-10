package objectives.api_contents;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest {
	public static void main(String[] args) throws IOException {
		Console consola = System.console();
		String usuario = consola.readLine("Usuario: ");
		PrintWriter out = consola.writer();
		out.println("Adios");
		// File file = new File("C:/mensaje2.txt"); //ruta absoluta
		// ClassLoader.getSystemClassLoader().
		// Thread.currentThread().getContextClassLoader().getResource("com/limati");
		File file = new File("mensaje2.txt"); // ruta absoluta
		File carpeta = new File("carpeta1/scarpeta2/s4");
		if (!file.exists()) {
			boolean creo = file.createNewFile();
			System.out.println("creo fichero?: " + creo);
		}
		carpeta.mkdirs();
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		File[] ficheros = carpeta.listFiles();
		for (File fichero : ficheros) {
			System.out.println(fichero.getName());
		}
	}
}

class FileWriterTest {
	public static void main(String[] args) {
		try {
			File file = new File("mensaje3.txt"); // solo es un objeto
			FileWriter fw = new FileWriter(file); // crea un archivo actual
			fw.write("hola\rmundo\r");
			fw.flush(); // confirma los cambios en el archivo
			fw.close(); // cerrar el archivo			
		} catch (IOException e) {
		}
	}
}

class BufferedWriterTeset {
	public static void main(String[] args) throws IOException {
		File file = new File("mensaje2.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hola");
		bw.newLine();
		bw.write("mundo2");
		bw.flush();
		bw.close();
		// PrintWriter out = response.getWriter();
		// out.print("<HTML")
	}
}

class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		File file = new File("mensaje2.txt");
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("hola");
		pw.println("mundo3");
		pw.flush();
		pw.close();
	}
}

class FileReaderTest {
	public static void main(String[] args) {
		char[] in = new char[50]; // para almacenar la entrada
		int size = 0;
		try {
			File file = new File("mensaje2.txt");
			FileReader fr = new FileReader(file); // crea un objeto File
			size = fr.read(in); // leer todo el archivo!
			for (char c : in)
				System.out.print(c);
			fr.close(); // se cierra.
		} catch (IOException e) {
		}
	}
}

class BufferedREaderTest {
	public static void main(String[] args) throws IOException {
		File file = new File("mensaje2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String data = null;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		br.close();
	}
}