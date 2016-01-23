
//public classes should have the same name as the Name of the file
public class TestVisibility {

	public static void isStaticAccessed(){
		System.out.println("static mehtod is accesses");
		
	}
	
	public  void isInstanceAccessed(){
		System.out.println("instance mehtod is accesses");
		isStaticAccessed();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isStaticAccessed();
	}

}

// These can be only one public class
class Test{
	
}
