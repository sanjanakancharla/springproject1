package constructorDI;

public class Class1 {
    private Class2 class2;

    public Class1(Class2 classarg)
    {
      class2 = classarg;
    }

    public void func()
    {
      String str = class2.getData();
      System.out.println(str);
    }

}
