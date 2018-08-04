package algorithms.sorting.quicksort;

public class QuickSortAlgorithm {

	public static int[] quickSort(int[] a) {

		return quickSort(a, 0, a.length - 1);
	}

	private static int[] quickSort(int[] a, int p, int r) {

		if (p < r) {
			int q = partionPivotPoint(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
		return a;
	}

	private static int partionPivotPoint(int[] a, int p, int r) {

		int i = p - 1;
		int tempPivot = a[r];

		for (int j = p; j <= r; j++) {
			if (a[j] <= tempPivot) {
				i++;
				// swap elements in i and j
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		return i;
	}

}
