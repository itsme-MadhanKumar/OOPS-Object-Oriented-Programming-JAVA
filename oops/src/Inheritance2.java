
class Car1 // this is a parrent class                      SUPER KEYWORD TOPIC - 1 (METHOD LEVEL SUPER USED)
{
    String name;
    int speed;
    int seats;
    int milage;
    Car1() // default constructor
    {
        name = "Null";
        speed = 0;
        seats = 0;
        milage = 0;
    }
    public void display() // public displaying method
    {
        System.out.println("Name : "+name+"Speed : "+speed+" Seats : "+" milage : "+milage);
    }
}
class Model1 extends Car1 // this is a child class
{
    public void display() // public displaying method
    {
        super.display();
        System.out.println("Name : "+name+"Speed : "+speed+" Seats : "+" milage : "+milage);
    }
}
public class Inheritance2
{
    public static void main(String[] args)
    {
        Model1 obj = new Model1(); // creating obj for sub-class - calls- parrent class
        obj.display();
    }
}
// without super keyword the method automatically calls the child class only
// if we use super.display() in 25 th line this will goes to parent class display and display it