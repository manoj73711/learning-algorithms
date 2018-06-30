package algorithms.linearsearch;

public class App {

	public static void main(String[] args) {
		int [] a= {1,2,3,5,2,33,11,88,99,};
		System.out.println(recursionLinearSearch(a, 0, 11));
		

	}

	// This below method is a linear search method with order of O(n)
	public static int linearSearch(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public static int recursionLinearSearch(int[] a,int i,int x) {
		
		if(i>a.length-1)
			return -1;
		else if(a[i]==x)
			return i;
		else
			return recursionLinearSearch(a,i+1,x);
		
	}
}
