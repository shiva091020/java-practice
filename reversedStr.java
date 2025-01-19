public class reversedStr{ 
	public static void main(String[] args){
		String OriginalStr="shiva";
		String reversedStr="";
		for(int i=0;i<OriginalStr.length();++i){
			reversedStr=OriginalStr.charAt(i)+reversedStr;
		}
		System.out.println("reversedStr:"+reversedStr);	
	}
}
// reverse a String