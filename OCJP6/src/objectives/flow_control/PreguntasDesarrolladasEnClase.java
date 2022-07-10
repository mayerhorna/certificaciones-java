package objectives.flow_control;

import java.io.IOException;

public class PreguntasDesarrolladasEnClase {
	public static void main(String[] args) {
	}
}

// pregunta 13
class Test {
	public static void main(String[] args) {
		float i = 0;
		final byte j = 5;
		final short s = 4;
		long l = 3;
		while (i < 5) {
			switch ((int) i + 2) {// 1
			default: // 2
			case j:
				System.out.println("one"); // 3
				break;
			case s + 1: // 4
			{
				System.out.println("two");
				break;
			}
			}
			i++;
		}
	}
}

// pregunta 1
class ETest {
	public static void main(String[] args) {
		int i = 1;
		try {
			for (; true; i--) {
				if (i / --i <= 0)
					break;
			}
		} catch (ArithmeticException e) {
			System.out.println("A");
		} catch (RuntimeException e) {
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}

}

// pregunta 3
class Demo {
	public static void main(String[] args) {
		int j = 0;
		try {
			int i = 1;
			j = --i;
			j /= i;
		} catch (RuntimeException e) {
			System.out.println(++j);
		} catch (ArithmeticException e) { // no compila
			System.out.println(++j);
		} finally {
			System.out.println(j++);
		}
		System.out.println(j);
	}
}

// pregunta 7
class Pregunta7 {
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

	private static void tryThis() throws IOException {
		throw new IOException("..");
	}

}


//pregunta 13
class AssertTest13 {
	static int i = 10;
	public static void main(String[] args) {
		i = i * 2;
		try {
			assert isValid() : i - i / 4;
		} catch (AssertionError ignore) {
		}
		System.out.println("¡ = " + i);
	}
	public static boolean isValid() {
		i = i * 2;
		return false;
	}
}

