public class AverageArray{
	public static void main(String[]args){
		//sorting Arrays of different ages
		int ages[]={9,29,48,36,57,73,99,16,5,64};
		int Avg, sum=0;
		int length=ages.length;
		for(int age : ages){
			sum +=age;
		}
		//to calculate avg by dividing sum by the length;
		Avg = sum/length;
		System.out.println("The Average age is:" +Avg);
	}
}