/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Training;

/**
 *
 * @author sony
 */
import java.util.Scanner;
public class PrimeNumber 
{
	int a=15,b=2,flag=0,c;
	Scanner in = new Scanner(System.in);
	public void P1()
	{	
		System.out.println("Choose Your Option");
		System.out.println("1 : check number is prime or not.");
		System.out.print("2 : Check first 1000 prime number.");
		c=in.nextInt();
		switch (c)
		{
			case 1: {prime();} break;
			case 2: {Tprime();}break;
			default: System.out.print("Error");
		}
	}
	
	void Tprime()
	{
		for(a=2;a<=1000;a++)
		{
			if (a%b == 0 || (a/b) == 1)
			{
			for(b=2;b<a;b++)
			{
				if((a%b) == 0)
				{
					flag =1;
				}
			}
			if(flag == 0)
				System.out.println(a);
			flag=0;
			}
		}
	}
	
	void prime()
	{
		System.out.println("Enter the Number");
		a=in.nextInt();
		{
			for (b=2;b<a;b++)
			{
				if (a%b == 0)
				{
					flag=1;
				}
			}
			if (flag == 0)
			{
				System.out.print("prime Number: "+a);
			}
			else
			{
				System.out.print("Not a Prime Number" + a);
			}
		}
	}
	public static void main(String abc[])
	{
		new PrimeNumber().P1();
	}
}