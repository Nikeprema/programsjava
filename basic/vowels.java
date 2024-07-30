import java.util.*;
public class vowels{

               public static void main(String args[]){
				   
				    char ch ;
					
				   Scanner in= new Scanner(System.in);
				   
				   System.out.println("enter the letter");
				    
					ch=in.next().charAt(0);
				 
		           				   
			 
				   
				   if(ch =='a' || ch =='e' || ch=='i' || ch =='o' || ch =='u')
				    {
				      System.out.println(ch+"it is a vowels");
					  
					}
              
                else
				{
				  System.out.println(ch+"it is a consonant");
                 
                }

			   }
}			   
					