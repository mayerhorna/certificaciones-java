package objectives.api_contents;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		System.out.println("ejemplo 1:");
		{
			Pattern patron = Pattern.compile("ab");
			Matcher matcher = patron.matcher("Hola ab asf ab Mundo");
			while (matcher.find()) {
				System.out.println(matcher.start() + ";" + matcher.end() + ";"
						+ matcher.group());
			}
		}
		System.out.println("ejemplo 2:");
		{
			Pattern p = Pattern.compile("\\S+"); // expression
			Matcher m = p.matcher("12 0x 0x12 0xf 0xh"); // source
			boolean b = false;
			while (b = m.find()) {
				System.out.println(m.start() + ";" + m.end() + ";" + m.group());
			}
		}
		System.out.println("ejemplo 3");
		{
			Pattern p = Pattern.compile("proj1([^,])*"); // expression
			Matcher m = p
					.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java"); //
			boolean b = false;
			while (b = m.find()) {
				System.out.println(m.group());
			}
		}
		System.out.println("ejemplo 4:");
		{
			Pattern p = Pattern.compile("a.e"); // expression
			Matcher m = p.matcher("ac abe a c"); // source
			boolean b = false;
			while (b = m.find()) {
				System.out.println(m.start() + ": " + m.group());
			}

		}
		{
			System.out.println("split: ");
			String patron = "\\s";
			String[] tokens = "ab sde fg".split(patron);
			System.out.println("count " + tokens.length);
			for (String s : tokens) {
				System.out.println(">" + s + "<");
			}
			int indice = "a,b,c,".lastIndexOf(",");
			String out = "a,b,c,".substring(0,indice);
			System.out.println(out);
			
			String[] tokens2 = "a1+b3-c5=4x ".split("[12345][+-=]");
			System.out.println(tokens2.length);

		}

	}
}
class ScannerTest{
	public static void main(String[] args) { 
		boolean booleano; 
		int entero; 
		String s, hits = " "; 
		Scanner s1 = new Scanner("1;true;34;hi"); 
		s1.useDelimiter(";"); //Se puede cambiar el delimitador. 
		Scanner s2 = new Scanner("1;True;34;hi;7;aaa;;");
		s2.useDelimiter(";");
		while (s1.hasNext()) { 
			s = s1.next(); 
			System.out.println(">"+s+"<"); 
		} 
		while (s2.hasNext()) { 
			if (s2.hasNextInt()) { 
				entero = s2.nextInt(); 
				hits += " entero"; 
			} else if (s2.hasNextBoolean()) { 
				booleano = s2.nextBoolean(); 
				hits += " booleano"; 
			} else { 
				s2.next(); 
				hits += " cadena"; 
			} 
		} 
		System.out.println("Encontro:" + hits); 
	} 
}

class Stringformat{
	public static void main(String[] args) {
		String p1 = "Juan";
		String p2 = "Adios"; 
		double p3 = -23.219;
		String out = String.format(Locale.US,"%2$s Hola, %1$s, %3$(.2f", p1, p2, p3);
		System.out.println(out);
		String out2 = String.format("Verdad: %b", new Boolean("daf"));
		String.format("Numero: %f", 32432.0);
		System.out.println(out2);
	}
}
