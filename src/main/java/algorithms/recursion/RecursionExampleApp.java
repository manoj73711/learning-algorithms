package algorithms.recursion;

public class RecursionExampleApp {
	public static int number=0;

	public static void main(String[] args) {
		recursion(4);
	}

	public static void recursion(int n) {
		if(n>=0) {
		recursion(n-1);
		}
	}
}
