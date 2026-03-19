package exercise02;
import java.util.Scanner;

public class exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		int brojac = 0;
		while(n > 0) {
			int cif = n % 10;
			 brojac++;
			n = n / 10;
		} System.out.println(brojac);

	}

}
