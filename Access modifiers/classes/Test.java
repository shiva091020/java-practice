 abstract class Test{
	public abstract void m1();
	int a=10;
	
}
class Test1 extends Test{
	public void m1(){
		System.out.println(a);
	}
}
class Demo{
	public static void main(String[] args){
		Test1 t1=new Test1();
		t1.m1();
	}
}
 
 