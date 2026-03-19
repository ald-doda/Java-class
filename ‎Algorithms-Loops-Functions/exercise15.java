package exercise15;
import java.util.Scanner;
public class exercise15 {
	public static void meni(int n) {
		Scanner unos = new Scanner(System.in);
		if(n == 1) {
			System.out.print(1 + "- Saberi dva broja:");
			int a = unos.nextInt();
			int b = unos.nextInt();
			int zbir = a + b;
			System.out.print("Zbir je jednak: " + zbir);
		} 
		else if(n == 2) {
			System.out.print(2 + "- Oduzmi dva broja:");
			int a = unos.nextInt();
			int b = unos.nextInt();
			int razlika = a - b;
			System.out.print("Razlika je jednaka: " + razlika);
		}
		else if(n == 3) {
			System.out.print(3 + "- Pomnozi dva broja:");
			int a = unos.nextInt();
			int b = unos.nextInt();
			int proizvod = a * b;
			System.out.print("Proizvod je jednak: " + proizvod);
		} else if(n== 4) {
			System.out.print(4 + "- Podijeli dva broja: ");
			int a = unos.nextInt();
			int b = unos.nextInt();
			double kolicnik = a / b;
			System.out.print("Kolicnik je jednak: " + kolicnik);
		} else {
			System.out.print("Greska pri unosu.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		meni(n);
	}

}
