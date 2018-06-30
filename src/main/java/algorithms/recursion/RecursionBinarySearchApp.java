package algorithms.recursion;

public class RecursionBinarySearchApp {
	
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(RecursionBinarySearch(0, a.length-1, a, 0));
	}
	
	
	public static int RecursionBinarySearch(int p, int r, int [] a,int x ) {
		
		int q=(p+r)/2;
		if((p>r))
			return -1;
		else if(a[q]>x)
			return RecursionBinarySearch(p, q-1, a, x);
		else if(a[q]<x) 
			return RecursionBinarySearch(q+1, r, a, x);

		return q;
	}
	

}
