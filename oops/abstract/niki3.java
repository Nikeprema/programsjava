abstract class nigu{

    abstract void display();
	abstract void game();
	 
	 
    
	         }
			 
	 
  class redmi extends nigu{
  
    void display(){
	
	 System.out.println("redmi");
	 
	 }
	 
	void game(){
      
     System.out.println("fire games");	  
  }
  }
	 
 class vivo extends nigu{
  
    void display(){
  
      System.out.println("vivo");

    }
	void game(){
		
		System.out.println("cool games");
		
	}
	
	
	}
	
	
	
	
public class niki3{
  
                        public static void main(String args[]){
						
						nigu r=new redmi();
						
						r.display();
						r.game();
						
						nigu v=new vivo();
						
						v.display();
						v.game();
						
						nigu n=new redmi();
						
						mobilerepair.repair(n);
						
						}
						
				}		
						
						
class mobilerepair{
	  
	    public static void repair(nigu n){
			System.out.println("mobile repair");
			
			
		}
		
}
	
   
   
  
  
			 
 
  