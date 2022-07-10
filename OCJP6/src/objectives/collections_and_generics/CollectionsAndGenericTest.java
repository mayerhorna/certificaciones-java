package objectives.collections_and_generics;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class PersonaSort implements Comparator<Persona> {
	public int compare(Persona o1, Persona o2) {
		return o1.getId().compareTo(o2.getId());
	}
}

class Persona {// implements Comparable<Persona>{
	private Long id;
	private String dni;
	private String nombre;

	public Persona() {
	}

	public Persona(Long id, String dni, String nombre) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "{id: " + this.id + ", nombre:" + this.nombre + " }";
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Persona) {
			Persona personaParam = (Persona) obj;
			if (this.id.equals(personaParam.getId())) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		// long idLng = 1;
		return this.id.hashCode();
	}
	/*
	 * public int compareTo(Persona o) { return
	 * o.nombre.compareTo(this.getNombre()); }
	 */
	// public static void main(String[] args) {
	// System.out.println("r".compareTo("b")<=0);
	// }
}

public class CollectionsAndGenericTest {
	public static void main(String[] args) {
		{
			ArrayList<Persona> personas = new ArrayList<Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(1L, "124311", "Paco");
			personas.add(p1);
			personas.add(p2);
			personas.add(new Persona(3L, "524311", "Luis"));
			for (Persona persona : personas) {
				System.out.println(persona);
			}
			System.out.println("equals:");
			System.out.println(p1.equals(p2));
			System.out.println(p1.hashCode() == p2.hashCode());
		}
		System.out.println("Colecciones Comunes:");
		System.out.println("Estudio de List:");
		System.out.println("Vector:");
		{
			Vector<Persona> personas = new Vector<Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(1L, "124311", "Paco");
			Persona p3 = new Persona(2L, "124311", "Luis");
			Persona p4 = new Persona(3L, "124311", "Teresa");
			personas.add(p1);
			personas.add(p2);
			personas.add(p3);
			personas.add(p4);
			for (Persona persona : personas) {
				System.out.println(persona);
			}
		}
		System.out.println("ArrayList:"); //
		{
			ArrayList<Persona> personas = new ArrayList<Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(1L, "124311", "Paco");
			Persona p3 = new Persona(2L, "124311", "Luis");
			Persona p4 = new Persona(3L, "124311", "Teresa");
			personas.add(p1);
			personas.add(p2);
			personas.add(p3);
			personas.add(p4);
			for (Persona persona : personas) {
				System.out.println(persona);
			}
		}
		System.out.println("LinkedList:"); // lista doblemente enlazada
		{
			LinkedList<Persona> personas = new LinkedList<Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(1L, "124311", "Paco");
			Persona p3 = new Persona(2L, "124311", "Luis");
			Persona p4 = new Persona(3L, "124311", "Teresa");
			personas.add(p3);
			personas.add(p1);
			personas.add(p2);
			personas.add(p4);
			for (Persona persona : personas) {
				System.out.println(persona);
			}
		}
		System.out.println("Estudio de Set:");
		System.out.println("HashSet:");
		{
			HashSet<Persona> personas = new HashSet<Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(1L, "124311", "Paco");
			Persona p3 = new Persona(3L, "124311", "Luis");
			Persona p4 = new Persona(4L, "124311", "Teresa");
			personas.add(p3);
			personas.add(p4);
			personas.add(p1);
			personas.add(p2);
			for (Persona persona : personas) {
				System.out.println(persona);
			}
		}
		System.out.println("LinkedHashSet:");
		{
			LinkedHashSet<Persona> personas = new LinkedHashSet<Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(1L, "124311", "Paco");
			Persona p3 = new Persona(3L, "124311", "Luis");
			Persona p4 = new Persona(4L, "124311", "Teresa");
			personas.add(p3);
			personas.add(p4);
			personas.add(p1);
			personas.add(p2);
			for (Persona persona : personas) {
				System.out.println(persona);
			}
		}
		System.out.println("TreeSet-beans:");
		{
			PersonaSort personaSort = new PersonaSort();
			TreeSet<Persona> personas = new TreeSet<Persona>(personaSort);
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(1L, "124311", "Paco");
			Persona p3 = new Persona(3L, "124311", "Luis");
			Persona p4 = new Persona(4L, "124311", "Teresa");
			personas.add(p3);
			personas.add(p4);
			personas.add(p1);
			personas.add(p2);
			for (Persona persona : personas) {
				System.out.println(persona);
			}
		}
		System.out.println("TreeSet-ordenamiento natural cadenas:");
		{
			TreeSet<String> cadenas = new TreeSet<String>();
			cadenas.add("a");
			cadenas.add("9");
			cadenas.add("ZW");
			cadenas.add("Ze");
			cadenas.add("b");
			cadenas.add(" ");
			cadenas.add("e");
			for (String cadena : cadenas) {
				System.out.println(cadena);
			}
		}
		System.out.println("TreeSet-ordenamiento natural numeros:");
		{
			TreeSet<Integer> numeros = new TreeSet<Integer>();
			numeros.add(3);
			numeros.add(1);
			numeros.add(100);
			numeros.add(20);
			numeros.add(4);
			for (Integer numero : numeros) {
				System.out.println(numero);
			}
		}
		System.out.println("Estudio de Map:");
		System.out.println("HashMap:");
		{
			HashMap<String, Persona> personas = new HashMap<String, Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(2L, "124311", "Paco");
			Persona p3 = new Persona(3L, "124311", "Luis");
			Persona p4 = new Persona(4L, "124311", "Teresa");
			personas.put("3", p3);
			personas.put("4", p4);
			personas.put("1", p1);
			personas.put("2", null); // si puedes colocar un key y valor NULO
			Set<String> keys = personas.keySet();
			for (String key : keys) {
				System.out.println(personas.get(key));
			}
		}
		System.out.println("");
		System.out.println("Hashtable:");
		{ // No acepta claves ni valores NULOS
			Hashtable<String, Persona> personas = new Hashtable<String, Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(2L, "124311", "Paco");
			Persona p3 = new Persona(3L, "124311", "Luis");
			Persona p4 = new Persona(4L, "124311", "Teresa");
			personas.put("3", p3);
			personas.put("4", p4);
			personas.put("1", p1);
			personas.put("2", p2);
			Set<String> keys = personas.keySet();
			for (String key : keys) {
				System.out.println(personas.get(key));
			}
		}
		System.out.println("");
		System.out.println("LinkedHashMap:");
		{ // No acepta claves ni valores NULOS
			// <resultclass="LinkedHashMap"
			// SELECT code, name, id from USUARIO
			LinkedHashMap<String, Persona> personas = new LinkedHashMap<String, Persona>(
					10, .3f, true);
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(2L, "124311", "Paco");
			Persona p3 = new Persona(3L, "124311", "Luis");
			Persona p4 = new Persona(4L, "124311", "Teresa");
			personas.put("3", p3);
			personas.put("4", p4);
			personas.put("1", p1);
			personas.put("2", p2);
			// personas.put("2",p1);
			Set<String> keys = personas.keySet();
			// for (String key : keys) {
			// System.out.println(personas.get(key));
			// }
			System.out.println(personas);
			personas.get("3");
			System.out.println(personas);
		}
		System.out.println("");
		System.out.println("TreeMap:");
		{
			PersonaSort personaSort = new PersonaSort();
			TreeMap<Persona, Persona> personas = new TreeMap<Persona, Persona>(
					personaSort);
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(2L, "124311", "Paco");
			Persona p3 = new Persona(3L, "124311", "Luis");
			Persona p4 = new Persona(4L, "124311", "Teresa");
			personas.put(p3, p3);
			personas.put(p4, p4);
			personas.put(p1, p1);
			personas.put(p2, p2);
			Set<Persona> keys = personas.keySet();
			for (Persona key : keys) {
				System.out.println(personas.get(key));
			}
		}
		// Para asignar capacidad a una lista:
		List<String> lista = new ArrayList(20);
		System.out.println(lista);
	}
}

class PQ {
	static class PQsort implements Comparator<Integer> { // inverse sort
		public int compare(Integer one, Integer two) {
			return two - one; // unboxing
		}
	}

	public static void main(String[] args) {
		int[] ia = { 1, 5, 3, 7, 6, 9, 8 }; // unordered data
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); // using
		// natural
		// order
		for (int x : ia) {
			// load queue
			pq1.add(x);
		}
		System.out.println(pq1);
		for (int i = 0; i < 7; i++) {
			// review queue
			System.out.print(pq1.poll() + " ");
		}
		System.out.println();
		System.out.println(pq1);

		System.out.println("");
		PQsort pqs = new PQsort(); // get a Comparator
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, pqs); // using
		// Comparator
		for (int x : ia) {
			// load queue
			pq2.offer(x);
		}
		System.out.println("size " + pq2.size());
		System.out.println("peek " + pq2.peek());
		System.out.println("size " + pq2.size());
		System.out.println("poll " + pq2.poll());
		System.out.println("size " + pq2.size());
		for (int x : ia) {
			// review queue
			System.out.print(pq2.poll() + " ");
		}

	}
}

class SortingCollections {
	public static void main(String[] args) {
		{
			ArrayList<Persona> personas = new ArrayList<Persona>();
			Persona p1 = new Persona(1L, "324311", "Hugo");
			Persona p2 = new Persona(2L, "124311", "Paco");
			Persona p3 = new Persona(5L, "124311", "Luis");
			Persona p4 = new Persona(8L, "124311", "Teresa");
			personas.add(p1);
			personas.add(p2);
			personas.add(p3);
			personas.add(p4);
			System.out.println("lista desordenada: ");
			for (Persona persona : personas) {
				System.out.println(persona);
			}
			System.out.println("lista ordenada: ");
			Collections.sort(personas, new PersonaSort());
			for (Persona persona : personas) {
				System.out.println(persona);
			}
			System.out.println("Arrays.sort:");
			String[] cadenas = { "e", "a", "z", "h" };
			System.out.println(Arrays.toString(cadenas));
			Arrays.sort(cadenas);
			System.out.println(Arrays.toString(cadenas));

			Persona pABuscar = new Persona();
			pABuscar.setId(3L);
			PersonaSort pSort = new PersonaSort();
			Collections.sort(personas, pSort);
			System.out.println("Lista ordenada a buscar: ");
			for (Persona persona : personas) {
				System.out.println(persona);
			}
			int search = Collections.binarySearch(personas, pABuscar, pSort);
			// Persona personaEncontrada = personas.get(search);
			int indiceToInsert = (search + 1) * -1;
			personas.add(indiceToInsert, pABuscar);
			System.out.println(search);
			// System.out.println("encontro: " + personaEncontrada);
			System.out.println("lista con persona insertada:");
			for (Persona persona : personas) {
				System.out.println(persona);
			}

			System.out.println("Conversiones de lista a arreglo");
			// forma 1:
			// Object[] personasComoArreglo = personas.toArray();
			// forma 2:
			Persona[] personasComoArreglo = personas.toArray(new Persona[] {});
			for (Persona p : personasComoArreglo) {
				// Persona p = (Persona)object;
				System.out.println(p);
			}

			System.out.println("Conversiones de arreglo a lista");
			List<Persona> personasList = Arrays.asList(personasComoArreglo);
			for (Persona personaObj : personasList) {
				System.out.println(personaObj);
			}
			// recorrido de collections
			// java4, por iterator
			ArrayList personas4 = new ArrayList();
			Iterator personas4Iterator = personas.iterator();
			while (personas4Iterator.hasNext()) {
				Persona p = (Persona) personas4Iterator.next();
				System.out.println(p);
			}
			// por indice
			for (int i = 0; i < personasComoArreglo.length; i++) {
			}

			// java 5
			for (Persona persona2 : personasList) {

			}

		}
	}
}

class Venta {
}

interface DAO<T> {
	public void save(T t);

	public void update(T t);

	public void delete(T t);

	public T get(Long id);

	public List<T> getAll();
}

class PersonaDaoHibernate implements DAO<Persona> {
	public void delete(Persona t) {
	}

	public Persona get(Long id) {
		return null;
	}

	public List<Persona> getAll() {
		return null;
	}

	public void save(Persona t) {
	}

	public void update(Persona t) {
	}
}

class MiLista<E extends Persona> {
	private ArrayList<E> lista = new ArrayList<E>();

	public void agregar(E elemento) {
		lista.add(elemento);
	}

	public E obtener(int i) {
		return lista.get(i);
	}
}

class Util {
	public <T> T queryForObject(T obj) {
		return obj;
	}

	public <M> M queryForObject2(M obj) {
		return obj;
	}
	public static <X,Y extends X> boolean isPresent(X x,Y[]y){
		return true;
	}
}

class GenericTest {
	public static void main(String[] args) {
		MiLista<Persona> lista = new MiLista<Persona>();
		// lista.obtener(i)
		Object o = new String("aa");
		List<String> cadenas = new ArrayList<String>();
		// cadenas.add(new Persona());
		cadenas.add("A");
		cadenas.add("B");
		ArrayList cadenas2 = new ArrayList();
		cadenas2.add("A");
		cadenas2.add("B");
		for (Object object : cadenas2) {
			String c = (String) object;
			System.out.println(c);
		}

		for (String cadena : cadenas) {
			System.out.println(cadena);
		}
	}
}

abstract class Animal {
	public abstract String accion();
}

class Dog extends Animal {
	public String accion() {
		return "I Dog";
	}
}

class CollectionTypeGenerics {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		addAll(dogs); // error de compilación
	}

	public static void addAll(List<?> animals) {
		//animals.add(new Dog());
		for (Object object : animals) {
			
		}
	}
}
