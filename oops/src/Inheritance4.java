class Vehicle// this is a parrent class                      SUPER KEYWORD TOPIC - 1 (CONTURUCTOR LEVEL SUPER USED)
{
    String name;
    int model;
    int speed;
    void display1(int speed) // display method
    {
        System.out.println("The speed is : "+speed);
    }
}
class Which extends Vehicle // sub class or child class
{
    Which()
    {
        name = "Rolsroyals";
        model = 2020;
        speed = 200;
    }
    void display() // display method
    {
        super.display1(super.speed); // here this calls the display from parrent class with parameter
        System.out.println("The Name is : "+name);
    }
}
public class Inheritance4 // main class
{
    public static void main(String[] args)
    {
        Which obj = new Which();
        obj.display();
    }
}
