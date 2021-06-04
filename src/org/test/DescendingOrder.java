package org.test;

public class DescendingOrder
{
	public static void main(String []args)
	{
		int a[] = {11, 2, 33, 4, 55, 6};
		int temp = 0, i,j;
		for(i = 0; i < a.length; i++)
		{
			for(j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}
