package harjutused_ratsep;

/*
public class sonetootlus{
	public static void main(String[] args) {
		char m2rk = 'G';
		System.out.println(m2rk);
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		char m2rk = 'G';
		char kood = 65;
		
		System.out.println(m2rk);
		System.out.println(kood);
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		char m2rk = 'G';
		char kood = 65;
		char[] m2rgid = { 'a', 'b', 'c', 'd', 'e' };
		
		System.out.println(m2rk);
		System.out.println(kood);
		System.out.println(m2rgid[4]);
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		char uusRida = '\n';
		
		System.out.println("See "+uusRida+"murrab!");
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		String sone = "Tere maailm!";
		
		System.out.println(sone);
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		String nimetus = "\"Reis ümber maailma\"";
		
		System.out.println("Lauamäng "+nimetus+".");
	}
}
*/

/*
import java.util.Scanner;

public class sonetootlus{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); //kasutaja sisestus
		System.out.print("Sisesta oma nimi: ");
		String nimi = scanner.nextLine(); //lisab sisestuse sõne muutujasse
		System.out.print("Sisesta oma vanus: ");
		int vanus = scanner.nextInt(); //lisab sisestuse täisarvu muutujasse
		
		System.out.println("Tere "+nimi+", "+vanus+"!");
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		String nimi = "Mari";
		System.out.printf("Meie %s on nii nooruslik!", nimi);
		
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		String nimi = "Mari";
		System.out.printf("Meie %s %s on nii nooruslik!", nimi, "Maasikas");
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		int arv1 = 6;
		int arv2 = 7;
		String yhik = "tk";
		System.out.printf("%d + %d = %d%s", arv1, arv2, arv1+arv2, yhik);
	}
}
*/


/*
public class sonetootlus{
	public static void main(String[] args) {
		
		String[] nimed = {"Eesti keel", "Matemaatika", "Kirjandus"};
		int[] vanused = {4, 5, 3};
		
		for (int i = 0; i < vanused.length; i++) {
			System.out.printf("%20s %d",nimed[i], vanused[i]);
		}
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		String[] nimed = {"Eesti keel", "Matemaatika", "Kirjandus"};
		int[] vanused = {4, 5 ,3};
		
		for (int i = 0; i < vanused.length; i++) {
			System.out.printf("%-20s %d%n", nimed[i], vanused[i]);
		}
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		System.out.printf("%f",123.456);
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		System.out.printf("%.2f",123.456);
		System.out.printf("%15f",123.456);
		System.out.printf("%15.2f",123.456);
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		String tekst = "lorem iPsum";
		
		System.out.println(tekst.length());
		System.out.println(tekst.charAt(0));
		System.out.println(tekst.substring(1));
		System.out.println(tekst.substring(2,5));
		System.out.println(tekst.indexOf("m"));
		System.out.println(tekst.indexOf("m",5));
		System.out.println(tekst.toLowerCase());
		System.out.println(tekst.toUpperCase());
		
		String[] tykeldus = tekst.split(" ");
		System.out.println(tykeldus[0]);
	}
}
*/

/*
public class sonetootlus{
	public static void main(String[] args) {
		
		String ik = "50801100182";
		int esimeneNr = Integer.parseInt(ik.substring(0,1));
		String esimeneT2ht = Integer.toString(esimeneNr);
		System.out.println(esimeneNr);
		System.out.println(esimeneT2ht);
		
		float ujukoma = Float.parseFloat("25");
		String sone = Float.toString(25.0f);
		System.out.println(ujukoma);
		System.out.println(sone);
	}
}
*/