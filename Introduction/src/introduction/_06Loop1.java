package introduction;

import java.util.Scanner;

/**
 * 
 * @author g471000
 *
 */
public class _06Loop1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}
	}
}
