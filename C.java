import java.io.*;
import java.lang.*; // supported for all language using .*

class C implements Cloneable
{
    int a;
    double b;
    public static void main(String[] args)throws CloneNotSupportedException
    {
          
      C obj = new C();
        obj.a=10;
        obj.b=10.2;
        System.out.println("a & b"+obj.a+obj.b);
        C obj1 = (C)obj.clone();
        System.out.println("a & b"+obj1.a+obj1.b);
    }
}
