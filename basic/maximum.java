import java.util.*;
public class maximum{
     
	    public static void main(String args[]){
		
		  int num1 ;
		  int num2 ;
		  Scanner sh= new Scanner(System.in);
		  System.out.println("enter the first number:");
		  num1=sh.nextInt();
		  System.out.println("enter the second number:");
		  num2=sh.nextInt();
		     if (num1>num2)
		        {   
				    System.out.println(" maximum number is"+num1);
				}
			else if (num1<num2)
   
                { 
                    System.out.println("maximum number is:"+num2);
                }
            else
			   {
			         System.out.println("hello ");
			   }
			   
			   
		}
}