class staf{

            private String name;
			private String sub;
			private int salary;
			
			staf(String name,String sub,int salary){
				
				this.name=name;
				this.sub=sub;
				this.salary=salary;
				
			}
			 
			 
			 
			 public String getname(){
				 return name;
				 
			 }
			 
			 public void setname(String name){
				 
				 this.name=name;
			 }
			 
			 public String getsub(){
				 
				 return sub;
				 
			 }
			 
			 public void setsub(String sub){
				 
				 this.sub=sub;
				 
			 }
			 
			 public int getsalary(){
				 
				 return salary;
				 
			 }
			 
			 
			 public void setsalary(int salary){
			 
			    this.salary=salary;
				
}


     		 
			public void run(){
			 
			 System.out.println(" name: "+this.name);
			 System.out.println(" sub:  "+this.sub);
			 System.out.println(" salary: "+this.salary);
			 
			 
			 }
}
		 
			 
			 public class school{
			 
			                    public static void main (String args[]){
									
								
									
									
								System.out.println("staff details");
								
								staf n1=new staf("nithis","cs",40000);
								staf n2=new staf("sanjeev","eng",2000);
								
								
								n1.run();
								n2.run();
							
								
								
								
								
								
								}
								
			 }		
								
			 
			 
			 