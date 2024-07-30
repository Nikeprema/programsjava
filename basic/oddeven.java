import java.util.*;
public class oddeven{
     
	    public static void main(String args[]){
		
		  int num ;
		  Scanner sh= new Scanner(System.in);
		  System.out.println("enter the number:");
		  num=sh.nextInt();
		  
		  if(num %5==0)
		     
			   {
			      System.out.println(num+"it is odd number");
			    }
				
	    else
		     
			  { 
			   System.out.println(num+"it is even number");
			   }
    }
	
	}