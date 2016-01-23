/*
 * Complexity : 
 * Best Case : O (n)
 * Average Case : O (n *  n )
 * Worst Case : O (n * n )
 * 
 */
package debugging;

public class InsertionSort {
	
	public static void performInsertionSort(int []a){
		int i , j ;
		for( i = 1 ; i < a.length ; i++){
			int no = a[i];
			
			for( j = i - 1 ; j >= 0 ; j--){
				if(a[j] > no){	
					a[j+1] = a[j];
				}
				else {
					break;
				}
			}
			a[j+1] = no;
		}
	}
	
	public static void display(int []a){
		for(int no : a){
			System.out.print(no+"\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {45,27,84,13,16,89,24,22,17,23,9,12};
		display(a);
		
		performInsertionSort(a);
		display(a);
	}

}
