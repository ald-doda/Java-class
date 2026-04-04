package zad01;
import java.util.Scanner;
public class zad01 {
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
	
	public static int brParnih(int niz[], int n, int k) {
		int veciOdK = 0;
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] % 2 == 0 && niz[i] > k) {
				veciOdK++;
				
			}
		}
		return veciOdK;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int n = unos.nextInt();
		int niz[] = new int[n];
		unesiNiz(niz);
		stampaNiza(niz);
		System.out.println(brParnih(niz, n, 4));
	}

}
