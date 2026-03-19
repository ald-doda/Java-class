package exercise12;
import java.util.Scanner;
public class exercise12 {

	public static double povrsina(int a, int b, int c) {
		double s = (a+b+c)/2;
		double p = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int a = unos.nextInt();
			int b = unos.nextInt();
			int c = unos.nextInt();
			
			if((a+b>c) && (a+c>b) && (b+c>a)) {
				System.out.println(povrsina(a,b,c));
			}
		}

	}

}
