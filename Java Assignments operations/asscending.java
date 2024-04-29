class Test{
   public static void main(String[]args){
   int a=99;
   int b=9;
   int c=29;
   if(a<b && a<c){
   System.out.println(a);
      if(b<c){
	 System.out.println(b);
	 System.out.println(c);
	 }
	 else{
	 System.out.println(c);
	 System.out.println(b);
	 }
   
   }
   else if(b<a && b<c){
     System.out.println(b);
	   if(a<c){
	   System.out.println(a);
	   System.out.println(c);
	   }
       else{
	   System.out.println(c);
	   System.out.println(a);
	   }	   
   }
   else{
   System.out.println(c);
       if(a<b){
	   System.out.println(a);
	   System.out.println(b);
	   }
	   else{
	   System.out.println(b);
	   System.out.println(a);
	   }
   }
   }
}