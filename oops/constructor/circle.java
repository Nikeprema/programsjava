class cir{

              int radius;
			  
			  
			  
		void area(){

              double area = Math.PI * (radius * radius);
           
              System.out.println("the area of circle is "+area);

                 }
        void circumference(){
         
             double circumference = Math.PI * 2  * radius;
         
              System.out.println("the circumference of circle is "+circumference);

    }

}	
			  
			  
			  
		public class circle{
		
		                          public static void main(String args[]){
								  
								  cir n=new cir();
								  
								  n.radius=3;
								  
								  n.area();
								  
								  n.circumference();
								  
							}

}							
								  
								 