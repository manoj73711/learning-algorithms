package algorithms.binarysearch;

public class BinaryApp {
	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 6, 77, 88, 89, 99, 100, 123, 145 };
		System.out.println(binarySearch(a, 88));
	}

	public static int binarySearch(int[] a, int x) {

		int p = 0;
		int r = a.length - 1;
	
		while (p <= r) {
			int q = (p + r) / 2;
			
			if (a[q] > x)
				r = q - 1;
			
			else if(a[q] < x)
				p = q + 1;
			
			else
				return q;
		}
		return -1;
	}

}
