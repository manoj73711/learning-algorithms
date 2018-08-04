package algorithms.sorting.mergesort;

public class MergeSort {

	public void mergesort(int[] a) {

		mergesort(a, 0, a.length - 1);
	}

	public void mergesort(int[] a, int start, int end) {

		if (end <= start) {
			return;
		}
		int q = (start + end) / 2;
		mergesort(a, start, q);
		mergesort(a, q + 1, end);
		merge(a, start, q, end);
	}

	private void mymerge(int[] a, int start, int mid, int end) {

		// Below portion is create two sub arrays
		int leftSize = (mid - start) + 2;
		int rightSize = (end - mid) + 1;

		int[] left = new int[leftSize];
		left[left.length - 1] = Integer.MAX_VALUE;

		int[] right = new int[rightSize];
		right[right.length - 1] = Integer.MAX_VALUE;

		// Below process is to copy the data into two left and right arrays
		int l = 0;
		int r = 0;
		for (int i = start; i <= end; i++) {
			if (i <= mid) {
				left[l] = a[i];
				l++;
			} else {
				right[r] = a[i];
				r++;
			}
		}

		int k = start;
		int c = 0;
		int n = 0;
		while (c < left.length && n < right.length) {

			if (c == left.length - 1 && n == right.length - 1) {
				return;
			}

			if (left[c] < right[n]) {
				a[k] = left[c];
				c++;
			} else {
				a[k] = right[n];
				n++;
			}
			k++;

		}
	}

	private void merge(int[] a, int start, int mid, int end) {

		int[] temp = new int[end - start + 1];

		int k = 0;
		int leftCounter = start;
		int rightCounter = mid + 1;

		while (leftCounter <= mid && rightCounter <= end) {
			if (a[leftCounter] < a[rightCounter]) {
				temp[k] = a[leftCounter];
				leftCounter++;
			} else {
				temp[k] = a[rightCounter];
				rightCounter++;
			}
			k++;

		}
		if (rightCounter <= end) {
			while (rightCounter <= end) {
				temp[k] = a[rightCounter];
				rightCounter++;
				k++;
			}
		} else if (leftCounter <= mid) {
			while (leftCounter <= mid) {
				temp[k] = a[leftCounter];
				leftCounter++;
				k++;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			a[start + i] = temp[i];
		}

	}
}