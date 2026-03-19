package exercise04;
import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner unos = new Scanner(System.in);
        int a = unos.nextInt();
        int b = unos.nextInt();
  
        for(int i = a; i <= b ; i++) {
        	int brDjelioca = 0;
        	for(int j = 1; j <=  b; j++) {
        		if(i % j == 0) {
        			brDjelioca++;
        		}
        	} if(brDjelioca == 2) {
        		System.out.println(i + " ");
        	}
        }
        
	}

}
