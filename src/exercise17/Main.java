package exercise17;
import java.util.Scanner;
public class Main {
	public static int teziste(int n) {
		int tez = -1;
		while(n > 0) {
			int cif = n % 10;
			tez++;
			n /=10;
		} return tez;
	}
	public static int obrni(int n) {
		int tez = teziste(n);
		int obr = 0;
		while(n > 0) {
			int cif = n % 10;
			obr += Math.pow(10, teziste(n)) * cif;
			tez--;
		    n /= 10;
		} return obr;
	}
	
	public static boolean palindrom(int n) {
		if(obrni(n) == n) { return true;
		} else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		System.out.println(palindrom(n));
	}

}
