package curso;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	Locale.setDefault(Locale.US);
	
	int n = sc.nextInt();
	int x = n;
	
	int in = 0;
	int out = 0;
	
	for (int i = 1; i <= x; i++ ) 
	{
		int num = sc.nextInt();
		
		if (num >=10 && num <= 20) 
		{
			in++;
		}
		else {
			out++;
		}
		
		}
	
	System.out.println(in + " in");	
	System.out.println(out + " out");	
		
	sc.close();

}

}