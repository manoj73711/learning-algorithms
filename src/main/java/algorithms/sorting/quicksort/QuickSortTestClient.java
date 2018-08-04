package algorithms.sorting.quicksort;

public class QuickSortTestClient {
	
	
	public static void main(String[] args) {
		int[] a= {100,2,4,6,1,2,99,89,1};
		a=QuickSortAlgorithm.quickSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
