abstract class Calculators
{
    int n1 ;
    int n2;
    Calculators()
    {
        n1 = 0;
        n2 = 0;
    }
    abstract void calculate();
}
class sum extends Calculators
{
    private final int n1;
    private final int n2;
    sum(int n1,int n2)
    {
        this.n1 =n1;
        this.n2 =n2;
    }
    void calculate()
    {
        System.out.println("Sum : "+(n1+n2));
    }
}
class sub extends Calculator
{
    private final int n1;
    private final int n2;
    sub(int n1,int n2)
    {
        this.n1 =n1;
        this.n2 =n2;
    }
    void calculate()
    {
        System.out.println("Sub : "+(n1-n2));
    }
}
class mul extends Calculators
{
    private final int n1;
    private final int n2;
    mul(int n1,int n2)
    {
        this.n1 =n1;
        this.n2 =n2;
    }
    void calculate()
    {
        System.out.println("Mul : "+(n1*n2));
    }
}
class div extends Calculators
{
    private final int n1;
    private final int n2;
    div(int n1,int n2)
    {
        this.n1 =n1;
        this.n2 =n2;
    }
    void calculate()
    {
        System.out.println("Div : "+(n1/n2));
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        int n1 = 2;int n2 = 3;
        sum obj1 = new sum(n1,n2);
        sub obj2 = new sub(n1,n2);
        mul obj3  = new mul(n1,n2);
        div obj4 = new div(n1,n2);
        obj1.calculate();
        obj2.calculate();
        obj3.calculate();
        obj4.calculate();
    }
}