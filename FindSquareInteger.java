import java.util.Scanner;

public class FindSquareInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		
		//O(1)
		for (int i = 0; i < q; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int result = countSquareIntegers(a,b);
			System.out.println(result);
		}
	}
	
	// O(1)
	public static int countSquareIntegers(int a, int b) {
		int count = 0;
		int sqrtA = (int) Math.ceil(Math.sqrt(a));
		int sqrtB = (int) Math.floor(Math.sqrt(b));
		
		for (int i = sqrtA; i <= sqrtB; i++) {
			count++;
		}
		
		return count;
	}
}
