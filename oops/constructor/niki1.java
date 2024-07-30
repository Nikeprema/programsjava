/*class product {
 
             String name;
			 int prize,discont;
	


 void run(){
              
                System.out.println(name+" "+prize+" "+discont);
}
				
						
}
			 
			 
public class niki1{

                public static void main(String args[]){
					
					product p1=new product();
					
					p1.name="shop";
					product p2=new product();
					p2.name="biscste";
					product p3=new product();
					p3.name="cake";
					
					
				p1.run();
                p2.run();
                p3.run();				
					
					
				}
				
} */


class product {
 
             String name;
			 int prize,discont;
	
	  
	  product(String name,int prize,int discont){
		  
		  this.name=name;
		  this.prize=prize;
		  this.discont=discont;
		  
		  
	  }
	  
	  void run(){
              
                System.out.println(this.name+" "+this.prize+" "+this.discont);
	  }
	  
	  
}

public class niki1{
   
                    public static void main(String args[]){

                    product p1=new product("shampoo",22,5);
					product p2=new product("biscste",25,3);
					product p3=new product("cake",150,12);
					
					p1.run();
					p2.run();
					p3.run();
					
					}
}			
 					
					
				