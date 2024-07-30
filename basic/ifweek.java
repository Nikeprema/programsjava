  import java.util.*;
  public class ifweek{
  
       public static void main(String args[]){
	   
	      int day ;
		  Scanner hi= new Scanner(System.in);
		  System.out.println("enter the value:");
		  day=hi.nextInt();
		  
		  
		  
		  if(day==0)
		   {
			  System.out.println("today is Sunday"+day);
		   }
		  
		 else  if (day==1)
		    {
		      System.out.println("today is Monday"+day);
		   
		    }
		
         else if(day==2)
           
		     {	
			 
		       System.out.println("today is Tuesday"+day); 
			 }
			 
		else if (day==3)
		    {
				System.out.println("today is Wednesday"+day); 
			}
        
        else if (day==4)
		   {
                System.out.println(day+"today is Thusday"+day);	
		   }
         else if(day==5)
		   {
                System.out.println("today is Friday"+day);			   
		   }		 
		  else
		     {
		        System.out.println("it was not correct"+day);
			
			 }
			
			
		}
		}