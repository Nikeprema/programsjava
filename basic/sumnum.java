import java.util.*;
    
	 public class sumnum{
	    
		 public static void main(String args[]){
		   
		   
		   Scanner num=new Scanner(System.in);
		   System.out.println("enter the limit:");
		   int l =num.nextInt();
		   
		   int sum=0;
		   
		    for(int s=1;s<=l;s++)
		   
		     {
               sum=sum+s;
			 }
			
			System.out.println("sum of nmuber:"+sum);
	}
	 }