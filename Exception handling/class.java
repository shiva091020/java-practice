class Test{      //class not found exception handling
    public static void main(String[] args){
		String Ename= null;
		try{
	        System.out.println(Ename.length());
		}
		catch(Exception e){
			String Ename1="Shiva";
			System.out.println(Ename1.length());
		}
	}
}