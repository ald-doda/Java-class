package zad04;

import java.util.Scanner;

public class zad04 {
	public static Scanner unos = new Scanner(System.in);
	public static void unesiNiz(int niz[]) {
		//Scanner unos = new Scanner(System.in);
		for(int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextInt();
		}
	}
	
	public static void stampaNiza(int niz[]) {
		for(int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}
	public static void rotirajUlijevo(int niz[], int k) {
		int pomniz[] = new int[niz.length];
		int brojac = 0;
		
		for(int i = k; i < niz.length; i++) {
			pomniz[brojac++] = niz[i];
		}
		for(int i = 0; i < k; i++) {
			pomniz[brojac++] = niz[i];
		}
		
		for(int i = 0; i < brojac; i++) {
			System.out.print(pomniz[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = unos.nextInt();
		int niz[] = new int[n];
		unesiNiz(niz);
		stampaNiza(niz);
		rotirajUlijevo(niz, 3);
		stampaNiza(niz);
		
	}

}
