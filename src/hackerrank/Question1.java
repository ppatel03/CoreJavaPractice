package hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {
	
	public  String getRecur(String s){
		Map<Character, Integer> recurMap = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0 ; i < s.length() ; i++){
			Character c = s.charAt(i);
			
			if(!recurMap.containsKey(c)){
				recurMap.put(c, 1);
			} else {
				Integer count = recurMap.get(c);
				count++;
				recurMap.put(c, count);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : recurMap.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey());
				break;
			}
		}
		Character c = s.charAt(0);
		return c.toString();
	}
	
	public  void testTriangles(){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println();
		
		for(int i = 0 ; i < number ; i++){
			
		}
	}

	public static void main(String[] args) {
		Question1 q1 = new Question1();
		String s = "abcba";
		System.out.println(q1.getRecur(s));
	}



}
