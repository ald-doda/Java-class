package exercise13;
import java.util.Scanner;
public class Main {

	public static boolean prost(int n) {
		int brDj = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				brDj++;
			}
		}
		if(brDj == 2) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		System.out.print(prost(n));
	}

}
