import java.util.*;
public class arr1{
   
                       public static void main(String args []){
					   
					   Scanner in= new Scanner(System.in);
					   System.out.println("enter the number");
					   int n=in.nextInt();
					   
					   
					 
                       
                        int[] a= new int[n];
						
						int i;
						int sum=0;
						
						for(i=0;i< n;i++){
							System.out.println(i);
							a[i] = i;
						}
						
						
						for( i=0;i<a.length;i++)
						
						{
							
							 
							 sum=sum+a[i];
						
                          
						  
						}
                          	System.out.println("total "+sum);					  
							
              }
        }			  
					  