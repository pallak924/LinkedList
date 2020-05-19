package com;

public class PrintSeries {

	public static void main(String[] args) {
		
		printSeries();

	}
public static void printSeries()
{
	int j=1;
	
	for(int i=2;i<100;) 
	{
		if(i==2)System.out.print(2+" ");
		
		
		if(j%3==0)
		{
			i=i+20;
			System.out.print(i+" ");
			j++;
		}
		
		else
		{ 
			i=i+2;
			System.out.print(i+" ");
			
			j++;
		}
	}
}
}
