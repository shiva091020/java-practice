 interface test{
      public abstract void m1();
}
class testone implements test{
      public void m1(){
		  System.out.println("Shiva");
	  }
	 
	 public static void main(String[] args){
		 test t1=new testone();
	   t1.m1();
	 }
}