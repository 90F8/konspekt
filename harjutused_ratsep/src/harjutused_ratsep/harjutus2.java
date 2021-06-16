package harjutused_ratsep;

public class harjutus2 {
	//põhiprogramm
	public static void main(String[] args) {
		vastus(7,5);
		pindala(7);
		
	}
	
	
	static int vastus(int a,int b) {
		int arvutus = a + b;
		System.out.println("Vastus on "+arvutus);
		return arvutus;
	}
	

	//alamprogramm
	static void vastus3() {
	System.out.println();
	}
	
	static int pindala(int c) {	
		int arvutus2 = c * c;
		System.out.println("Vastus on "+arvutus2);
		return arvutus2;
	}
}