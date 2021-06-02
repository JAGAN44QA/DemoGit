package Program;

public class StringClass {
	public static void main(String[] args) {
		String s="java is difficult with selenium";
		String [] sar= s.split(" ");
		for (int i = 0; i < sar.length; i++) {
			if(i%2==0)
			{
				char original[]=sar[i].toCharArray();
				char reverse[]=sar[i].toCharArray();
				for (int z=0, j = original.length-1; j >=0;z++, j--) 
				{
					reverse[z]=original[j];
					//System.out.print(reverse[i]);
				}
			sar[i]=String.valueOf(reverse);
			System.out.println(sar[i]);
			}
		}
		
		for (int i = 0; i < sar.length; i++) {
			System.out.print(sar[i]+" ");
		}
	}

}
