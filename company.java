class company{
 String emp;
 String company_name;
  company(String emp,String company_name){
   this.emp=emp;
   this. company_name=company_name;
  }
   public static void main(String[] orgs){
     company c1=new company("shiva","prostack");
	    System.out.println(c1.emp);
		System.out.println(c1.company_name);
   }
}   