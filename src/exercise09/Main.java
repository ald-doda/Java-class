package exercise09;
import java.util.Scanner;

public class Main {

	public static void max(int k, int l,int m) {
		
		if(k > l) {
			if(k> m) {
				System.out.println(k);
			} else {
				System.out.println(m);
			}
		} else {
			if(l > m) {
				System.out.println(l);
			} else {
				System.out.println(m);
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int k = unos.nextInt();
		int l = unos.nextInt();
		int m = unos.nextInt();
		
		max(k, l, m);

}}
