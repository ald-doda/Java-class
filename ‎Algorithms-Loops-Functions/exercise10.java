package exercise10;
import java.util.Scanner;
public class exercise10 {
	public static void piramida(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println();
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			} }
		for(int i = n - 1; i > 0 ; i--) {
			System.out.println();
			for(int j = i  ; j >= 1; j--) {
				System.out.print("*");
			} 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		piramida(5);

	}

}
