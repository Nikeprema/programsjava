class rect{

          int length;
		  int width;
		  
		  
		  
		  void area(){
		  
		    int area = this.length * this.width;
			
			System.out.println("the area of rectangle : "+area);
			
			}
			
			
		 void perimetter(){
		 
		  int perimetter = 2 * (this.length + this.width);
		  
		  System.out.println("the perimetter of rectangle is  : "+perimetter);
		  
		  }
		  
	 }
		 
		  
public class userect{
                        public static void main(String args[]){
						
						rect n=new rect();
						
						n.length=40;
						n.width=20;
						
						n.area();
						n.perimetter();
						
						}
						
						
			}			
						
						
		  
		  

                           