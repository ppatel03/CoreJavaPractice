package debugging;

public class NumberDividedByDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		int count = 0;
		int temp = number;
		do{
			number = number / 10;
			count++;
		} while(number != 0);

		System.out.println(temp/count);
	}

}
