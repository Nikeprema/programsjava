class details{

           String name;
		   int age;
		   
		   
		   
		   details(){
			   
			   System.out.println("no args");
		   }
		   
		   
		   details(String name,int age){
			   System.out.println(" args");
			   
			   this.name=name;
			   this.age=age;
			   
		   }
			   
			   
		   
		   
		   
		   public void run(){
		   
		   System.out.print("name "+this.name+" age "+this.age);
		   
		   
		   
		   }
		   
}
		   
		   public class person{  
		                
						        public static void main (String args[]){
								
								details n=new details();
								
								n.name="sanjev";
								n.age=22;
								
								n.run();
								
								
								details n1=new details("niki",22);
								n1.run();
								
								}
								
								
								}
		   
		   