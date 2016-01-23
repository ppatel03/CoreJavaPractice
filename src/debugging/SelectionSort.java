package debugging;

public class SelectionSort {


	
	public static void display(int []a){
		for(int no : a){
			System.out.print(no+"\t");
		}
		System.out.println();
	}

	public static void performSelectionSort(int []a) {
		// TODO Auto-generated method stub
		
		for( int i = a.length-1 ; i > 0 ; i--){
			int max = a[i] ;
			int maxPosition = i;
			for (int j = 0 ; j < i;j++){
				if(a[j] > max ){
					max = a[j];
					maxPosition = j;
				}				
			} 
			a[maxPosition]= a[i];
			a[i] = max;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {45,27,84,13,16,89,24,22,17,23,9,12};
		display(a);		
		performSelectionSort(a);
		display(a);
	}



}
