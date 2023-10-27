
public class NumberAppearOddTimes {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15};
		System.out.println("Numbers appear odd times: ");
		findOddTimesAppearNum(arr);
	}
	
	// O(n)
	public static void findOddTimesAppearNum(int[] arr) {
		int maxNum = findMax(arr);
		
		int [] counts = new int[maxNum + 1];
		
		for (int num: arr) {
			counts[num]++;
		}	
		for (int i = 0; i <= maxNum; i++) {
			if (counts[i] % 2 != 0) {
				System.out.println(i+ " ");
			}
		}
		
	}
	
	// O(n)
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int num: arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
