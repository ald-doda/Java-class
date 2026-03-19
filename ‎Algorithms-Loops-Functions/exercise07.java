package exercise07;

import java.util.Random;
public class exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for(int i = 0; i <= 7; i++) {
			int br = r.nextInt(1, 40);
			System.out.println(br);
		}

	}

}
