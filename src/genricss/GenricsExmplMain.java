package genricss;

public class GenricsExmplMain {
 public static void main(String[] args) {
	 GenricsExmpl<Integer> i=new GenricsExmpl<Integer>();
	 i.add(2);
	 System.out.println(i.get());
  }
}
