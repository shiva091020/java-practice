import java.util.Arrays;
public class sortArray{
	public static void main(String[]args){
		String[] Mobiles={"Iqoo Z9","vivo","oneplus","realme","samsung","iphone","motarola"};
		//sorting mobiles using Arrays.sort
		Arrays.sort(Mobiles);
		//using foreach loop
		for(String i : Mobiles){
			System.out.println(i);
		}
		
	}
}