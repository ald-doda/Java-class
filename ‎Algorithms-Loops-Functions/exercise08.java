package exercise08;

import java.util.Scanner;

public class exercise08 {

	public static void abs(int n) {
		if(n >= 0) {
			System.out.println(n);
		} else {
			System.out.println(-1*n);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		abs(n);

	}

}
