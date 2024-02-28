abstract class test1{
     public abstract void m1();
	 int empid=122;
}
class test2imp extends test1{
     public void m1(){
       System.out.println(empid);		 
	 }
}	 
class learn{
   public static void main(String[] orgs){
        test2imp t1=new test2imp();
		t1.m1();
	}
}