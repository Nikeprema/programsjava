class pair<n,s,r>{
	
	n first;
	s second;
	r third;
	
	
	pair(n first,s second,r third){
		
		this.first=first;
		this.second=second;
		this.third=third;
		
	}
	

	 public void run(){
		
		System.out.println("first  "+this.first+"  second "+this.second+"  third  "+this.third);
		
	}
	
    	
}
		
		
	
	    

public class genrics {

    public static void main(String[] args) {
		
		pair<String,Integer,Double> p1=new pair<>("nithisa",22,15.1);
		pair<Character,Float,Boolean> p2=new pair<>('s',10.44f,true);
		
		p1.run();
		p2.run();
	}
	
}
        
		   

					
					