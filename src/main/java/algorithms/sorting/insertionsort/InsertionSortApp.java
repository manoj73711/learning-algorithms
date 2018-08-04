package algorithms.sorting.insertionsort;

public class InsertionSortApp {

	public static void main(String[] args) {

		int[] a = { 2, 5, 1, 99, 88, 4, 12, 3 };
		// a = insertionSortmyImpl(a);
		a = insertionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static int[] insertionSortmyImpl(int[] a) {

		int si = 0; // sortedPortionIndex =si
		int ui = 1; // UnsortedPortion =ui
		while (ui < a.length) {
			if (a[si] > a[ui]) {
				int temp = a[ui];
				a[ui] = a[si];
				int vsi = si; // vsi -> varying sorted index
				while (vsi > 0) {
					if (a[vsi - 1] < temp) {
						a[vsi] = temp;
						break;
					} else {
						a[vsi] = a[vsi - 1];
						if (vsi == 1) {
							a[vsi - 1] = temp;
						}
						vsi--;
					}
				}
			}
			si++;
			ui++;
		}

		return a;
	}

	public static int[] insertionSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}

		return a;
	}

}
