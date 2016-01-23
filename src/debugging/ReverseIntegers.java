package debugging;

public class ReverseIntegers {

	public static void main(String[] args) {
		int[] a = { 1 , 3, 4 ,5 ,8};
		for (int i  = a.length-1  ; i >= 0 ; i--){
			System.out.print(a[i]+ " ");
		}
	}

}
