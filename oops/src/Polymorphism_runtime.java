import java.util.*;
class Bike
{
    public void display()
    {
        System.out.println("Bike is Displaying");
    }
}
class rx100 extends Bike
{
    public void display()
    {
        System.out.println("Bike is rx100");
    }
}
class enfield extends Bike
{
    public void display()
    {
        System.out.println("Bike is enfield");
    }
}
class splender extends Bike
{
    public void display()
    {
        System.out.println("Bike is splender");
    }
}
public class Polymorphism_runtime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Bike obj;
        int i;
        do
        {
            i = input.nextInt();
            if(i==1)
            {
                obj = new rx100();// upcasting
            }
            else if(i==2)
            {
                obj = new enfield();// upcasting
            }
            else if(i==3)
                obj = new splender();// upcasting
            else
                obj = new Bike();
            obj.display();// the object is creating while run-time based on the user input;
        }
        while(i<3);
    }
}
// upcasting = A refference variable from a parent class is pointing to the child class object