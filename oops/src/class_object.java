class Father
{
    String name;
    int age;
    String work;
    Father()//default constructor
    {
        name = "Boopathy";
        age = 55;
        work = "MECHANIC";
    }
    void display()
    {
        System.out.println(name+" "+age+" "+work);
    }
}
public class class_object
{
    public static void main(String[] args)
    {
        Father obj = new Father();
        obj.display();
    }
}