package zad02;

import java.util.Scanner;

public class zad02 {
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
	public static void stampajIndekse(int niz[]) {
	for(int k = 0; k < niz.length; k++) {
		int sumPrije = 0;
		int sumPoslije = 0;
		
		for(int i = 0; i < k; i++) {
			sumPrije += niz[i];
		}
		for(int j = k+1; j < niz.length; j++) {
			sumPoslije += niz[j];
		}
		
		if(sumPrije == sumPoslije) {
			System.out.println(k + " ");
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = unos.nextInt();
		int niz[] = new int[n];
		unesiNiz(niz);
		stampaNiza(niz);
		stampajIndekse(niz);
	
	}

}
