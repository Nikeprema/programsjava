class dog{
   
           String name;
		   String breed;
		   
		   
		   dog(String name,String breed){
			   
			   this.name=name;
			   this.breed=breed;
			   
		   }   
		   
		   
		   public void run(){
		   
		   System.out.println("name: "+this.name+" breed: "+this.breed);
		   
		   }
		   
		   
		}   
		   
		   
		   public class animal{
		   
		   
		                     public static void main(String args[]){
							 
							 dog n=new dog("manish","sanjeev");
							 
							 n.name="nithis";
							 n.breed="nikesh";
							 
							
							 n.run();
							 
							 
							 
							 
							 }
							 
							 
				}			 
		   