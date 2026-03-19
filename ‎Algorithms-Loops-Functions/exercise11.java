package exercise11;
import java.util.Scanner;
public class exercise11 {
	public static void prosjek(int ocjena) {
		Scanner unos = new Scanner(System.in);
		int brojac = 1;
		int suma = 0;
		double prosjek = 0.0;
		while(brojac <= 5) {
			ocjena = unos.nextInt();
			suma = suma + ocjena;
			brojac++;
		}
		prosjek = suma / 5.0;
		System.out.print(prosjek);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prosjek(5);

	}

}
