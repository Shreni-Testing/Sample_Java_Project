package org.test;

public class PalindromesFrom1to1000 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 1; i <= 1000; i++)
		{
			int temp = i;
			int rev = 0, rem = 0;
			while(temp>0)
			{
				rem = temp%10;
				rev = (rev*10)+rem;
				temp = temp/10;
			}
			if(rev == i)
			{
				System.out.println(rev);
				count++;
			}
		}
		System.out.println("Number of palindromes from 1 to 1000 is "+count);
	}
}
