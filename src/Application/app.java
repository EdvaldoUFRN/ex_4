package Application;

import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		
		while(x<1 || x>1000) {
			x=sc.nextInt();
		}
		for (int i = 0; i <= x; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
			
		}
		
		sc.close();

	}

}
