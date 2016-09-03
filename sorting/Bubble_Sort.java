import java.util.Scanner;
public class Bubble_Sort
{
	public static void main(String[] args)
	{
		Scanner _userInput = new Scanner(System.in);
		System.out.println("enter the number of numbers");
		int n = _userInput.nextInt();
		 
		double arr[] = new double[n] ;
		 
		for(int i=0; i<n; i++)
		{
			 arr[i]= _userInput.nextDouble();
		}
		 
		 // bubble sort logic
	
			for(int i=0; i<n-1 ;i++)
			{
				for(int j=0; j<n-i-1; j++)
				{
					double temp;
					
					if(arr[j] > arr[j+1])
					{
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
							
					}
				}
				//print after each iteration
				for(int k=0; k<n ;k++)
				 {
					 System.out.print(arr[k] + " ");	
				 }	 
				 System.out.println("");			 
			}
			
			 for(int i=0; i<n ;i++)
			 {
				 System.out.println(arr[i]);	
			 }	 
		 }
}
