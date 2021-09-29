package com.java.project;

public class LargeAndSmall 
{
	public static void main(String[] args) 
	{
		int	a[] = {10,33,23,22,63};
		int temp = 0;
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	//	a[] = {10,22,23,33,63};
		int k = 1, l = 0,s = 0;
			
			s = k -1;
			System.out.println("second Smallest value : "+a[s]);
			l = a.length - k;
			System.out.println("Second Biggest value :" +a[l]);

	}
}


