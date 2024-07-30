enum type{
   
          ORENGE("O"),APPLE("A"),MANGO("M");
		  
		  private String niki;
		  
		  type(String san){
			  
			  niki=san;
			  
		  }
		  
		  public String getNiki(){
			  
			  return niki;
			  
		  }
		  
		  }

public class fruit{
 
                   public static void main(String args[]){
				   
				   type f1=type.ORENGE;
				   type f2=type.APPLE;
				   type f3=type.MANGO;
				   
				   
				   System.out.println(f1);
				    System.out.println(f1.getNiki());
				   
				   System.out.println(f2);
				   System.out.println(f3);	
					
				   
				   }
				   
				   }
				   
		  