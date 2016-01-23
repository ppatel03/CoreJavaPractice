
public class WideningBoxingVarargs {

	static void go(int ...x){
		System.out.println("long");
	}
	
	static void go(Integer x){
		System.out.println("Integer");
	}
	
	
	
	static void go(long x){
		System.out.println("long");
	}
	
	final static public  void main(String... args) {
		// TODO Auto-generated method stub
		
     int x = 5;
     go(x);
	}

}
