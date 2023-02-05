package Linga;

import java.util.*;

public class practise1{
	public static void main(String args []) {
	String s1="the QUICK BROWN FOX JUMPS OVER LAZY DOG";
	String s3="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char[] c3=s3.toCharArray();
	char[] c2=new char[26];
	s1=s1.replace(" ", "").toUpperCase();
	char[] c1=s1.toCharArray();
	for(int i=0;i<c1.length;i++) {
		int j;
		j=c1[i]-65;
		c2[j]=c1[i];
	}
	for(char a:c3) {
		System.out.print(a);
	}
	System.out.println();
	for(char b:c2)
	{
		System.out.print(b);
	}
	if(Arrays.equals(c3,c2)) 
		System.out.println("given string is pangram");
	else
		System.out.println("given string is not pangram");
	
	
}
		}
