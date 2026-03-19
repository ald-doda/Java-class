package exercise16;
import java.util.Scanner;
public class exercise16 {

	public static int savrsKvd(int n) {
		int savrsen = 0;
		for(int i = 1; i <= n ; i++) {
			if(i*i == n) {
				savrsen = i;
			}
		} return savrsen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		System.out.println(savrsKvd(n));
	}

}
