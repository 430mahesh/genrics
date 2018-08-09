package genricss;

public class CustomerInfo {
   private Integer id,age,amount;
   private String name;
  public Integer getId() {
	  return id;
  }
  public void setId(Integer id) {
	  this.id = id;
  }
  public Integer getAge() {
	 return age;
   }
    public void setAge(Integer age) {
	  this.age = age;
   }
    public Integer getAmount() {
	  return amount;
   }
    public void setAmount(Integer amount) {
	  this.amount = amount;
   }
public String getName() {
	return name;
  }
    public void setName(String name) {
    	this.name = name;
  }
@Override
    public String toString() {
	 return "CustomerInfo [id=" + id + ", age=" + age + ", amount=" + amount + ", name=" + name + "]";
  }
   
}
