package Program;

public class ReverseTheString {

	public static void main(String[] args) {
	
		String s="hello world";
		System.out.println(s);
		char[] ch=s.toCharArray();
		for (int i = ch.length-1; i>=0 ; i--) 
		{
			System.out.print(ch[i]);
		}
	}
}
