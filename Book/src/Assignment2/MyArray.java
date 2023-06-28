package Assignment2;

import java.util.Scanner;

public class MyArray {
		int arr[];

		public MyArray(int n) {
			super();
			this.arr = new int[n];
		}

	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("array length is "+arr.length);
		System.out.println("Enter the value : ");
		for(int i=0;i<arr.length;i++)
		{ 
			arr[i]= sc.nextInt();
		}
	}
	public void display()
	{
		System.out.println("Display Array ");
		for(int i=0;i<arr.length;i++)
		{ 
			System.out.println(" "+arr[i]);	
	    }
		
	}
	public boolean check(int n)
	{   
	
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]==n)
				return true;
		}
		return false;
	}
		
	public int search(int n)
	{
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]==n)
				return i;
		}
		return -1;
	}
		
	public void reverse()
	{
		int temp,i,j;
		for(i=0,j=arr.length-1;i<j;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
	public int max()
	{   int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}
	public void evenno()
	{    int maxe=0,i,j;
	     
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				if(arr[i]>maxe)
				{
					maxe=arr[i];
				}	
			}	
		}
		int mine=maxe;
		for(j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				if(arr[j]<mine)
				{
					mine=arr[j];
				}	
			}	
		}
		
		System.out.println("max value : "+maxe);
		System.out.println("min value : "+mine);

	}
	
	public void sum()
	{ int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("sum of digit : "+sum);
	}
   public void findDnum()
   {  
	   
	   int cnt=0;
	   for(int i=0;i<arr.length;i++)
	   {cnt=0;
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]==arr[j])
		   {
			  cnt++;
		   }
		   }
		   if(cnt==1)
		   {
			   System.out.println("Find Dublicates value in array : "+arr[i]);
		   }
	   }
	   
	   
	   
	   
	   
	   
   }
}
