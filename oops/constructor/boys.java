class friend{
 
               String name;
			   int age;
			   
			   
			   
			   public void run(){
			   
			   System.out.println("name "+this.name+"age "+this.age);
			   			   		   
			   }
			   
			   public String toString(){
			       
                 return "frid values are{ " +
                 "name=" + this.name +
                 ", age='" + this.age + '\'' +
				 '}';
				 
				 
			   }
				 
		 public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof friend)) return false;
         friend friend= (friend) o;
         return name == friend.name && Object.equals(age, this.age);
     
     }
	  public int hashCode() {
         return Object.hash(name, age);
     }
 
	 
}
			   
		


public class boys{
 
                   public static void main(String args[]){
				   
				   friend c1=new friend();
				   		  
				   c1.name="nithis";
				   c1.age=22;
				   c1.run();
				   
				   friend c2=new friend();
				   	   
				   c2.name="sanjeev";
				   c2.age=23;
				  
				   c2.run();
				   
				   
				    System.out.println(c1);
					c1.age=44;
					c1.name="nikesh";
				    System.out.println(c2);
					
					System.out.println(c1==c2);
					System.out.println("c1 equal to"+(c1.equals(c2)));
					
					
				  
				   
				 } 


}				 
				   
				   
				   
				   