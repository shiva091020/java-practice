class insufficientfundException extends Exception{
	insufficientfundException(String msg){
	super(msg);
	}
}
class Account{
	public static void withdrawal(int ammount){
	int bal=500;
	if(bal<ammount){
	throw new insufficientfundException("less bal!");
	}
	else{
	System.out.println("enjoy");
	}
	}
	public static void main(String[] args){
	withdrawal(1500);
	System.out.println("ge");
	}
}