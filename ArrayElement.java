public class ArrayElement{
	public static void main(String []args){
		int[] myArray={3,31,21,26,2,13,1};
		int sum=9;
		int i;
		for(i=0;i<myArray.length;++i){
			sum +=myArray[i];
		}
		System.out.println("the sum is:"+sum);
	}
}