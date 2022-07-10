package objectives.fundamentals;

public class FundamentalsTest {
	public static void main(String[] args) {
		Integer i = new Integer("2");
		System.out.println(i);
		Boolean b = new Boolean("asdfasdf");
		if(b){
		}
		
		int valor = Integer.valueOf("201010", 3);
		System.out.println(valor);
		i++;
		System.out.println(i);
	}
}


class OperatorsTest{
	public static void main(String[] args) {
		int x = 9;
		x *= 2 + 3 ;
		x = x * (2 + 3);
		System.out.println(x);	
		
		int y = 4;
		
		if(false ^ false ^ true){
			System.out.println("entro if" );
		}else{
			System.out.println("NO entro if" );
		}
		System.out.println(y);
		
		String s = null;
		//Integer i = new Integer("");
		//boolean b = s == i;
		if(s instanceof Object){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}