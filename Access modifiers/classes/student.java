class student{
   int std_Id;
   String std_name;
   student(int std_Id,String std_name){
   this.std_Id=std_Id;
   this.std_name=std_name;
   }
    public static void main(String[] orgs){
      student s1=new student(102,"shiva");
	  System.out.println(s1.std_Id);
	   System.out.println(s1.std_name);
	   student s2=new student(122,"sai");
	  System.out.println(s2.std_Id);
	   System.out.println(s2.std_name);
	    student s3=new student(143,"fouqiya");
	  System.out.println(s3.std_Id);
	   System.out.println(s3.std_name);
  }
}
//multiple values using constructor
 