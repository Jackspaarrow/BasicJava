package com.java.project;

public class Binary 
{
	public static void main(String[] args) 
	{
		int a = 1110;
		int b = a;
		int c;
		int count = 0;
		int count1 = 0;
		while(a>0)
		{
			c = a%10;
			a = a/10;
			if(c == 0 || c==1)
			{
				count ++;
			}
			else
			{
				count1 ++;
			}
		}
		if(count1 == 0)
		{
			System.out.println(b+" :this number is binary");
		}
		else
		{
			System.out.println("this number is not binary");
		}

	}

}
