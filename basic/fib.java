import java.util.*;
public class fib{
   
                     public static void main(String args[]){
					   
					   Scanner sc =new Scanner(System.in);
					   System.out.println("enter the number");
					   int a=sc.nextInt();
					     
						 int num1=0;
                         int num2=1; 
				         int num3=1;
                         
                        for(int i=1;i<a;i++)
                         {

                           
                           
                           num1=num2;
                           num2=num3;
						   num3=num1+num2;
						   
                         System.out.println(num1);
						 
						 }
						  
						 
				}
				}
                         						 
						  
						