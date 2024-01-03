package constructorDI;

public class Class2 {

    public Class2()
    {
        System.out.println("inside class2 constructor");
    }
    public String getData()
    {
        String str = "I am doing constructor injection over here";
        return str;
    }
}
