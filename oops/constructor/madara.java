class obito{
    String color; 
    int wheel ;
    String name ;
	
	//no args constructor
	obito(){
		System.out.println("No args constructor");
	}
	
	//args constructor
	obito(String colour, int wheel, String name){
		System.out.println("args constructor");
		this.color = colour;
		this.wheel = wheel;
		this.name = name;
	}

    public void run() {
        System.out.println("color: " + this.color + ", wheel: " + this.wheel + ", name: " + this.name);
    }
}

public class madara {
	  
	    public static void main(String[] args){
			obito d = new obito();
			d.color = "red";
			d.wheel = 4;
			d.name = "car";
			d.run();
			
			obito d2 = new obito("purple",8,"truck");
			d2.run();
       }
}
