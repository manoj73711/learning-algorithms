package algorithms.sorting.mergesort;

public class MergeSortApp {

	public static void main(String[] args) {

		int[] a = { 2, 5, 1, 99, 88, 4, 12, 3 };
		// a = insertionSortmyImpl(a);
		MergeSort sort=new MergeSort();
		sort.mergesort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	

}
