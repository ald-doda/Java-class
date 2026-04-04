package zad03;

import java.util.Scanner;

public class zad03 {
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
	public static int najvisePojavljivanja(int niz[], int n) {
		int maxPojavljivanja = 0;
		int trPojavljivanje = 0;
		int maxEl = 0;
		for(int i = 0; i < niz.length; i++) {
			for(int j = i+1; j < niz.length; j++) {
				if(niz[i] == niz[j]) {
					maxEl = niz[i];
					trPojavljivanje++;
				}
				if(trPojavljivanje> maxPojavljivanja) {
					maxPojavljivanja = trPojavljivanje;
				}
				trPojavljivanje = 0;
			}
		}
		return maxEl;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = unos.nextInt();
		int niz[] = new int[n];
		unesiNiz(niz);
		stampaNiza(niz);
		System.out.println(najvisePojavljivanja(niz, n));
		

	}

}
