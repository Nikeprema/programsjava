class test{
	
	int prize;

   static String name="nigu";
   
   
   public static void display(){
	   
	      System.out.println("display change");
		  
   }
   
   
	public static void run(){
       
         System.out.println("static method");
	}
}
	
	  
   
   public class statictest{
   
                          public static void main(String args[]){
						  
						  test.run();
						  test.display();
						  
						  }
						  
						   static{
   
                            System.out.println("static block");
	  }
	  
   }
						  