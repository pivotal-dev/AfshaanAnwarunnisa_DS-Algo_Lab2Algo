package com.afshaan.paymoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array\r\n");
		int size = sc.nextInt();
		System.out.println("enter the values of array");
		int[] arr = new int[size];
		for(int i =0;i<size;i++)
			arr[i]=sc.nextInt();	
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int n =sc.nextInt();
		
		while(n>0){
			System.out.println("enter the value of target");
			int target = sc.nextInt();
			int sum=0;
			boolean flag = false;
			for(int i=0;i<size;i++){
				sum+=arr[i];
				if(sum>=target)
				{
					System.out.println("target achieved after "+(i+1)+" transactions ");
					flag = true;
					break;
				}
			}
			if(flag==false)
				System.out.println("Given target is not achieved");
			
			n--;
		}
		
		sc.close();

	}

}

