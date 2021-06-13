package Program;

/*Nithesh Gowda16..
Write a java code to print reverse only even index words in a given sentence
String str="Java is a Object oriented programming language"
	0        1  2   3        4                  5                    6


expeted o/p:-  avaJ is a Object detneiro programming egaugnal*/
import java.util.Arrays;
import java.util.StringJoiner;

public class TestYantraInterview {
	//convert string into string of array
    public static String[] splitString(String s)
    {
    	String word[]=s.split(" ");
    	return word;
	}
    
    //reverse the given word
    public static String reverseTheWord(String word)
    {
    	char[] givenWord=word.toCharArray();
    	int count=givenWord.length;
    	char[] reverseWord=new char[count];
    	for (int i =0; i<givenWord.length; i++) 
    	{
			reverseWord[i]=givenWord[--count];
		}
    	String output =String.valueOf(reverseWord);
		return output; 	
    }
    
    //identify the even index words
    public static String[] ReverseEvenStringArray(String [] stringArray)
    {
    	for (int i = 0; i < stringArray.length; i++) 
    	{
    		if(i%2==0)
    		{
    			String resWord = reverseTheWord(stringArray[i]);
    			stringArray[i]=resWord;	  
    		}			
		}
		return stringArray;
    }
    
    //join the String Array into single String
    public static StringJoiner joinStringArrayToString(String[] resultArray)
    {
    	StringJoiner finalAns=new StringJoiner(" ");
		for (int i = 0; i < resultArray.length; i++) 
		{
			finalAns.add(resultArray[i]);
		}
		return finalAns;
    }
    
	public static void main(String[] args) 
	{
		String s="java is a Object oriented programing language";
		String[] stringArray = splitString(s);
		String[] resultArray = ReverseEvenStringArray(stringArray);
		StringJoiner output = joinStringArrayToString(resultArray);
		System.out.println(output);
	}
}


