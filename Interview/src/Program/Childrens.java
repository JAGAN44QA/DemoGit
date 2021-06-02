
package Program;

import java.util.ArrayList;

public class Childrens 
{
	public static void main(StringClass[] args) 
	{
		int n=50;
		int countEven=0,countOdd=0;
		int registrationNO=6655213;//registration number 
		int regNO[]=new int [n];
		for (int i = 0; i < n; i++) 
		{
			regNO[i]=registrationNO++;
			if(regNO[i]%2==0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
		}
		System.out.println("no of children in EVEN group is:"+countEven);
		System.out.println("no of children in ODD group is:"+countOdd);
	}

}
