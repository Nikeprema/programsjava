class nigu{

           private String name;
		   private int wheel;
		   
		   
		   public String Getname(){
		   
		        return name;
			
			}
			
		  public void setname(String name){

                this.name=name;
			
            }	  
          public int Getwheel(){

               return wheel;
          }
          public void setwheel(int wheel){
		  
		       this.wheel=wheel;
			
			}
		   
		   
		   
}		   
		   
		   public class cars2{
		     
			                  public static void main(String args[]){
							  
							  nigu n=new nigu();
							  
							  n.setname("ferarri");
							  n.setwheel(8);
							  
							   System.out.println(n.Getname());
							   System.out.println(n.Getwheel());
							  
							  
							  }
							  
							  
							}  
							  
							  
		   
		   