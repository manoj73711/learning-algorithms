package algorithms.recursion;

public class RecursionLinearSearchApp {
	
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 2, 33, 11, 88, 99, };
		System.out.println(recursionLinearSearch(a, 0, 11));

	}

	public static int recursionLinearSearch(int[] a, int i, int x) {

		if (i > a.length - 1)
			return -1;
		else if (a[i] == x)
			return i;
		else
			return recursionLinearSearch(a, i + 1, x);

	}
}
