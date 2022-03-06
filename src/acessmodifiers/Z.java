package acessmodifiers;

import acessmodifiers.P;
import acessmodifiers.N;
import acessmodifiers.M;
public class Z extends M
{
	public static void main(String[] args)
	{
		M m5=new M();
		m5.m1();
		N m6=new N();
		m6.m5();
		X m7=new X();
		System.out.println("");
		Z m10=new Z();
		m10.m1();
		m10.m4();
		System.out.println("");
		
		P p1=new P();
		p1.m9();
		// calling all variables from clas X except n4 as it is private variable
		
		System.out.println(" the vlaue is :"+m7.n5);
		System.out.println(" the vlaue is :"+m7.n6);
		System.out.println(" the vlaue is :"+m7.n7);
	}

}
