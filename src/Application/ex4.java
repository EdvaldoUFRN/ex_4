package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double divisao = a/b;
			if (b!=0) {
				System.out.printf("%.1f%n", divisao);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		
		sc.close();

	}

}
