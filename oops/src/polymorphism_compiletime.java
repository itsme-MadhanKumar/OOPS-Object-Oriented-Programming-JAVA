class Calculator // Poly - Many Morph - Form  = Many Form
{
    public void add(int n1,int n2) // method add is declared with 2 parameter
    {
        System.out.println(n1+n2);
    }
    public void add(int n1,int n2,int n3)// method add is declared with 3 parameter
    {
        System.out.println(n1+n2+n3);
    }
}
public class polymorphism_compiletime
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        obj.add(12,33);
        obj.add(12,13,14);
        //based on the parameter we insert into the obj it will work
        // this is called as METHOD OVER LOADING
    }
}
