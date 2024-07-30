import java.util.*;
public class con{
     
	               public static void main(String args[]){
				    
					 Scanner in=new Scanner(System.in);
					 System.out.println("enter the number");
					 int a=in.nextInt();
					 
					 for(int i=1;i<=a;i++)
					 {
					     if(i %11==0){
					       continue;
						 }
					      System.out.println(i);
					  
					 }
					 
				}	 
				
			}	