package genricss;

import java.util.List;

public class GenricsCustomerClass<E extends Number,T extends Number> {
  private E id,age,amount;
  private T name;
  
    public E getId() {
	   return id;
  }
    public void setId(E id) {
	   this.id = id;
  }
    public E getAge() {
	   return age;
  }
    public void setAge(E age) {
	   this.age = age;
	   
  }
    public E getAmount() {
	   return amount;
  }
    public void setAmount(E amount) {
	   this.amount = amount;
  }
    public T getName() {
	   return name;
  }
    public void setName(T name) {
	   this.name = name;
  }
 @Override
    public String toString() {
    	return "GenricsCustomerClass [id=" + id + ", age=" + age + ", amount=" + amount + ", name=" + name + "]";
   }

public void data(List<Number> al) {
	System.out.println(al);
	
}
 }
