import java.util.ArrayList;
import java.util.Iterator;
class Test{
  public static void main(String[] args){
   ArrayList<String> ids=new ArrayList<String>();
     ids.add("9");
	 ids.add("007");
	 ids.add("26");
	 ids.add("109");
	 System.out.println(ids);
   ArrayList<String> a2=new ArrayList<String>();
     a2.add("shiva");
     a2.add("sai");
	 a2.add("raju");
     a2.add("kanna");
      System.out.println(a2);
      ids.addAll(a2);
      System.out.println(ids.isEmpty());	
		System.out.println(ids.size());
		System.out.println(ids.removeAll(a2));
		System.out.println(ids.remove("109"));
		 Iterator itr = ids.iterator();
			while(itr.hasNext()){
			System.out.println(itr.next());	
			for(String id:ids){
			System.out.println(id);		
			}
		}
  }
}