class parent{
  public void m1(){
   System.out.println("parent class m1 method");  
  }
}
class child extends parent{
   public static void main(String[] orgs){
     System.out.println("child class main method");
	  parent p1=new parent();
	  p1.m1();
   }
}
// singlelevel inheritance
