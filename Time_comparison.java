//Hemanta Parajuli
//Assignment 4
//Data Structures


package time;

import java.util.Date;

public class Time_comparison {

	public static void main(String[] args) {
		long n = 1000;
		long startTime = 0;
		long stopTime = 0;
		long elapsedTime = 0;
		Date current = new Date();
		System.out.println("Results of all 3 Methods: ");
		System.out.println("Value of n " + " Method A " +" Method B " +" Method C ");
        
		for(int i = 0; i < 25; i++)
		{
			System.out.print(n + "\t\t");
			current = new Date();
			startTime = current.getTime();
			//Calling methodA 
			methodA(n);
			current = new Date();
			stopTime = current.getTime();
			elapsedTime = stopTime - startTime;
			System.out.print(elapsedTime + "\t");	
			
			current = new Date();
			startTime = current.getTime();
			//Calling methodB
			methodB(n);
			current = new Date();
			stopTime = current.getTime();
			elapsedTime = stopTime - startTime;
			System.out.print(elapsedTime + "\t  ");	
			
			current = new Date();
			startTime = current.getTime();
			//Calling methodC
			methodC(n);
			current = new Date();
			stopTime = current.getTime();
			elapsedTime = stopTime - startTime;
			System.out.println(elapsedTime);
			n = n + 1000;
				
		}

}
	//Creating methodA
		public static void methodA(long n)
		{
			long sum1 = 0;
			for(long i = 1; i <= n; i++)
			{
				sum1 = sum1 + i;
			}
			
		}
		
		//Creating methodB
		public static void methodB(long n)
		{
			long sum2 = 0;
			for (long i = 1; i <= n; i++)
			{
				for(long j = 1; j <= i; j++)
				{
					sum2 = sum2 + 1;
				}
			}
			
		}
		
		//MethodC
		public static void methodC(long n)
		{
			long sum = n * (n + 1) / 2;
			
		}
}