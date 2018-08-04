package algorithms.sorting.selectionsort;

public class SelectionSortApp {

	public static void main(String[] args) {

		int[] a = { 2, 5, 12, 99, 3, 4, 7, 1 };
		a = selectionSortmyImpl(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static int[] selectionSortmyImpl(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (!(a[min] == a[i])) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		return a;
	}

}
