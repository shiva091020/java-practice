public class Finalone {
	final int x=9;
	final int y=29;
	public static void main(String[]args){
		Final myObj=new Final();
		myObj.x=10;
		myObj.y=2;
		System.out.println(myObj.x);
		System.out.println(myObj.y);
	}
}
// generate an error:cannot assign a value for final variables	