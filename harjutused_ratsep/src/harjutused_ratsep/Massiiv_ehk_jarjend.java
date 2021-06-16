package harjutused_ratsep;

/* 
 * Massiiv pole ainuke liige kogumtüüpi (collection) andmestruktuuris.
 * loend(list)
 * hulk(set)
 * magasin(stack)
 * sõnastik(map)
 * järjekord(queue)
 */

/*
public class Massiiv_ehk_jarjend {
	
	public static void main(String[] args) {
		String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle",};
		System.out.println(nimed[2]);
		
		
	}
}
*/

/*
public class Massiiv_ehk_jarjend{
	
	public static void main(String[] args) {
		String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle",};
		int suvArv = (int) Math.floor(Math.random() * 6);
		System.out.println(nimed[suvArv]);
	}
			
}

*/

/*
public class Massiiv_ehk_jarjend{
	public static void main(String[] args) {
		//määrame massiivi pikkuse
		int[] juustePikkused = new int[6];
		
		//lisame väärtused massiivi
		juustePikkused[0] = 30;
		juustePikkused[1] = 45;
		juustePikkused[2] = 76;
		juustePikkused[3] = 11;
		juustePikkused[4] = 4;
		juustePikkused[5] = 18;
		
		//trükime välja
		System.out.println(juustePikkused[1]);
	}
}
*/

/*
public class Massiiv_ehk_jarjend{
	public static void main(String[] args) {
		
		String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
		int nimedKokku = nimed.length;
		System.out.println("Nimesid kokku: "+nimedKokku);
	}
}
*/

/*
public class Massiiv_ehk_jarjend{
	public static void main(String[] args) {
		
		String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
		int nimedKokku = nimed.length;
		String viimaneNimi = nimed[nimedKokku-1];
		System.out.println("Nimed kokku: "+nimedKokku);
		System.out.println("Viimane nimekirjas: "+viimaneNimi);
	}
}
*/

/*
public class Massiiv_ehk_jarjend{
	public static void main(String[] args) {
		String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle",};
		
		for(int i = 0; i < nimed.length; i++) {
			System.out.println(nimed[i]);
		}
	}
}
*/

/*
public class Massiiv_ehk_jarjend{
	public static void main(String[] args) {
		String[][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "Jüri", "Kalle"} };
		System.out.println(nimed[0][2]);
	}
}
*/

/*
public class Massiiv_ehk_jarjend{
	public static void main(String[] args) {
		
		int[][] vanused = new int[4][3];
		
		//esimene rida
		vanused[0][0] = 3;
		vanused[0][1] = 15;
		vanused[0][2] = 5;
		//teine rida
		vanused[1][0] = 3;
		vanused[1][1] = 7;
		vanused[1][2] = 20;
		//kolmas rida
		vanused[2][0] = 11;
		vanused[2][1] = 17;
		vanused[2][2] = 10;
		//neljas rida
		vanused[3][0] = 15;
		vanused[3][1] = 20;
		vanused[3][2] = 17;
		
		System.out.println(vanused[1][2]);
	}
}
*/

/*
public class Massiiv_ehk_jarjend{
	public static void main(String[] args) {
		String[][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "Jüri", "Kalle"} };
		
		//käime läbi read
		for (int i = 0; i < nimed.length; i++) {
			//käime läbi veerud
			for (int j = 0; j < nimed[i].length; j++) {
				System.out.println(nimed[i][j]);
				
			}
		}
	}
}
*/
