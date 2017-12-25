package array;

import java.util.ArrayList;
import java.util.List;

public class EvenNumber1to100 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even Number Display:-"+ i );
			}
		}
		
	int[] evennumber =new int[100];
	//int[] evennumber =new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	{
		for(int j=0;j<=evennumber.length;j++)
		{
			
			if(evennumber[j] % 2 == 0)
			{
				System.out.println("Even Number Display:-" + evennumber[j]);
				
			}
		}
	}
		
		

	}

}
