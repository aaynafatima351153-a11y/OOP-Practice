public class Product
{
  private String id;
  private String name;
  private double price;
  private int quantity;

//constructor 

 public Product(String id, String name , double price, int quantity){
}

//setter func
 public void setId(String id)
  {
    this.id=id;
 }
//getter func
 public String getId()
{
  return id;
}

 public void setName(String name)
{
  this.name=name;
}

 public String getName()
{
return name;
}

public void SetPrice(double price)
{
  this.price=price;
}

public double getPrice()
{
return price;
}

}