
class Blood
{
    private String name;  // use private field to encapsulate data
    private int age;// use private field to encapsulate data
    private String type;// use private field to encapsulate data
    Blood() // Default constructor // this will automatically allocate values when value is not given
    {
        name = "null";
        age = 0;
        type = "Null";
    }
    public void setData(String n,int a,String t) // setter method to access the properties
    {
        this.name = n; // only methods can access the encapculated field (that method should be called from main method)
        this.age =a;
        this.type = t;
    }
    public String getData() // getter method to retrive the data using not - void
    {
       return "Name : "+name+" Age : "+age+" Type : "+type;
    }
}
public class encapsulation
{
    public static void main(String[] args)
    {
        Blood obj = new Blood();
        String name = "Madhan";
        int age = 20;
        String type = "O+";
        obj.setData(name,age,type);
        System.out.println(obj.getData());
    }
}
