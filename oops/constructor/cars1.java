
class niki {
    String color;
    int wheel ;
    String name;
	
	
	niki(String color,int wheel,String name){
		
		System.out.println("args");
		this.color=color;
		this.wheel=wheel;
		this.name=name;
		
	}
	
	  public void run() {
        System.out.println("color: " + this.color + " wheel: " + this.wheel + " name: " + this.name);
    }
}
	
class car extends niki{
		 
		   String type;
	
	 car(String color,int wheel,String name,String type){
		
		super(color,wheel,name);
		
		this.color=color;
		this.wheel=wheel;
		this.name=name;
			
		this.type=type;
		
	 }
	
	  public void run() {
        System.out.println("color: " + this.color + " wheel: " + this.wheel + " name: " + this.name + "type: "+type);
    }
	
 }
	
 

public class cars1 {
    public static void main(String[] args) {
        niki c = new niki("red",4,"ferrari");
		
		c.run();
		
		car c1=new car("blue",5,"ferrari","racing");
		
		
		c1.run();
		
		
        
        
    }
}
