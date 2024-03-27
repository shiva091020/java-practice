class test{      // AIOB Exception
    public static void main(String[] args){
	  int[] eIds={104,106,109,402};
	  String[] enames={"shiva","fouqiya","sai","priya"};
	  System.out.println(enames[2]);
	  System.out.println(enames[3]);
	  try{
	  System.out.print(eIds[5]);
	  }
	  catch(Exception e){
	  System.out.println(eIds[2]);	
      System.out.println(enames[1]);
      System.out.println(enames[0]);	  
	  }
	}
}