public abstract class user{
         public  abstract void emp_bal();
}
  class employee extends user{
        private int emp_id;
		private String emp_name;
		private double emp_salary;
    public  int getemp_id(){         
          return emp_id;
	}
	public void setemp_id (int emp_id){
            this.emp_id=emp_id;
	}	
    public  String getemp_name(){
          return emp_name;
	}
	public void setemp_name (String emp_name){
            this.emp_name=emp_name;
	}
	 public  double getemp_salary(){
          return emp_salary;
	}
	public void setemp_salary (double emp_salary){
            this.emp_salary=emp_salary;
	}
	public void emp_bal(){
	}
}
class contract_emp extends employee{

	   private int emp_expenses;
	  
	   public int getemp_expenses(){
		   return emp_expenses;
	   }
       public void setemp_expenses(int emp_expenses){
           this.emp_expenses=emp_expenses;
       }		   
	  public void emp_bal(){
		 double emp_bal=this.getemp_salary()-this.getemp_expenses();
         System.out.println(this.getemp_name()+"emp_bal is:"+emp_bal);		 
	  }
}
class permanent_emp extends employee{
	 
		   private int emp_expenses;
	  
	   public int getemp_expenses(){
		   return emp_expenses;
	   }
       public void setemp_expenses(int emp_expenses){
           this.emp_expenses=emp_expenses;
       }		   
	  public void emp_bal(){
		 double emp_bal=this.getemp_salary()-this.getemp_expenses();
         System.out.println(this.getemp_name()+"emp_bal is:"+emp_bal);		 
	  }
}		 
class learn{
	public static void main(String[] orgs){
		 contract_emp e1=new contract_emp();
		  e1.setemp_id(109);
		  e1.setemp_name("ram");
		  e1.setemp_salary(20000);
		  e1.setemp_expenses(4000);
		  e1.emp_bal();
		  permanent_emp e2=new permanent_emp();
	       e2.setemp_id(209);
		  e2.setemp_name("shiva");
		  e2.setemp_salary(35000);
		  e2.setemp_expenses(10000);
		  e2.emp_bal();
	}
}



