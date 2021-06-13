package Program;

import java.util.HashSet;
import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name=sc.nextLine();
		char[] ch = name.toCharArray();

		HashSet hs=new HashSet();

		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if (hs.add(ch[i])==true) //to maintain uniqueness
			{
				System.out.println("appearance of alphabate "+ch[i]+" is "+count);
			}
		}
	}

}
