import java.util.HashMap;
import java.util.Map;



class AA {

	private  String name;

	public AA (String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	int hashcode() {
		return 5;
	}
}


class B {

	void main() {

	}



}
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<AA, Integer> myMap = new HashMap<>();
		AA a1 = new AA("a1");
		AA a2 = new AA("a2");

		myMap.put(a1, 1);
		myMap.put(a1, 2);
		myMap.put(a2, 2);
		//myMap.put(a1, 3);

		for(Map.Entry<AA,Integer> mapEntry : myMap.entrySet()){
			AA a = mapEntry.getKey();
			int value = mapEntry.getValue();
			System.out.println(" Key = " + a + " Value = " + value);
		}
	}

}
