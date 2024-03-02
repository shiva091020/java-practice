class grandparent{
	int a=29;
  public void m1(){
  }
}
class parent extends grandparent{
	int b=9;
    public void m2(){
	}
}
class child extends parent{
   public static void main(String[] orgs){
    
	 child c1 =new child();
	 c1.m1();
	 c1.m2();
	 System.out.println(c1.a);
	 System.out.println(c1.b);
   } 
}
// multilevel inheritance