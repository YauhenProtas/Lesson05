package by.jb24.less05hw;

import java.util.Scanner;
import java.util.Random;
import by.jb24.less05hw.Fraction;

public class FractionCalc {

	public static void main(String[] args) {
		Random rnd = new Random();
		Fraction frct = new Fraction();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = 1;
		System.out.print("Please enter array size (K): ");
		if (sc.hasNextInt()) {
			k = sc.nextInt();
		}
		
		for (int i = 0; i < k; i++) {

			frct.setM(rnd.nextInt(1000));
			frct.setN(rnd.nextInt(100));

			System.out.println(frct.mathFract());
		}
	}
	
}
