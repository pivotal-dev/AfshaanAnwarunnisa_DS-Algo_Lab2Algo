package com.afshaan.traveller;
import java.util.*;
public class MinNoOfNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int n = sc.nextInt();
		System.out.println("enter the currency denominations value");
		int[] currency = new int[n];
		for(int i=0;i<n;i++)
			 currency[i]=sc.nextInt();
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		
		int[] count = new int[n];
		insertionSort(currency);

			for(int j = n-1 ; j>=0  && amount>0 ;j--) {
				if(amount>=currency[j]){
					count[j]++;
					amount-= currency[j];
				}
				
				if(amount>=currency[j]) // Check if the same denomination can be reused
					j++;
			}
		
		displayResults(currency,count,n);
		sc.close();

	}
	
	public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    } 
	
	public static void displayResults(int currency[] , int count[] , int n)
	{
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i =n-1 ;i>=0;i--)
			if(count[i]>0)
				System.out.println(currency[i]+":"+count[i]);

	}

}
