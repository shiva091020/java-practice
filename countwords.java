public class countwords{
	public static void main(String[]args){
		String words ="Honey phani tanush chaitu saideep navadeep";
		int countwords=words.split("\\s").length;
		System.out.println(countwords);
	}
}