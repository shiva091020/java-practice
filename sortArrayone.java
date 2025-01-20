import java.util.Arrays;
public class sortArrayone{
	public static void main(String[]args){
		int[] numbers={78,48,36,29,9,57,2,94,62};
		Arrays.sort(numbers);
		for(int N : numbers){
			System.out.println(N);
		}
	}
}