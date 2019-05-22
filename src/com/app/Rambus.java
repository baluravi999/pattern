package com.app;

public class Rambus {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		for(int j=i;j<=4;j++){
			System.out.print(" ");
		}
		for(int k=i;k<=2*i-1;k++){
			System.out.print("*"+" ");
		}
	System.out.println("");
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<2*i-1;j++)
		{
			System.out.print(" ");
		}
		for(int k=5;k>=i;k--)
		{
			System.out.print("*"+" ");
		}
		
	
   System.out.println(" ");
  }
}
}
