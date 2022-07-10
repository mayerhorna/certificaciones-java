package objectives.practicas;

import java.io.IOException;
import java.util.Arrays;

public class Practica2Desarrollo {
	public static void main(String[] args) {

	}
}

// Pregunta 1

// Pregunta 2

// Pregunta 3
class Pregunta3 {
	public static void main(String[] args) {
		System.out.println("a");
		String[][][] arr = { { {}, null, { "7", null, "2" } },
				{ { "5", "1" } }, {}, { { "0", null }, null } };
		try {
			System.out.println(arr[3][1].length);
		} catch (RuntimeException ex) {
			System.out.println("b");
		} catch (Exception ex) {
			System.out.println("c");
		} finally {
			System.out.println("d");
		}

	}
}

// Pregunta 4

// Pregunta 5

// Pregunta 6
class Assert {
	private void sum(int value) {
		boolean bol = true;
		assert bol = false : "value by default";
		int value2 = 10;
		int sum = value + value2;
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		Assert a = new Assert();
		a.sum(22);
	}
}

// Pregunta 7
class AssertTest {
	private void methodA(int i) {
		assert ++i >= 0 : methodB();
		System.out.println(i);
	}

	private String methodB() {
		return "The value must not be negative";
	}

	public static void main(String[] args) {
		AssertTest test = new AssertTest();
		test.methodA(-10);
	}
}

// Pregunta 8
class Split2 {
	public static void main(String[] args) {
		String str = "She sells sea shells";
		System.out.println(Arrays.toString(str.split("s")));
	}
}

// Pregunta 9

// Pregunta 10

// Pregunta 11

// Pregunta 12

// Pregunta 13
class Pregunta13 {
	public static void main(String[] args) {
		try {
			tryThis();
			return;
		} catch (IOException x1) {
			System.out.println("exception 1 ");
			return;
		} catch (Exception x2) {
			System.out.println("exception 2");
			return;
		} finally {
			System.out.println("finally");
		}

	}

	private static void tryThis() throws IOException{
		throw new IOException();
	}
}
// Pregunta 14

// Pregunta 15
