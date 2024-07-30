class iob{

           private int accounnum;
		   private double bal;
		   
		   
		   public int getaccounnum(){
		   
		    return accounnum;
			
			}
			
			
			public void   setaccounnum(int accounnum){
			
			  this.accounnum=accounnum;
			  
			  }
			  
			  
			public double getbal(){

              return bal;
             }			  
			
		   
		   
		   
		   public void setbal(double bal){
		   
		     this.bal=bal;
		   
}
}
		   
		   
		   
		   
public class bank{

                     public static void main(String args[]){
					 
					 iob n=new iob();
					 
					 n.setaccounnum(121333);
					 n.setbal(2000.44);
					 
					 int accounnum=n.getaccounnum();
					 double bal=n.getbal();
					 
					 System.out.println("account number :"+accounnum);
					 System.out.println("balance is :"+bal);
					 
					 }
					 
					 }
					 
                   		   