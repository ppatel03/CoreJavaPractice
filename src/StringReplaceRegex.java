
public class StringReplaceRegex {
	public static void main(String[] args){
		String input = "hello .,/( wordl";
		String regex = "([.,/()])";
		
		System.out.println(input.replaceAll(regex, ""));
	}
}
