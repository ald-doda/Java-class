package exercise14;
import java.util.Scanner;
public class Main {
	public static int brCif(int k) {
		int brCif = 0;
		while(k > 0) {
			int cif = k % 10;
			brCif++;
			k /= 10;
		} return brCif;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		int max = 0;
		int maxBr = 0;
		for(int i = 1 ; i <= n; i++) {
			int k = unos.nextInt();
			if(brCif(k) > max) {
				max = brCif(k);
				maxBr = k;
			} 
			
		} System.out.println(maxBr);
	}

}
