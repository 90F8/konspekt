package harjutused_ratsep;

public class alamprogrammid {

	public static void main(String[] args) {
		ytleTere("Java");
		
		int s = ruuduPindala(4);
		System.out.println("Ruudu pindala on "+s);
		
	}
	
	//tagastab t‰isarvulise v‰‰rtuse
	static int ruuduPindala(int a) {
		int pindala = a * a;
		return pindala;
	}
	
	//alamprogramm argumendiga
	static void ytleTere(String nimi) {
		System.out.println("Tere "+nimi+"!");
		
	}

}
