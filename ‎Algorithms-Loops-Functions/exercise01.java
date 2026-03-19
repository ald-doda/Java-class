package exercise01;

import java.util.Scanner;

public class exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		int l = unos.nextInt();
		
		if(n > l) {
			System.out.println(n);
		} else {
			System.out.println(l);
		}
	}

}
