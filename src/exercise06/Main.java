package exercise06;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		int sumDj = 0;
		for(int i = 1; i < n ; i++) {
			if(n % i == 0) {
				sumDj += i;
			}
		}
		if(sumDj == n) {
			System.out.println("Broj je savrsen."); }
		else { System.out.println("Broj nije savrsen.");
		}

		
	}

}
