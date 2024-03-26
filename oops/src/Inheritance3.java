
class Car2 // this is a parrent class                      SUPER KEYWORD TOPIC - 1 (VARIABLE LEVEN SUPER USED)
{
    String name;
    int speed;
    int seats;
    int milage;
    Car2() // default constructor
    {
        name = "Benzz";
        speed = 500;
        seats = 2;
        milage = 50;
    }
    Car2(String n,int s,int seat,int m)
    {
        this.name = n;
        this.speed = s;
        this.seats =seat;
        this.milage = m;
    }
    public void display() // public displaying method
    {
        System.out.println("Name : "+name+" Speed : "+speed+" Seats : "+" milage : "+milage);
    }
}
class Model2 extends Car2 // this is a child class
{
    String name = "Audi";
    public void display() // public displaying method
    {
        super.display();
        System.out.println("Name : "+super.name+" Speed : "+speed+" Seats : "+" milage : "+milage); //  --> here i used super.name to get name from parrent class
    }
}
public class Inheritance3
{
    public static void main(String[] args)
    {
        Car2 obj1 = new Car2("Benzz",100,2,40);
        Model2 obj = new Model2(); // creating obj for sub-class - calls- parrent class
        obj.display();
    }
}
// without super keyword the method automatically calls the child class only