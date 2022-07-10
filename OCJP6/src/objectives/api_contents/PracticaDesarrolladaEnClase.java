package objectives.api_contents;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticaDesarrolladaEnClase {

	public static void main(String[] args) {
	}
}

// Pregunta 9
class Pregunta9 {
	public static void main(String[] args) {
		String s1 = new String("Bicycle");
		String s2 = new String("Bicycle");

		System.out.println(s1.equals(s2) == s2.equals(s1));

	}
}

// pregunta 11
class EqualsTest {
	public static void main(String[] args) {
		Boolean b = new Boolean(true);
		String str = new String("" + b);
		StringBuffer buff = new StringBuffer(str);

		System.out.println(b.equals(str) + "," + str.equals(buff) + ","
				+ buff.equals(b));
	}
}

// Pregunta 12
class Pregunta12 {
	public static void main(String[] args) {
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
		try {
			Number number = numberFormat.parse("4,455.67");
			System.out.println(number.toString());
		} catch (java.text.ParseException ex) {
			System.out.println("Error");
		}

	}
}

// pregunta 7
class MatchTest {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a water everywhere");
		Matcher matcher = pattern.matcher("water");
		if (matcher.find())
			System.out.println("Match found");
		else
			System.out.println("Match not found");
	}
}

// pregunta 6
class PrintfTest {
	public static void main(String[] args) {
		double val1 = 3.91;
		double val2 = 3.97;
		System.out.printf(Locale.US, "%.1f %.1f", val1, val2);
	}
}
