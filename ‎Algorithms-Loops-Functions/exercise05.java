package exercise05;

import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
	
		while(n % 2 == 0) {
			n = n / 2;
		}
		
		if(n == 1) {
			System.out.print("Broj je stepen dvojke.");
		} else {
			System.out.print("Broj nije stepen dvojke.");
		}

	}

}
