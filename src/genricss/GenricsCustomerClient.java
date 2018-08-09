package genricss;

import java.util.ArrayList;
import java.util.List;

public class GenricsCustomerClient {
  public static void main(String[] args) {
	  GenricsCustomerClass<Integer,Double> gen=new GenricsCustomerClass<Integer,Double>();
	   gen.setId(100);
	   gen.setAge(25);
	   gen.setAmount(30000);
	   

	    List<Number> al=new ArrayList<Number>();
	      al.add(gen.getId());
	      al.add(gen.getAge());
	      al.add(gen.getAmount());
	      
	      gen.data(al);
	      
	    ArrayList<String> li=new ArrayList<String>();
	     li.add("mahesh");
	     li.add("rajesh");
	     li.add("akkil");
	     System.out.println(li);
	     
  }
}
