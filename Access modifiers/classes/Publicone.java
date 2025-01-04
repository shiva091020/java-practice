public class Publicone{
	//create public method
	public void mypublicMethod(){
		System.out.println("public method must be called with creating objects");
	}
	public static void main(String[]args){
			Publicone myObj=new Publicone();
			myObj.mypublicMethod();
	}
}	