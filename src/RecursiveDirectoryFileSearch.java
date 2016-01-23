import java.io.File;
import java.util.HashMap;
import java.util.Map;


class A{
    
int hashcode() {
  return 5;
}
}
public class RecursiveDirectoryFileSearch {
	
	public static void printFilesFromDirectory(File file){
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File fileFromDirectory : files){
				if(fileFromDirectory.isDirectory()){
					printFilesFromDirectory(fileFromDirectory);
				}
				else{
					System.out.println(fileFromDirectory.getName());
				}
			}
		}
		else{
			System.out.println(file.getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		printFilesFromDirectory(file);
		
		  Map<A, Integer> myMap = new HashMap<>();
		     A a1 = new A();
		     A a2 = new A();

		     myMap.put(a1, 1);
		     myMap.put(a1, 2);
		     myMap.put(a2, 2); 
		     System.out.println(myMap.size());
		     
		     for(Map.Entry<A,Integer> mapEntry : myMap.entrySet()){
		    	    A a = mapEntry.getKey();
		    	    int value = mapEntry.getValue();
		    	    System.out.println(" Key = " + a + " Value = " + value);
		    	    }
		    	}
	}


