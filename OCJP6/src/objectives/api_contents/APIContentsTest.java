package objectives.api_contents;

public class APIContentsTest {
	public static void main(String[] args) {
		//String
		System.out.println("Strings:");
		String s1 = "Hola";
		s1.concat(" Mundo");
		System.out.println(s1);
		String s2 = new String("Adios");
		
		String s3 = "Hola";
		String s4 = new String("Buenas");
		//"a".
		String cadena = "Buenas Tades";
		String parteCadena = cadena.substring(2,4);
		System.out.println(parteCadena);
		
		System.out.println("StringBuffer");
		StringBuffer sbf = new StringBuffer();	 //Java4-
		sbf.append("SELECT ");
		sbf.append("* FROM ");
		sbf.append("t_cliente ");
		System.out.println(sbf.toString());
		
		StringBuilder sbl = new StringBuilder();	//Java5+
		sbl.append("SELECT ");
		sbl.append("* FROM ");
		sbl.append("t_cliente ");
		System.out.println(sbl.toString());
		
		System.out.println("equals and ==");
		String c1 = "Carmen"; 
		String c2 = new String(new String("Carmen"));	
		StringBuilder c3= new StringBuilder("Carmen");
		StringBuilder c4 = new StringBuilder("Carmen");
		System.out.println(c1.equals(c3.toString()));
		//System.out.println(c1 == c3 );
	}
}
