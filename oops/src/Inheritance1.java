class Car // this is a parent class
{
    String name;
    int speed;
    int seats;
    int mileage;
    Car() // default constructor
    {
        name = "Null";
        speed = 0;
        seats = 0;
        mileage = 0;
    }
    public void display() // public displaying method
    {
        System.out.println("Name : "+name+"Speed : "+speed+" Seats : "+" milage : "+ mileage);
    }
}
class Model extends Car // this is a child class
{
    Model()
    {
        name = "Toyoto";
        speed = 40;
        seats = 4;
        mileage = 35;
    }
}
public class Inheritance1
{
    public static void main(String[] args)
    {
        Model obj = new Model(); // creating obj for subclass - calls - parent class
        obj.display();
    }
}
